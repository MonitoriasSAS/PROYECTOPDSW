/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.dao.mybatis.mappers;


import edu.eci.pdsw.entidades.Semestre;
import edu.eci.pdsw.entidades.Tema;
import edu.eci.pdsw.entidades.Estudiante;
import edu.eci.pdsw.entidades.Profesor;
import edu.eci.pdsw.entidades.Grupo;
import edu.eci.pdsw.entidades.Monitor;
import edu.eci.pdsw.entidades.Asignatura;
import edu.eci.pdsw.entidades.FranjaHorario;
import edu.eci.pdsw.entidades.Monitoria;
import javax.persistence.PersistenceException;
import org.apache.ibatis.annotations.Param;
import org.postgresql.util.PSQLException;
/**
 *
 * @author MonitoriasSAS
 */
public interface SemestreMapper{
    Semestre Consultarsemestre(@Param("id")String id);
    void agregarSemestre(@Param("sem") Semestre semestre) throws PersistenceException,PSQLException;    
    void agregarGrupo(@Param("gru") Grupo grupo);
    void agregarProfesor(@Param("pro")Profesor profesor);
    void agregarFranja(@Param("fra") FranjaHorario franja);
    void agregarMonitor(@Param("monr")Monitor monitor);
    void agregarAsignatura(@Param("asig")Asignatura asignatura);
    void agregarTema(@Param("tem") Tema tema);
    void agregarEstudiante(@Param("estu") Estudiante estudiante);
    Asignatura consultarAsignatura(@Param("asig")String asignatura);
    FranjaHorario consultarFranja(@Param("franja")String franja);
    Tema consultarTema();
    Monitoria consultarMon();
    Profesor consultarProfe(@Param("idpro") int carnet);
    Grupo consultarGrupo(@Param("numero")int numero,@Param("idasig") String asignatura);
    Monitor consultarMonitor(@Param("numero")int carnet);
    Tema consultarTema(@Param("idtema") String id);
}