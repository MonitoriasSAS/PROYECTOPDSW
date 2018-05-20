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


/**
 *
 * @author MonitoriasSAS
 */
@ManagedBean(name = "bpr")
@SessionScoped
public class ProfesorBean implements Serializable {
    
    private serviciosMonitoria servicio = serviciosMonitoriaFactory.getInstance().getServiciosMonitoria();
    private Map<String,Grupo> grupos = new HashMap<>();
    private Map<String,Monitoria> monitorias = new HashMap<>();
    private Grupo grupo;
    private Monitor monitor;
    private Profesor profesor;
    private Monitoria monitoria;
    private Asignatura materia;
    private float procentajeAsis;
    private List<Float> porcentajesCurso;
    private List<Float> porcentajesTema;
    private List<Float> porcentajesGrupo;

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
    
    public Map<String, Grupo> getGrupos() {
        return grupos;
    }

    public Map<String, Monitoria> getMonitorias() {
        return monitorias;
    }
    
    public Grupo getGrupo() {
        return grupo;
    }
   
    public Monitor getMonitor() {
        return monitor;
    }
    
    public Monitoria getMonitoria() {
        return monitoria;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setGrupo(int numero, Semestre semestre,Asignatura asignatura,Profesor profesor, int matriculados) {
        this.grupo = new Grupo(numero,semestre,asignatura,profesor,matriculados);
    }
  
    public void setMonitor(int id, String nombre, String apellido, int telefono, String carrera, int ingreso) {
        this.monitor = new Monitor(id,nombre,apellido,telefono,carrera,ingreso);
    }

    public void setMonitoria(Monitoria monitoria) {
        this.monitoria = monitoria;
    }

    public void setMateria(int id, String nombre) {
        this.materia = new Asignatura(id,nombre);
    }
     
    public void informacion(){
       
    }
    
}
