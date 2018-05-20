/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Prueba Shiro
package edu.eci.pdsw.controlador.managedbeans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedProperty;
//import seguridad.bean.ShiroLoginBean;
import edu.eci.pdsw.entidades.Semestre;
import edu.eci.pdsw.entidades.Profesor;
import edu.eci.pdsw.entidades.Asignatura;
import edu.eci.pdsw.entidades.Monitor;

import edu.eci.pdsw.logica.servicios.serviciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoriaFactory;
import edu.eci.pdsw.logica.servicios.ExcepcionServiciosMonitoria;


/**
 *
 * @author MonitoriasSAS
 */
 
@ManagedBean(name = "beanAdministrador", eager = true)
@SessionScoped
public class AdministradorBean implements Serializable {
    @ManagedProperty(value = "#{loginBean}")
    //private ShiroLoginBean seguridad;
    
    private final serviciosMonitoria moni = serviciosMonitoriaFactory.getInstance().getServiciosMonitoria();
    
    private Monitor monitor;
    private Profesor profesor;
    private Asignatura materia;
    private Semestre semestre;
    
    public AdministradorBean(){
        
    }
    
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setMateria(Asignatura materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public serviciosMonitoria getMoni() {
        return moni;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
   /**
    public ShiroLoginBean getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(ShiroLoginBean seguridad) {
        this.seguridad = seguridad;
    }
    */
}

