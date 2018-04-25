/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.servicios;

import entidades.Monitoria;
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
    /**
     * Agrega las observaciones que el monitor desee de la sesion
     * @param observaciones comentarios de el monitor
     */
    public void agregarObservaciones(String observaciones);
    /**
     * Retorna una monitoria en especifico con su id correspondiente
     * @param id identificador de la monitoria
     * @return la monitoria con el id dado
     * @Throws ExcepcionServiciosMonitoria si no existe dicha monitoria
     */
    public Monitoria consulatarMonitoria(int id);
}
