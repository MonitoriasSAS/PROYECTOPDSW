/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.servicios;

import java.util.Date;

/**
 *
 * @author 2112076
 */
public interface serviciosMonitoria {
     /**
     * agrega una monitoria a la base de datos
     * @param id id de la monitoria
     * @param ip donde se registra la monitoria
     * @param Date fecha en la que se registra monitoria
     * @throws ExcepcionServiciosMonitoria si hay error de persistencia-
     **/
    public void registrarMonitoria(int id,String ip,Date fecha);
}
