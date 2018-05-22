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
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
 /**
 * 
 * @author MonitoriasSAS
 */

@ManagedBean(name="Monitor")
@SessionScoped

public class MonitorBean implements Serializable{
    //@ManagedProperty(value = "#{loginBean}")
    //private ShiroLoginBean seguridad;
    
    private final serviciosMonitoria moni = serviciosMonitoriaFactory.getInstance().getServiciosMonitoria();

    private Monitoria monitoria;
    private Monitor monitor;
    private Asignatura materia;
    //private Observacion observacion;
    private Tema tema;
    private String t;
    private Profesor profesor;
    private FranjaHorario horario;
    private Estudiante estudiante;
    private Grupo grupo;
    
    private int id;
    private String ip;
    private String observacion;
    private Date fecha;
    private String pro;
    private int idc;
    private int gru;
    private String mate;
    
    private int idMonitor;
    private int idEstudiante;
    
    
    public MonitorBean(){
        
    }
    
    public void Acesoria() throws ExcepcionServiciosMonitoria{
        fecha = new Date();
        String ip=null;
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
            Logger.getLogger(MonitorBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        moni.registrarMonitoria(new Monitoria(ip,observacion,fecha,moni.consultarTema(t),pro,idEstudiante, gru,mate), t);
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

     public void setMateria(String id, String nombre) {
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

    public FranjaHorario getHorario() {
        return horario;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(int carnet, String nombre, String apellido) {
        this.estudiante = new Estudiante(carnet,nombre,apellido);
    }
    
    public void setProfesor(int id, String nombre, String apellido, String correo, int telefono) {
        this.profesor = new Profesor(id,nombre,apellido,correo,telefono);
    }

    public void setHorario( Monitor monitor, String dia, Grupo grupo, Asignatura asignatura, Time inicio, Time fin) {
        this.horario = new FranjaHorario(monitor,dia,grupo,asignatura,inicio,fin);
    }
    
    public Tema getTema() {
        return tema;
    }

    public void setTema(String id, String name, Asignatura asignatura) {
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
    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public int getGru() {
        return gru;
    }

    public void setGru(int gru) {
        this.gru = gru;
    }

    public String getMate() {
        return mate;
    }

    public void setMate(String mate) {
        this.mate = mate;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
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

