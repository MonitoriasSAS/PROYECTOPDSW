/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mybatis.mappers;

import entidades.Monitoria;

import org.apache.ibatis.annotations.Param;
/**
 *
 * @author MonitoriasSaS
 */
public interface MonitoriaMapper{
    public Monitoria loadMonitoria(@Param("idmo") int id);
    public void agregarMonitoria(@Param("ip") String ip, 
            @Param("idcar") int id ,@Param("obvs") String obvservaciones,
             @Param("tem") String tema,@Param("descp") String descripcion);
}