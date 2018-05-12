/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mybatis.mappers;


import entidades.*;
import org.apache.ibatis.annotations.Param;
/**
 *
 * @author MonitoriasSaS
 */
public interface SemestreMapper{
    Semestre Consultarsemestre(@Param("id")String id);
    void agregarSemestre(@Param("sem") Semestre semestre);    
    void agregarGrupo(@Param("gru") Grupo grupo);
    void agregarProfesor(@Param("pro")Profesor profesor);
    void agregarFranja(@Param("fra") FranjaHorario franja);
    void agregarMonitor(@Param("monr")Monitor monitor);
    void agregarAsignatura(@Param("asig")Asignatura asignatura);
    void agregarTema(@Param("tem") Tema tema);
    void agregarEstudiante(@Param("estu") Estudiante estudiante);
}