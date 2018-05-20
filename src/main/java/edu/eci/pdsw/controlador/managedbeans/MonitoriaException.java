/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.controlador.managedbeans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author MonitoriasSAS
 */

public class MonitoriaException extends Exception {
    public static String critico="usuario o contraseña invalido";
    public MonitoriaException(String message){
        super(message);
    }
   
}
