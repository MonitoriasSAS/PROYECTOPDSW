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
    //primera grafica
    public float consultarMonitorias(int id,String asi){
        return servicio.consultarMonitorias(id, asi);
    }
    //segunda grafica
     public List<Float> consultarCursos(int id, String asig){
         return servicio.consultarCursos(id, asig);
     }
     //tercera grafica
     public List<Float> consultarGrupos(int id, String numasig){
         return servicio.consultarGrupos(id,numasig);
     }
     //cuarta grafica
     public List<Float> consultrarTema(int id, int numgrupo, String numasig){
         return servicio.consultrarTema(id, numgrupo, numasig);
     }
     //gupos del profe 
     public List<Grupo> consultarGruposProfe(int id, String numasig){
         return servicio.consultarGruposProfe(id, numasig);
     }

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
     
     
}
