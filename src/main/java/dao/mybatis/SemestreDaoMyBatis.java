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
    public Semestre semestre(int id) {
       return semestreMapper.semestre(id);
    }
     
}
