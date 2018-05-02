/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mybatis;

import com.google.inject.Inject;

import dao.ProfesorDAO;
import dao.mybatis.mappers.ProfesorMapper;
import entidades.Profesor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;

/**
 *
 * @author MonitoriasSAS
 */
public class ProfesorDaoMyBatis implements ProfesorDAO {
     @Inject
     private ProfesorMapper profesorMapper; 

    @Override
    public Profesor profesor(int id) {
       return profesorMapper.profesor(id);
    }
     
}
