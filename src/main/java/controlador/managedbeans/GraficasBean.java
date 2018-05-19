/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.managedbeans;
import java.io.Serializable;
import entidades.Grupo;
import entidades.Asignatura;
import entidades.Tema;
import logica.servicios.ExcepcionServiciosMonitoria;
import logica.servicios.serviciosMonitoria;
import logica.servicios.serviciosMonitoriaFactory;


/**
 *
 * @author CARLOS
 */
public class GraficasBean implements Serializable{
    private serviciosMonitoria servicio = serviciosMonitoriaFactory.getInstance().getServiciosMonitoria();
}
