/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.dao;

import edu.eci.pdsw.entidades.*;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author monitoriasSAS
 */
public interface ProfesorDAO {
    public Profesor profesor(int id) ;
    public Monitoria consularInfoMonitoria(int id);
    public List<Monitoria>consultarMonitorias(int asi);
    public List<Monitoria>consultarTotalMonitorias(int id,int asi);
    public List<Estudiante> consulatarEstudiantesCursos(int id,int numgrupo,int numasig);
    public List<Monitoria> consultarMonitoriasCursos(int id,int numgrupo,int numasig);
    public List<Grupo> consultarCursos(int id,int numasig);
    public List<Monitoria> consultarEstudiantesGrupo(int id,int numgrupo,int numasig);
    public List<Monitoria> consultarTotalGrupo(int id,int numasig);
    public List<Monitoria> consultarTemaMonitoria(int id,int numasig,int idtema);
    public List<Tema> consultarTema(@Param("idasi") int asi);
}
