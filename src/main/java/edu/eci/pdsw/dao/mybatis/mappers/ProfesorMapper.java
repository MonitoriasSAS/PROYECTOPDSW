/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.dao.mybatis.mappers;

import edu.eci.pdsw.entidades.*;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 *
 * @author MonitoriasSaS
 */
public interface ProfesorMapper{
    Profesor profesor(@Param("id")int id);
    Monitoria consularInfoMonitoria (@Param("id")int id);
    float consultarEstudiantes(@Param("grup")int grupo);
    List<Monitoria> consultarMonitorias();
    List<Monitoria> consultarTotalMonitorias(@Param("idpro")int id);
    public List<Estudiante> consulatarEstudiantesCursos(@Param("idpro")int id,@Param("idgrupo")int numgrupo,@Param("idasi")int numasig);
    public List<Monitoria> consultarMonitoriasCursos(@Param("idpro")int id,@Param("idgrupo")int numgrupo,@Param("idasi")int numasig);
    public List<Grupo> consultarCursos(@Param("idpro")int id,@Param("idasi")int numasig);
}