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
 * @author 2110540
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
    private List<Float> porcentajes;
    
    public void consultar() throws ExcepcionServiciosMonitoria{
        String mon = monitor.getNombre()+" "+monitor.getApellido();
        servicio.consulatarMonitoria(monitoria.getId());
    }

    public List<Float> getPorcentajes() {
        return porcentajes;
    }

    public void setPorcentajes(List<Float> porcentajes) {
        this.porcentajes = porcentajes;
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
    
    public serviciosMonitoria getServicio() {
        return servicio;
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

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    public void setServicio(serviciosMonitoria servicio) {
        this.servicio = servicio;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMonitoria(Monitoria monitoria) {
        this.monitoria = monitoria;
    }

    public void setMateria(Asignatura materia) {
        this.materia = materia;
    }
      
    public Profesor getProfesor(){
        return profesor;
    }
    
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    
    public void informacion(){
       
    }
    
}
