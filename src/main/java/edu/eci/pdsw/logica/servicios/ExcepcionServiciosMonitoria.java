/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.logica.servicios;

/**
 *
 * @author 2112076
 */
public class ExcepcionServiciosMonitoria extends Exception{
    public ExcepcionServiciosMonitoria(){
    }
    public ExcepcionServiciosMonitoria(String message){
        super(message);
    }
    public ExcepcionServiciosMonitoria(String message, Throwable cause){
        super(message,cause);
    }
    public ExcepcionServiciosMonitoria(Throwable cause){
        super(cause);
    }
}
