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
 * @author MonitoriasSAS
 */
public interface ProfesorDAO {
    public Profesor profesor(int id) ;
    public Monitoria consularInfoMonitoria(int id);
    public List<Monitoria>consultarMonitorias(String asi);
    public List<Monitoria>consultarTotalMonitorias(int id,String asi);
    public Grupo consulatarEstudiantesCursos(int id,int numgrupo,String numasig);
    public List<Monitoria> consultarMonitoriasCursos(int id,int numgrupo,String numasig);
    public List<Grupo> consultarCursos(int id,String numasig);
    public List<Monitoria> consultarEstudiantesGrupo(int id,int numgrupo,String numasig);
    public List<Monitoria> consultarTotalGrupo(int id,String numasig);
    public List<Monitoria> consultarTemaMonitoria(int id,String numasig,String idtema);
    public List<Tema> consultarTema(String asi);
}
