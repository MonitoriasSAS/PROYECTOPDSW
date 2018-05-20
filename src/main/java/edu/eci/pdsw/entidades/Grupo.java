/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.entidades;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 2112076
 */
public class Grupo {
    private int numero;
    private Semestre semestre;
    private Profesor profesor;
    private Asignatura asignatura;
    private List<FranjaHorario> franjas;
    private int matriculados;
  
    public Grupo(){
    }
    public Grupo(int numero, Semestre semestre,Asignatura asignatura,Profesor profesor,int matriculados){
        this.numero=numero;
        this.asignatura=asignatura;
        this.profesor=profesor;
        this.semestre=semestre;
        this.matriculados=matriculados;
       
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

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
    
    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<FranjaHorario> getFranjas() {
        return franjas;
    }

    public void setFranjas(List<FranjaHorario> franjas) {
        this.franjas = franjas;
    }

    @Override
    public String toString() {
        return "Grupo{" + "numero=" + numero + ", semestre=" + semestre + ", profesor=" + profesor + ", asignatura=" + asignatura + ", franjas=" + franjas + ",matriculados="+ matriculados +'}';
    }
    
   
}