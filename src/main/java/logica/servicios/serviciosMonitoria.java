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
     * @param observaciones comentarios de el monitor
     * @param ip donde se registra la monitoria
     * @param nombre nombre del estudiante que esta en la monitoria
     * @param apellido apellido del estudiante que esta en la monitoria
     * @throws ExcepcionServiciosMonitoria si hay error de persistencia-
     **/
    public void registrarMonitoria(String ip,int id,String nombre,String apellido,String observaciones,String tema) throws ExcepcionServiciosMonitoria;
    /**
     * Retorna una monitoria en especifico con su id correspondiente
     * @param id identificador de la monitoria
     * @return la monitoria con el id dado
     * @Throws ExcepcionServiciosMonitoria si no existe dicha monitoria
     */
    public Monitoria consulatarMonitoria(int id) throws ExcepcionServiciosMonitoria;
}
