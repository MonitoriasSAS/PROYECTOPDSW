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
import edu.eci.pdsw.entidades.Estudiante;
import edu.eci.pdsw.entidades.Tema;

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
 
@ManagedBean(name = "beanAdmin")
@SessionScoped
public class AdministradorBean implements Serializable {
    //@ManagedProperty(value = "#{loginBean}")

    //private ShiroLoginBean seguridad;
    
    private final serviciosMonitoria moni = serviciosMonitoriaFactory.getInstance().getServiciosMonitoria();
    

    private Monitor monitor;
    private Profesor profesor;
    private Asignatura materia;
    private Semestre semestre;
    private FranjaHorario franja;
    private Grupo grupo;
    private Estudiante estudiante;
    
   
    private int carnet;
    private String periodo;
    private Date inicio;
    private Date fin;
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private int telefono;
    private String carrera;
    private int ingreso;
    private int dia;
    private String d;
    private Time ini;
    private Time fi;
    private int matriculados;
    private String name;

    
   
 
    public AdministradorBean(){
        this.periodo = periodo;
        this.inicio = inicio;
        this.fin = fin;
    }
    
    public void registrarSemestre(){
        moni.agregarSemestre(new Semestre(periodo,inicio,fin));
    }
    
    public void registrarAsignatura(){
        moni.agregarAsignatura(new Asignatura(id,nombre));
    }
    
    public void registrarProfesor(){
        moni.agregarProfesor(new Profesor(id,nombre,apellido,correo,telefono));
    }
    
    public void registrarEstudiante(){
        moni.agregarEstudiante(new Estudiante(carnet,nombre,apellido));
    }
    
    public void registrarMonitor(){
        moni.agregarMonitor(new Monitor(id,nombre,apellido,telefono,carrera,ingreso));
    }
    
    public void registrarGrupo(){
        moni.agregarGrupo(new Grupo(id,semestre,materia,profesor,matriculados));
    }
    
    public void agregarFranja(){
        moni.agregarFranjaHorario(new FranjaHorario(id,monitor,d,grupo,materia,ini,fi));
    }
    
    public void agregarTema(){
        moni.agregarTema(new Tema(name,materia));
    }
    
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
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

    public Asignatura getMateria() {
        return materia;
    }

    public void setMateria(Asignatura materia) {
        this.materia = materia;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public FranjaHorario getFranja() {
        return franja;
    }

    public void setFranja(FranjaHorario franja) {
        this.franja = franja;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public Time getIni() {
        return ini;
    }

    public void setIni(Time ini) {
        this.ini = ini;
    }

    public Time getFi() {
        return fi;
    }

    public void setFi(Time fi) {
        this.fi = fi;
    }
   
    
    


   /**public ShiroLoginBean getSeguridad() {
    public serviciosMonitoria getMoni() {
        return moni;
    }

    public void setMoni(serviciosMonitoria moni) {
        this.moni = moni;
    }  
    
   /**
    public ShiroLoginBean getSeguridad() {
>>>>>>> 3229894408caedf601d160a996645e36677baf76
        return seguridad;
    }

    public void setSeguridad(ShiroLoginBean seguridad) {
        this.seguridad = seguridad;
    }
 
    **/
}

