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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;

/**
 *
 * @author MonitoriasSAS
 */
public class SemestreDaoMyBatis implements SemestreDAO {
     @Inject
     private SemestreMapper semestreMapper; 

    @Override
    public Semestre semestre(String id) {
       return semestreMapper.semestre(id);
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
    public void agregarProfesor(int id, String nombre, String apellido, String telefono, String mail) {
         semestreMapper.agregarProfesor(id, nombre, apellido, telefono, mail);
    }
     
}
