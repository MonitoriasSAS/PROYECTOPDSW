/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.controlador.managedbeans;

import edu.eci.pdsw.entidades.Monitor;
import edu.eci.pdsw.entidades.Monitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoriaFactory;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author AsusPC
 */
@ManagedBean(name="Monip")
@SessionScoped
public class monitoriasBean implements Serializable{
    private final serviciosMonitoria moni = serviciosMonitoriaFactory.getInstance().getServiciosMonitoria();

    public monitoriasBean() {
    }
    
    
    
    public List<Monitoria> crear(int carnet){
        return moni.consultarMonitoriasMon(carnet);
    }
}