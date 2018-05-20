/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//prueba Shiro 
package edu.eci.pdsw.controlador.managedbeans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedProperty;
//import seguridad.bean.ShiroLoginBean;
import edu.eci.pdsw.entidades.Semestre;
import edu.eci.pdsw.entidades.Profesor;
import edu.eci.pdsw.entidades.Asignatura;
import edu.eci.pdsw.entidades.FranjaHorario;
import edu.eci.pdsw.entidades.Monitoria;
import edu.eci.pdsw.entidades.Monitor;
import edu.eci.pdsw.entidades.Tema;
import edu.eci.pdsw.logica.servicios.serviciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoriaFactory;
import edu.eci.pdsw.logica.servicios.ExcepcionServiciosMonitoria;
import java.util.Date;

/**
 *
 * @author MonitoriasSAS
 */
@ManagedBean(name = "beanEstudiante")
@SessionScoped
public class EstudianteBean {
    @ManagedProperty(value = "#{loginBean}")
    //private ShiroLoginBean seguridad;
    
    private final serviciosMonitoria moni = serviciosMonitoriaFactory.getInstance().getServiciosMonitoria();
    
    private Monitor monitor;
    private Monitoria monitoria;
    private Semestre semestre;
    private Profesor profesor;
    private Asignatura materia;
    
    public EstudianteBean(){
        
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

    public void setMonitoria(Monitoria monitoria) {
        this.monitoria = monitoria;
    }
    
    public void setMonitoria(int id, String ip, String observaciones, Date fecha,  Tema tema, FranjaHorario franjaHorario, String profesor, int idC, int grupo,int asignatura) {
        this.monitoria = new Monitoria(id,ip,observaciones,fecha,tema,franjaHorario,profesor,idC,grupo,asignatura);
    }

    public void setSemestre(String periodo,Date inicio,Date fin){
        this.semestre = new Semestre(periodo,inicio,fin);
    }


    public Monitor getMonitor() {
        return monitor;
    }

    public Monitoria getMonitoria() {
        return monitoria;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public serviciosMonitoria getMoni() {
        return moni;
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
