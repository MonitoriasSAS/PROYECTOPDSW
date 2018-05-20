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
import java.util.Date;
import edu.eci.pdsw.entidades.Monitor;
import edu.eci.pdsw.entidades.Asignatura;
import edu.eci.pdsw.entidades.Monitoria;
import edu.eci.pdsw.entidades.Observacion;
import edu.eci.pdsw.entidades.Tema;
import edu.eci.pdsw.entidades.Profesor;
import edu.eci.pdsw.entidades.Estudiante;
import edu.eci.pdsw.entidades.FranjaHorario;
import edu.eci.pdsw.entidades.Grupo;
import edu.eci.pdsw.logica.servicios.serviciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoriaFactory;
import edu.eci.pdsw.logica.servicios.ExcepcionServiciosMonitoria;
 /**
 * 
 * @author MonitoriasSAS
 */

@ManagedBean(name="Monitor")
@SessionScoped

public class MonitorBean implements Serializable{
    @ManagedProperty(value = "#{loginBean}")
    //private ShiroLoginBean seguridad;
    
    private final serviciosMonitoria moni = serviciosMonitoriaFactory.getInstance().getServiciosMonitoria();

    private Monitoria monitoria;
    private Monitor monitor;
    private Asignatura materia;
    private Observacion observacion;
    private Tema tema;
    private String t;
    private Profesor profesor;
    private FranjaHorario horario;
    private Estudiante estudiante;
    private Grupo grupo;
    
    
    public MonitorBean(){
        
    }
    
    public void Acesoria() throws ExcepcionServiciosMonitoria{
        moni.registrarMonitoria(monitoria, t);
    }
    
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setMateria(Asignatura materia) {
        this.materia = materia;
    }

    public serviciosMonitoria getMoni() {
        return moni;
    }

    public Monitoria getMonitoria() {
        return monitoria;
    }

    public void setMonitoria(Monitoria monitoria) {
        this.monitoria = monitoria;
    }

    public void setObservacion(Observacion observacion) {
        this.observacion = observacion;
    }

    public Observacion getObservacion() {
        return observacion;
    }
    
    public FranjaHorario getHorario() {
        return horario;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setHorario(FranjaHorario horario) {
        this.horario = horario;
    }
    
    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesro(Profesor profesor) {
        this.profesor = profesor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
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

