package logica.servicios.Client;

import logica.servicios.serviciosMonitoriaFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monitoriasSas
 */
public class main {
     public static void main(String a[]){
         System.out.println(serviciosMonitoriaFactory.getInstance().getServiciosMonitoria());
         System.exit(0);
    }
    
}
