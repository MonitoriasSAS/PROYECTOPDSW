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
import edu.eci.pdsw.entidades.Semestre;
import edu.eci.pdsw.logica.servicios.serviciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoriaFactory;
import edu.eci.pdsw.logica.servicios.ExcepcionServiciosMonitoria;
import java.sql.Time;
import java.util.List;
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
    
   public void setMonitor(int id, String nombre, String apellido, int telefono, String carrera, int ingreso) {
        this.monitor = new Monitor(id,nombre,apellido,telefono,carrera,ingreso);
    }
   
    public Monitor getMonitor() {
        return monitor;
    }

    public Asignatura getMateria() {
        return materia;
    }

     public void setMateria(int id, String nombre) {
        this.materia = new Asignatura(id,nombre);
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

    public void setObservacion(Monitor monitor, int id, int estudiante, String obs) {
        this.observacion = new Observacion(monitor,id,estudiante,obs);
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

    public void setEstudiante(int carnet, String nombre, String apellido, List<Grupo> grupos) {
        this.estudiante = new Estudiante(carnet,nombre,apellido,grupos);
    }
    
    public void setProfesor(int id, String nombre, String apellido, String correo, int telefono) {
        this.profesor = new Profesor(id,nombre,apellido,correo,telefono);
    }

    public void setHorario(int id, Monitor monitor, String dia, Grupo grupo, Asignatura asignatura, Time inicio, Time fin) {
        this.horario = new FranjaHorario(id,monitor,dia,grupo,asignatura,inicio,fin);
    }
    
    public Tema getTema() {
        return tema;
    }

    public void setTema(int id, String name, Asignatura asignatura) {
        this.tema = new Tema(id,name,asignatura);
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(int numero, Semestre semestre,Asignatura asignatura,Profesor profesor,int matriculados) {
        this.grupo = new Grupo(numero,semestre,asignatura,profesor,matriculados);
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

