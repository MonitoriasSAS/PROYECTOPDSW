/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.dao.mybatis;

import com.google.inject.Inject;

import edu.eci.pdsw.dao.ProfesorDAO;
import edu.eci.pdsw.dao.mybatis.mappers.ProfesorMapper;
import edu.eci.pdsw.entidades.Monitoria;
import edu.eci.pdsw.entidades.Profesor;
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

    @Override
    public Monitoria consularInfoMonitoria(int id) {
       return profesorMapper.consularInfoMonitoria(id);
    }
     
}
