/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.entidades;

/**
 *
 * @author MonitoriasSAS
 */
public class Tema {
    private String id;
    private String name;
    private Asignatura asignatura;

    public Tema(){
        
    }

    public Tema(String id, String name, Asignatura asignatura) {
        this.id = id;
        this.name = name;
        this.asignatura = asignatura;
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    
    @Override
    public String toString() {
        return id;
    }
    
}
