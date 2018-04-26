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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public Monitoria ConsultarMonitoria(int id) {
        try {
            Monitoria monitoria = monmap.loadMonitoria(id);
            return monitoria;
        }catch (Exception e){
            throw new PersistenceException("Error al cargar las solicitudes:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarMonitoria(String ip, int id, String nombre, String apellido, String obvservaciones,String tema) {
        try{
            monmap.agregarMonitoria(ip, id, nombre, apellido,obvservaciones,tema);
        } catch(Exception e){
            throw new PersistenceException("Error al cargar las solicitudes:"+e.getLocalizedMessage(), e);
          
        }
    }

  
     
}
