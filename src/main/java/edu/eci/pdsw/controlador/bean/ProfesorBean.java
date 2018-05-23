/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.controlador.bean;

import edu.eci.pdsw.controlador.managedbeans.monitoriasBean;
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
import javax.faces.bean.ManagedProperty;
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
    private int id;
    private String asi;
    private String asig;
    private int numgrupo;
    private String numasig;
    private PieChartModel pieModel1;
    private List<Monitoria> monitorias;
    
    @ManagedProperty("#{Monip}")
    private monitoriasBean monit;
    
    public ProfesorBean(){
        this.pieModel1=pieModel1;
        this.materia=materia;
        this.profesor=profesor;
    }

    public serviciosMonitoria getServicio() {
        return servicio;
    }

    public List<Monitoria> getMonitorias() {
        return monitorias;
    }

    public void setMonitorias(List<Monitoria> monitorias) {
        this.monitorias = monitorias;
    }

    public void setMonit(monitoriasBean monit) {
        this.monit = monit;
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
        servicio.consulatarMonitoria(monitoria.getIdC());
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
         
        pieModel1.set("Asistentes mi Grupo",1);
        pieModel1.set("Asistentes que no son de mi Grupo", 1);
         
        pieModel1.setTitle("Asistencia a las Monitorias");
        pieModel1.setLegendPosition("w");
    }
    //pruba asesoria de sus monitores
    
    public List<Monitoria>consultarAsesoriaMonitores(){
        this.Acceder();
       return monitorias;
    }
    public void Acceder(){
        this.monitorias=monit.crear(id);
    }
    //primera grafica
    public float consultarMonitorias(){
        return servicio.consultarMonitorias(id, asig);
    }
    //segunda grafica
     public List<Float> consultarCursos(){
         return servicio.consultarCursos(id, asig);
     }
     //tercera grafica
     public List<Float> consultarGrupos(){
         return servicio.consultarGrupos(id,asig);
     }
     //cuarta grafica
     public List<Float> consultrarTema(){
         return servicio.consultrarTema(id, asig);
     }
     //gupos del profe 
     public List<Grupo> consultarGruposProfe(){
         return servicio.consultarGruposProfe(id, asig);
     }
   
    /**public void consultaGeneral(int id,String asig) {
        porcentajesCurso=this.consultarCursos(id, asig);
        porcentajesGrupo=this.consultarGrupos(id, asig);
        procentajeAsis=this.consultarMonitorias(id, asig);
        porcentajesTema=this.consultrarTema(id, asig);
    }*/
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsi() {
        return asi;
    }

    public void setAsi(String asi) {
        this.asi = asi;
    }

    public String getAsig() {
        return asig;
    }

    public void setAsig(String asig) {
        this.asig = asig;
    }

    public int getNumgrupo() {
        return numgrupo;
    }

    public void setNumgrupo(int numgrupo) {
        this.numgrupo = numgrupo;
    }

    public String getNumasig() {
        return numasig;
    }

    public void setNumasig(String numasig) {
        this.numasig = numasig;
    }
       
}
