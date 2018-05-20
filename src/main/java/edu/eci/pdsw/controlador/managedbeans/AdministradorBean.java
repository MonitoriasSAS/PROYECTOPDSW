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
import edu.eci.pdsw.entidades.FranjaHorario;
import edu.eci.pdsw.entidades.Grupo;

import edu.eci.pdsw.logica.servicios.serviciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoriaFactory;
import edu.eci.pdsw.logica.servicios.ExcepcionServiciosMonitoria;
import java.sql.Time;
import java.util.Date;

import org.primefaces.component.inputtextarea.InputTextarea;


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
    private FranjaHorario franja;
    
    public AdministradorBean(){
        
    }
    
    public FranjaHorario getFranja() {
        return franja;
    }

    public void setFranja(int id, Monitor monitor, String dia, Grupo grupo, Asignatura asignatura, Time inicio, Time fin) {
        this.franja = new FranjaHorario(id,monitor,dia,grupo,asignatura,inicio,fin);
    }
    
    public void setProfesor(int id, String nombre, String apellido, String correo, int telefono) {
        this.profesor = new Profesor(id,nombre,apellido,correo,telefono);
    }

    public void setMateria(int id, String nombre) {
        this.materia = new Asignatura(id,nombre);
    }
    
    public Profesor getProfesor() {
        return profesor;
    }

    public Asignatura getMateria() {
        return materia;
    }
    
    

    public void setSemestre(String periodo,Date inicio,Date fin){
        this.semestre = new Semestre(periodo,inicio,fin);
        moni.agregarSemestre(semestre);
        InputTextarea ita = new InputTextarea();
        
        
    }
    public void ingresarSemestre(){
        
        
        
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

    public void setMonitor(int id, String nombre, String apellido, int telefono, String carrera, int ingreso) {
        this.monitor = new Monitor(id,nombre,apellido,telefono,carrera,ingreso);
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

