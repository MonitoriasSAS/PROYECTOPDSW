/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mybatis.mappers;

import entidades.Monitoria;
import entidades.Profesor;
import entidades.Tema;
import org.apache.ibatis.annotations.Param;
/**
 *
 * @author MonitoriasSaS
 */
public interface ProfesorMapper{
    Profesor profesor(@Param("id")int id);
    Monitoria consularInfoMonitoria (@Param("id")int id);
}