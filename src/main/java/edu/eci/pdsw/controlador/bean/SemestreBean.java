/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.controlador.bean;

import java.io.Serializable;
import edu.eci.pdsw.entidades.Semestre;
import edu.eci.pdsw.logica.servicios.serviciosMonitoria;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import edu.eci.pdsw.logica.servicios.serviciosMonitoriaFactory;

/**
 *
 * @author MonitoriasSAS
 */
@ManagedBean(name = "bse")
@SessionScoped
public class SemestreBean implements Serializable {
    private Semestre semestre;
    
    public Semestre getSemestre(){
        return serviciosMonitoriaFactory.getInstance().getServiciosMonitoria().getSemestre("2012-2") ;
    } 
    public void setSemestre(Semestre semestre){
        this.semestre = semestre;
    }
   
    
}
