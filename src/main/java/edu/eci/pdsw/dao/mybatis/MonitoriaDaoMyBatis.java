/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.pdsw.dao.MonitoriaDAO;
import edu.eci.pdsw.dao.mybatis.mappers.MonitoriaMapper;
import edu.eci.pdsw.entidades.Monitoria;
import java.util.Date;
import javax.persistence.PersistenceException;

/**
 *
 * @author MonitoriasSAS
 */
public class MonitoriaDaoMyBatis implements MonitoriaDAO {
     @Inject
    MonitoriaMapper monmap; 
    

    /**
     *
     * @param id
     * @return
     * @throws PersistenceException
     */
    @Override
    public Monitoria consultarMonitoria(int id) {
        try {
            Monitoria monitoria = monmap.loadMonitoria(id);
            return monitoria;
        }catch (Exception e){
            throw new PersistenceException("Error al consultar monitorias:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarMonitoria(Monitoria monitor,String tema) {
        try{
            monmap.agregarMonitoria(monitor);
        } catch(Exception e){
            throw new PersistenceException("Error al agregar monitoria:"+e.getLocalizedMessage(), e);
          
        }
    }
     
}
