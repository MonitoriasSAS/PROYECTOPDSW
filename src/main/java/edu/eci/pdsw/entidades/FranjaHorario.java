/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.entidades;

import java.sql.Time;

/**
 *
 * @author MonitoriasSAS
 */
public class FranjaHorario {
    private int id;
    private Monitor monitor;
    private String dia;
    private Grupo grupo;
    private Asignatura asignatura;
    private Time inicio;
    private Time fin;
    
    public FranjaHorario(){
    }

    public FranjaHorario(Monitor monitor, String dia, Grupo grupo, Asignatura asignatura, Time inicio, Time fin) {
        this.monitor = monitor;
        this.dia = dia;
        this.grupo = grupo;
        this.asignatura = asignatura;
        this.inicio = inicio;
        this.fin = fin;
    }
    
    public FranjaHorario(int id, Monitor monitor, String dia, Grupo grupo, Asignatura asignatura, Time inicio, Time fin) {
        this.id = id;
        this.monitor = monitor;
        this.dia = dia;
        this.grupo = grupo;
        this.asignatura = asignatura;
        this.inicio = inicio;
        this.fin = fin;
    }

 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Time getInicio() {
        return inicio;
    }

    public void setInicio(Time inicio) {
        this.inicio = inicio;
    }

    public Time getFin() {
        return fin;
    }

    public void setFin(Time fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "FranjaHorario{" + "id=" + id + ", monitor=" + monitor + ", dia=" + dia + ", grupo=" + grupo + ", asignatura=" + asignatura + ", inicio=" + inicio + ", fin=" + fin + '}';
    }

    
   
    
    
}
