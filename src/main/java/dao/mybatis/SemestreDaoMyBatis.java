/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mybatis;

import com.google.inject.Inject;

import dao.SemestreDAO;
import dao.mybatis.mappers.SemestreMapper;
import entidades.Semestre;
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
        try{
       return semestreMapper.Consultarsemestre(id);
       }catch (Exception e){
            throw new PersistenceException("Error al consultar semestre:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarSemestre(String id, Date inicio, Date fin) {
       semestreMapper.agregarSemestre(id, inicio, fin);
    }

    @Override
    public void agregarGrupo(String semestre, int asignatura, int carnet, int numero) {
        semestreMapper.agregarGrupo(semestre, asignatura, carnet, numero);
    }

    @Override
    public void agregarProfesor(int id, String nombre, String apellido, int telefono, String mail) {
        try {
         semestreMapper.agregarProfesor(id, nombre, apellido, telefono, mail);
         }catch (Exception e){
            throw new PersistenceException("Error al consultar profesor:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarMonitor(int id, String nombre, String apellido, int telefono, String carrera, String ingreso) {
        try {
         semestreMapper.agregarMonitor(id, nombre, apellido, nombre, telefono, carrera);
         }catch (Exception e){
            throw new PersistenceException("Error al consultar profesor:"+e.getLocalizedMessage(), e);
        }
    }
     
}
