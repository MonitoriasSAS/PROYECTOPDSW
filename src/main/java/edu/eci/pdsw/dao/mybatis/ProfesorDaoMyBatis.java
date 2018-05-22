/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.dao.mybatis;

import com.google.inject.Inject;

import edu.eci.pdsw.dao.ProfesorDAO;
import edu.eci.pdsw.dao.mybatis.mappers.ProfesorMapper;
import edu.eci.pdsw.entidades.Estudiante;
import edu.eci.pdsw.entidades.Grupo;
import edu.eci.pdsw.entidades.Monitoria;
import edu.eci.pdsw.entidades.Profesor;
import edu.eci.pdsw.entidades.Tema;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;

/**
 *
 * @author MonitoriasSAS
 */
public class ProfesorDaoMyBatis implements ProfesorDAO {
     @Inject
     private ProfesorMapper profesorMapper; 

    @Override
    public Profesor profesor(int id) {
       return profesorMapper.profesor(id);
    }

    @Override
    public Monitoria consularInfoMonitoria(int id) {
       return profesorMapper.consularInfoMonitoria(id);
    }
    @Override 
    public List<Monitoria> consultarMonitorias(String asi){
        return profesorMapper.consultarMonitorias(asi);
    }

    @Override
    public List<Monitoria> consultarTotalMonitorias(int id,String asi) {
        return profesorMapper.consultarTotalMonitorias(id,asi);
    }

    @Override
    public Grupo consulatarEstudiantesCursos(int id,int numgrupo, String numasig) {
        return profesorMapper.consulatarEstudiatesCursos(id, numgrupo, numasig);
    }

    @Override
    public List<Monitoria> consultarMonitoriasCursos(int id,int numgrupo, String numasig) {
        return profesorMapper.consultarMonitoriasCursos(id, numgrupo, numasig);
    }

    @Override
    public List<Grupo> consultarCursos(int id, String numasig) {
        return profesorMapper.consultarCursos(id, numasig);
    }

    @Override
    public List<Monitoria> consultarEstudiantesGrupo(int id, int numgrupo, String numasig) {
        return profesorMapper.consultarEstudiantesGrupo(id, numgrupo, numasig);
    }

    @Override
    public List<Monitoria> consultarTotalGrupo(int id, String numasig) {
        return profesorMapper.consultarTotalGrupo(id, numasig);
    }

    @Override
    public List<Monitoria> consultarTemaMonitoria(int id, String numasig,String idtema) {
        return profesorMapper.consultarTemaMonitoria(id, numasig,idtema);
    }

    @Override
    public List<Tema> consultarTema(String asi) {
       return profesorMapper.consultarTema(asi);
    }

    @Override
    public List<Monitoria> consultarAsistentes(int id) {
        return profesorMapper.consultarAsistentes(id);
    }
}
