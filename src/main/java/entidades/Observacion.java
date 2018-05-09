/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author 2112076
 */
public class Observacion {
    private Monitor monitor;
    private int id;
    private int estudiante;
    private String observacion;

    public Observacion(Monitor monitor, int id, int estudiante, String observacion) {
        this.monitor = monitor;
        this.id = id;
        this.estudiante = estudiante;
        this.observacion = observacion;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public int getId() {
        return id;
    }

    public int getEstudiante() {
        return estudiante;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstudiante(int estudiante) {
        this.estudiante = estudiante;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "Observacion{" + "monitor=" + monitor + ", id=" + id + ", estudiante=" + estudiante + ", observacion=" + observacion + '}';
    }
    
}
