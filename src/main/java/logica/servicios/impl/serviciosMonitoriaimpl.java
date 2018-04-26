/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.servicios.impl;

import com.google.inject.Inject;
import dao.MonitoriaDAO;
import entidades.Monitoria;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.servicios.ExcepcionServiciosMonitoria;
import logica.servicios.serviciosMonitoria;
import javax.persistence.PersistenceException;

/**
 *
 * @author 2112076
 */
public class serviciosMonitoriaimpl implements serviciosMonitoria {
    
     @Inject
    private MonitoriaDAO daoMon;
     
    @Override
    public Monitoria consulatarMonitoria(int id) throws ExcepcionServiciosMonitoria{
        Monitoria x=null;
        try{
            x=daoMon.ConsultarMonitoria(id);
        } catch(Exception ex){
              Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    @Override
    public void registrarMonitoria(String ip, int id, String nombre, String apellido)  {
       try{
           daoMon.agregarMonitoria(ip, apellido, id, nombre, apellido);
       } catch(PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    @Override
    public void agregarObservaciones(String observaciones) throws ExcepcionServiciosMonitoria {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
