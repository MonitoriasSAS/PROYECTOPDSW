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
import entidades.Monitor;
import entidades.Grupo;
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
    
    private Grupo grupo;
    private Monitor monitor;
    private Profesor profesor;
    private Monitoria monitoria;
    private Asignatura materia;
    
    public void consultar() throws ExcepcionServiciosMonitoria{
        String mon = monitor.getNombre()+" "+monitor.getApellido();
        servicio.consulatarMonitoria(monitoria.getId());
    }

    public Grupo getGrupo() {
        return grupo;
    }
    
    public serviciosMonitoria getServicio() {
        return servicio;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Monitoria getMonitoria() {
        return monitoria;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    public void setServicio(serviciosMonitoria servicio) {
        this.servicio = servicio;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMonitoria(Monitoria monitoria) {
        this.monitoria = monitoria;
    }

    public void setMateria(Asignatura materia) {
        this.materia = materia;
    }
      
    public Profesor getProfesor(){
        return profesor;
    }
    
    public void setProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    
}
