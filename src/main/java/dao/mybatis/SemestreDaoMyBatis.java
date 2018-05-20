/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mybatis;

import com.google.inject.Inject;

import dao.SemestreDAO;
import dao.mybatis.mappers.SemestreMapper;
import entidades.*;
import java.util.Date;
import javax.persistence.PersistenceException;


/**
 *
 * @author MonitoriasSAS
 */
public class SemestreDaoMyBatis implements SemestreDAO {
     @Inject
     private SemestreMapper semestreMapper; 

    @Override
    public Semestre ConsultarSemestre(String id) {
        
       return semestreMapper.Consultarsemestre(id);
    }

    @Override
    public void agregarSemestre(Semestre semestre) {
      try {
         semestreMapper.agregarSemestre(semestre);
         }catch (Exception e){
            throw new PersistenceException("Error al agregar semestre:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarGrupo(Grupo grupo) {
        try {
         semestreMapper.agregarGrupo(grupo);
         }catch (Exception e){
            throw new PersistenceException("Error al agregar Grupo:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarProfesor(Profesor profesor) {
        try {
         semestreMapper.agregarProfesor(profesor);
         }catch (Exception e){
            throw new PersistenceException("Error al agregar profesor:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarMonitor(Monitor monitor) {
        try {
         semestreMapper.agregarMonitor(monitor);
         }catch (Exception e){
            throw new PersistenceException("Error al agregar monitor:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarTema(Tema tema) {
        try {
         semestreMapper.agregarTema(tema);
         }catch (Exception e){
            throw new PersistenceException("Error al agregar tema:"+e.getLocalizedMessage(), e);
        }
    }
    
    @Override
    public void agregarEstudiante(Estudiante estudiante) {
        try {
         semestreMapper.agregarEstudiante(estudiante);
         }catch (Exception e){
            throw new PersistenceException("Error al agregar estudiante:"+e.getLocalizedMessage(), e);
        }
    }   

    @Override
    public void agregarFranja(FranjaHorario franjaHorario) {
        try {
         semestreMapper.agregarFranja(franjaHorario);
         }catch (Exception e){
            throw new PersistenceException("Error al agregar franja horario:"+e.getLocalizedMessage(), e);
        }
    }
}
