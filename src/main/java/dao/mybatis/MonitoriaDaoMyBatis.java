/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mybatis;

import com.google.inject.Inject;
import dao.MonitoriaDAO;
import dao.mybatis.mappers.MonitoriaMapper;
import entidades.Monitoria;
import java.util.Date;
import javax.persistence.PersistenceException;

/**
 *
 * @author AsusPC
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
            monmap.agregarMoni(monitor.getIdC(),monitor.getId(),Integer.parseInt(tema));
        } catch(Exception e){
            throw new PersistenceException("Error al agregar monitoria:"+e.getLocalizedMessage(), e);
          
        }
    }
     
}
