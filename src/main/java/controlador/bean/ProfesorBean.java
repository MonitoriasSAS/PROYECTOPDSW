/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.bean;

import java.io.Serializable;
import entidades.Profesor;
import entidades.Monitoria;
import entidades.Asignatura;
import entidades.Estudiante;
import logica.servicios.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import logica.servicios.ExcepcionServiciosMonitoria;
import logica.servicios.serviciosMonitoria;
import logica.servicios.serviciosMonitoriaFactory;


/**
 *
 * @author 2110540
 */
@ManagedBean(name = "bpr")
@SessionScoped
public class ProfesorBean implements Serializable {
    
    private serviciosMonitoria servicio = serviciosMonitoriaFactory.getInstance().getServiciosMonitoria();
    
    private Profesor profesor;
    private Monitoria monitoria;
    private Asignatura materia;
    
    public Profesor getProfesor(){
        return profesor;
    }
    
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    
}
