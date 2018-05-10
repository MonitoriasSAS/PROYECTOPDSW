/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mybatis.mappers;


import entidades.Semestre;
import java.util.Date;
import org.apache.ibatis.annotations.Param;
/**
 *
 * @author MonitoriasSaS
 */
public interface SemestreMapper{
    Semestre Consultarsemestre(@Param("id")String id);
    void agregarSemestre(@Param("perio")String id,
            @Param("ini") Date inicio,
            @Param("fin") Date fin);    
    void agregarGrupo(@Param("semeste") String semestre,
            @Param("asignatura") int asignatura,
            @Param("profesor")int carnet,
            @Param("num") int numero);
    void agregarProfesor(@Param("id")int id,
            @Param("nom") String nombre,
            @Param("apell") String apellido,
            @Param("tel") int telefono,
            @Param("mail") String mail);
    void agregarFranja(@Param("idfra") int id_franja,
            @Param("idmon") int id_monitor,
            @Param("asig") int asignatura,
            @Param("grup") int grupo,
            @Param("fecha") Date inicio);
    void agregarMonitor(@Param("carnet")int carnet,
            @Param("nombre") String nombre,
            @Param("apell") String apellido,
            @Param("nom") int semestre,
            @Param("tel") int telefono,
            @Param("carre") String carrera);
    void agregarAsignatura(@Param("id")int id,
            @Param("nombre") String nombre);
    void agregarTema(@Param("id")int id,
            @Param("nom") String nombre,
             @Param("asig") String asignatura);
    
}