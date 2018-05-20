/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.dao.mybatis.mappers;


import edu.eci.pdsw.entidades.Monitoria;
import edu.eci.pdsw.entidades.Monitor;


import org.apache.ibatis.annotations.Param;
/**
 *
 * @author MonitoriasSAS
 */
public interface MonitoriaMapper{
    public Monitoria loadMonitoria(@Param("idmo") int id);
    public void agregarMonitoria(@Param("mon") Monitoria monitoria);
    public void agregarMoni(@Param("id") int id,
            @Param("asig")int tem,
            @Param("tem") int tema);
    public Monitor loadFranja(@Param("idmon") int id);
}