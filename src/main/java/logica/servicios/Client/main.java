package logica.servicios.Client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private static SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH::SS");
    private static Date fechaPru ;
    public static void main(String a[]){
         System.out.println("not yet");
         try {
            fechaPru=sdf.parse("2018-01-10 7:00:00");
        } catch (ParseException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println("not yet");
         serviciosMonitoriaFactory.getInstance().getServiciosMonitoria().agregarSemestre("2018-2",fechaPru,fechaPru);
         System.exit(0);
    }
    
}
