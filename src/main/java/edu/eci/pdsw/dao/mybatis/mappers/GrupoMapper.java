/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.dao.mybatis.mappers;

import edu.eci.pdsw.entidades.Grupo;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 *
 * @author MonitoriasSAS
 */
public interface GrupoMapper{
    List<Grupo> grupo(@Param("numero")int numero);
}