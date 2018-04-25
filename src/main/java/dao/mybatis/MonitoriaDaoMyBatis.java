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
    public void agregarMonitoria(String ip, String obvservaciones, int id, String nombre, String apellido) {
         try{
            monmap.agregarMonitoria(ip, obvservaciones, id, nombre, apellido);
        }catch(Exception e){
             try {
                 throw new PersistenceException("Error al agregar monitoria"+e.getLocalizedMessage(), e);
             } catch (PersistenceException ex) {
                 Logger.getLogger(MonitoriaDaoMyBatis.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }

    @Override
    public Monitoria ConsultarMonitoria(int id) {
        Monitoria monitoria = monmap.loadMonitoria(id);
        return monitoria;
    }
     
}
