/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author AsusPC
 */
public class FranjaHorario {
    private int id;
    private Monitor monitor;
    private Date fecha;
    private Grupo grupo;
    private Asignatura asignatura;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    
}
