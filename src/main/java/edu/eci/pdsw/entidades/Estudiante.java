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

    public Estudiante(int carnet, String nombre, String apellido, List<Grupo> grupos) {
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

    @Override
    public String toString() {
        return "Estudiante{" + "carnet=" + carnet + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    

   
    
}
