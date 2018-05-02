/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mybatis;

import com.google.inject.Inject;

import dao.EstudianteDAO;
import dao.mybatis.mappers.EstudianteMapper;
import entidades.Estudiante;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;

/**
 *
 * @author MonitoriasSAS
 */
public class EstudianteDaoMyBatis implements EstudianteDAO {
     @Inject
     private EstudianteMapper estudianteMapper; 

    @Override
    public Estudiante estudiante(int id) {
       return estudianteMapper.estudiante(id);
    }
     
}
