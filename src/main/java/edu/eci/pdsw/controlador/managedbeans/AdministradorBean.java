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
import edu.eci.pdsw.logica.servicios.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.logica.servicios.impl.serviciosMonitoriaimpl;

import edu.eci.pdsw.logica.servicios.serviciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoriaFactory;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
//import org.apache.ibatis.exceptions.PersistenceException;
import org.postgresql.util.PSQLException;
import javax.persistence.PersistenceException;
import org.primefaces.PrimeFaces;
import static org.primefaces.component.contextmenu.ContextMenu.PropertyKeys.event;
import static org.primefaces.component.effect.Effect.PropertyKeys.event;
import static org.primefaces.component.inplace.Inplace.PropertyKeys.event;
import org.primefaces.component.inputtextarea.InputTextarea;
import org.primefaces.event.SelectEvent;


/**
 *
 * @author MonitoriasSAS
 */
 
@ManagedBean(name = "beanAdmin")
@SessionScoped
public class AdministradorBean implements Serializable {
    ///@ManagedProperty(value = "#{loginBean}")

    ///private ShiroLoginBean seguridad;
    
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
    private String idAsignatura;
    private String nombre;
    private String apellido;
    private String correo;
    private int telefono;
    private String carrera;
    private int ingreso;
    private int dia;
    private String d;
    private Date ini;
    private Date fi;
    private int numero;
    private int matriculados;
    private String name;
    private String idasignatura;
    private String idtema;
    
    private String message="";

    public AdministradorBean(){
        this.monitor = monitor;
        this.profesor = profesor;
        this.materia = materia;
        this.semestre = semestre;
        this.franja = franja;
        this.grupo = grupo;
        this.estudiante = estudiante;
        this.carnet = carnet;
        this.periodo = periodo;
        this.inicio = inicio;
        this.fin = fin;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.carrera = carrera;
        this.ingreso = ingreso;
        this.dia = dia;
        this.d = d;
        this.ini = ini;
        this.fi = fi;
        this.matriculados = matriculados;
        this.name = name;
        this.idtema= idtema;
        this.idasignatura=idasignatura;
        this.numero=numero;
    }
    
    public String getIdtema() {
        return idtema;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void setIdtema(String idtema) {
        this.idtema = idtema;
    }
    
    public void registrarSemestre(){
        try {
            moni.agregarSemestre(new Semestre(periodo,inicio,fin));
        } catch (ExcepcionServiciosMonitoria ex) {
            this.message="semestre existente";
            Logger.getLogger(AdministradorBean.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("lolosaldlsadlsad1");
        } catch (org.postgresql.util.PSQLException ex){
            this.message="semestre existente";
            System.out.println("lolosaldlsadlsad2");
             Logger.getLogger(AdministradorBean.class.getName()).log(Level.SEVERE, null, ex);
        }   catch (javax.persistence.PersistenceException ex){
            System.out.println("lolosaldlsadlsad3");
            facesError("Wrong password");
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void facesError(String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, message, null));
    }
    public void registrarAsignatura(){

        moni.agregarAsignatura(new Asignatura(idasignatura,nombre));
    }

    public void setIdasignatura(String idasignatura) {
        this.idasignatura = idasignatura;
    }
    public String getIdasignatura(){
        return idasignatura;
    }
    
    public void registrarProfesor(){
        moni.agregarProfesor(new Profesor(carnet,nombre,apellido,correo,telefono));
    }
    
    public void registrarEstudiante(){
        moni.agregarEstudiante(new Estudiante(id,nombre,apellido));
    }
    
    public void registrarMonitor(){
        moni.agregarMonitor(new Monitor(id,nombre,apellido,telefono,carrera,ingreso));
    }
    
    public void registrarGrupo(){
        moni.agregarGrupo(new Grupo(numero,moni.getSemestre(periodo),moni.consultarAsignatura(idasignatura),moni.consultarProfe(carnet),matriculados));
    }
    
    public void agregarFranja(){
        moni.agregarFranjaHorario(new FranjaHorario(moni.consultarMonitor(carnet),d,moni.consultarGrupo(numero, idAsignatura),moni.consultarAsignatura(idAsignatura),new Time(ini.getTime()),new Time(fi.getTime())));
    }
    
    public void agregarTema(){
        moni.agregarTema(new Tema(idtema,name,moni.consultarAsignatura(idasignatura)));
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

    public Asignatura getAsignatura(String idAsignatura) {
        return materia;
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

    public void setTelefono(int asd) {
        this.telefono = asd;
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

    public Date getIni() {
        return ini;
    }

    public void setIni(Date ini) {
        this.ini = ini;
    }

    public Date getFi() {
        return fi;
    }

    public void setFi(Date fi) {
        this.fi = fi;
    }

   public int getCarnet(){
       return carnet;
   }
   public void setCarnet(int carnet){
       this.carnet=carnet;
   }
    
    

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setMateria(Asignatura materia) {
        this.materia = materia;
    }

    public String getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(String idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public int getMatriculados() {
        return matriculados;
    }

    public void setMatriculados(int matriculados) {
        this.matriculados = matriculados;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   /**public ShiroLoginBean getSeguridad() {
    public serviciosMonitoria getMoni() {
        return moni;
    }

    public void setMoni(serviciosMonitoria moni) {
        this.moni = moni;
    }  
    
   
    public ShiroLoginBean getSeguridad() {

        return seguridad;
    }

    public void setSeguridad(ShiroLoginBean seguridad) {
        this.seguridad = seguridad;
    }
 
    **/
}

