/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.controlador.managedbeans;
import java.io.Serializable;
import edu.eci.pdsw.entidades.Grupo;
import edu.eci.pdsw.entidades.Asignatura;
import edu.eci.pdsw.entidades.Tema;
import edu.eci.pdsw.logica.servicios.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoriaFactory;


/**
 *
 * @author CARLOS
 */
public class GraficasBean implements Serializable{
    private serviciosMonitoria servicio = serviciosMonitoriaFactory.getInstance().getServiciosMonitoria();
}
