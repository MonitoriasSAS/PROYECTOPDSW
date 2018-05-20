/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.entidades;

import java.util.List;

/**
 *
 * @author MonitoriasSAS
 */
public class Estudiante {
    private int carnet;
    private String nombre;
    private String apellido;
    private List<Grupo> grupos;

    public Estudiante(int carnet, String nombre, String apellido) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
       
    }
 
    public Estudiante(){
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
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

    public List<Grupo> getMonitorias() {
        return grupos;
    }

    public void setMonitorias(List<Grupo> monitorias) {
        this.grupos = monitorias;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carnet=" + carnet + ", nombre=" + nombre + ", apellido=" + apellido + ", grupos=" + grupos + '}';
    }

   
    
}
