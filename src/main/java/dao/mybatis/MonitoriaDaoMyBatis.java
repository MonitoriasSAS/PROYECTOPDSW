/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mybatis;

import com.google.inject.Inject;
import dao.MonitoriaDAO;
import dao.PersistenceException;
import dao.mybatis.mappers.MonitoriaMapper;
import entidades.Monitoria;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AsusPC
 */
public class MonitoriaDaoMyBatis implements MonitoriaDAO {
     @Inject
    MonitoriaMapper monmap; 

   

    @Override
    public Monitoria ConsultarMonitoria(int id) throws PersistenceException{
        try {
            Monitoria monitoria = monmap.loadMonitoria(id);
            return monitoria;
        }catch (Exception e){
            throw new PersistenceException("Error al cargar las solicitudes:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public void agregarMonitoria(String ip, int id, String nombre, String apellido) throws PersistenceException {
        try{
            monmap.agregarMonitoria(ip, id, nombre, apellido);
        } catch(Exception e){
            throw new PersistenceException("Error al cargar las solicitudes:"+e.getLocalizedMessage(), e);
          
        }
    }

    /**
     *
     * @param id
     * @param obvservaciones
     * @throws PersistenceException
     */
    @Override
    public void agregarObservaciones(int id, String obvservaciones) throws PersistenceException {
        try{
            monmap.agregarObservaciones(id, obvservaciones);
        } catch(Exception e){
            throw new PersistenceException("Error al cargar las solicitudes:"+e.getLocalizedMessage(), e);
          
        }
    }
     
}
