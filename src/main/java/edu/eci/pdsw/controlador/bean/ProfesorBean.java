/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.controlador.bean;

import java.io.Serializable;
import edu.eci.pdsw.entidades.Profesor;
import edu.eci.pdsw.entidades.Monitoria;
import edu.eci.pdsw.entidades.Asignatura;
import edu.eci.pdsw.entidades.Estudiante;
import edu.eci.pdsw.entidades.Monitor;
import edu.eci.pdsw.entidades.Grupo;
import edu.eci.pdsw.entidades.Semestre;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import edu.eci.pdsw.logica.servicios.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoriaFactory;
import org.primefaces.model.chart.PieChartModel;
import org.primefaces.event.ItemSelectEvent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;
/**
 *
 * @author MonitoriasSAS
 */
@ManagedBean(name = "bpr")
@SessionScoped
public class ProfesorBean implements Serializable {
    
    private serviciosMonitoria servicio = serviciosMonitoriaFactory.getInstance().getServiciosMonitoria();
    private Grupo grupo;
    private Monitor monitor;
    private Profesor profesor;
    private Monitoria monitoria;
    private Asignatura materia;
    private float procentajeAsis;
    private List<Float> porcentajesCurso;
    private List<Float> porcentajesTema;
    private List<Float> porcentajesGrupo;
    private PieChartModel pieModel1;
    
    public ProfesorBean(){
        this.pieModel1=pieModel1;
        this.materia=materia;
        this.profesor=profesor;
    }

    public serviciosMonitoria getServicio() {
        return servicio;
    }

    public void setServicio(serviciosMonitoria servicio) {
        this.servicio = servicio;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Monitoria getMonitoria() {
        return monitoria;
    }

    public void setMonitoria(Monitoria monitoria) {
        this.monitoria = monitoria;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setMateria(Asignatura materia) {
        this.materia = materia;
    }

    public PieChartModel getPieModel1() {
        return pieModel1;
    }

    public void setPieModel1(PieChartModel pieModel1) {
        this.pieModel1 = pieModel1;
    }

    public float getProcentajeAsis() {
        return procentajeAsis;
    }

    public void setProcentajeAsis(float procentajeAsis) {
        this.procentajeAsis = procentajeAsis;
    }

    public List<Float> getPorcentajesCurso() {
        return porcentajesCurso;
    }

    public void setPorcentajesCurso(List<Float> porcentajesCurso) {
        this.porcentajesCurso = porcentajesCurso;
    }

    public List<Float> getPorcentajesTema() {
        return porcentajesTema;
    }

    public void setPorcentajesTema(List<Float> porcentajesTema) {
        this.porcentajesTema = porcentajesTema;
    }

    public List<Float> getPorcentajesGrupo() {
        return porcentajesGrupo;
    }

    public void setPorcentajesGrupo(List<Float> porcentajesGrupo) {
        this.porcentajesGrupo = porcentajesGrupo;
    }
    
    public void consultar() throws ExcepcionServiciosMonitoria{
        String mon = monitor.getNombre()+" "+monitor.getApellido();
        servicio.consulatarMonitoria(monitoria.getId());
    }
    @PostConstruct
    public void init() {
        createPieModels();
    }
    private void createPieModels() {
        createPieModel1();
    }
    private void createPieModel1() {
        pieModel1 = new PieChartModel();
         
        pieModel1.set("Asistentes mi Grupo", servicio.consultarMonitorias(profesor.getId(), materia.getId()));
        pieModel1.set("Asistentes que no son de mi Grupo", 1-servicio.consultarMonitorias(profesor.getId(), materia.getId()));
         
        pieModel1.setTitle("Asistencia a las Monitorias");
        pieModel1.setLegendPosition("w");
    }
    public void itemSelect(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                        "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
         
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
