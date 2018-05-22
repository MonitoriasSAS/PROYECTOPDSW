/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.dao;

import edu.eci.pdsw.entidades.Asignatura;
import edu.eci.pdsw.entidades.Semestre;
import edu.eci.pdsw.entidades.Tema;
import edu.eci.pdsw.entidades.Estudiante;
import edu.eci.pdsw.entidades.Profesor;
import edu.eci.pdsw.entidades.Grupo;
import edu.eci.pdsw.entidades.Monitor;
import edu.eci.pdsw.entidades.FranjaHorario;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author MonitoriasSAS
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
    void agregarAsignatura(Asignatura asignatura);
    Asignatura consultarAsignatura(String asignatura);
    Profesor consultarProfe(int carnet);
    Grupo consultarGrupo(int grupo,String asignatura);
    Monitor consultarMonitor(int carnet);
    Tema consultarTema(String id);
}
