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
    
}
