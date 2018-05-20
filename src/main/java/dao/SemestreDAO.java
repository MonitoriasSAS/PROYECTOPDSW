/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.*;
import java.util.Date;

/**
 *
 * @author monitoriasSAS
 */
public interface SemestreDAO {
    public Semestre ConsultarSemestre(String id) ;
    void agregarSemestre(Semestre semestre);
    void agregarGrupo(Grupo grupo);
    void agregarProfesor(Profesor profesor);
    void agregarMonitor(Monitor monitor);
    void agregarTema(Tema tema);
    void agregarEstudiante(Estudiante estudiante);
    void agregarFranja(FranjaHorario franjaHorario);
}
