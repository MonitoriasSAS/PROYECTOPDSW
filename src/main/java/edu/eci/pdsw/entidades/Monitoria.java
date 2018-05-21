/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.entidades;

import java.util.Date;

/**
 *
 * @author MonitoriasSAS
 */
public class Monitoria {
    private int id;
    private String ip;
    private String observaciones;
    private Date fecha;
    private Tema tema;
    private FranjaHorario franjaHorario;
    private String profesor;
    private int idC;
    private int grupo;
    private String asignatura;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Monitoria(String ip, String observaciones, Date fecha, Tema tema, FranjaHorario franjaHorario, String profesor, int idC, int grupo, String asignatura) {
        this.ip = ip;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.tema = tema;
        this.franjaHorario = franjaHorario;
        this.profesor = profesor;
        this.idC = idC;
        this.grupo = grupo;
        this.asignatura = asignatura;
    }

    public Monitoria(int id, String ip, String observaciones, Date fecha, Tema tema, FranjaHorario franjaHorario, String profesor, int idC, int grupo, String asignatura) {
        this.id = id;
        this.ip = ip;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.tema = tema;
        this.franjaHorario = franjaHorario;
        this.profesor = profesor;
        this.idC = idC;
        this.grupo = grupo;
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Monitoria{" + "id=" + id + ", ip=" + ip + ", observaciones=" + observaciones + ", fecha=" + fecha + ", tema=" + tema + ", franjaHorario=" + franjaHorario + ", profesor=" + profesor + ", idC=" + idC + ", grupo=" + grupo + ", asignatura=" + asignatura + '}';
    }
    
    
    
    

   
   
    public void setTema( Tema tema) {
        this.tema = tema;
    }

    public  Tema getTema() {
        return tema;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public void agregarObservacion(String observaciones){
        this.observaciones=observaciones;
    }

    public FranjaHorario getFranjaHorario() {
        return franjaHorario;
    }

    public void setFranjaHorario(FranjaHorario franjaHorario) {
        this.franjaHorario = franjaHorario;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public Monitoria() {
    }
    
    

    
}
