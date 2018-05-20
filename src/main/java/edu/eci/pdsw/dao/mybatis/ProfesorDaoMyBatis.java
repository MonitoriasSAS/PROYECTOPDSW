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
    public List<Monitoria> consultarMonitorias(int asi){
        return profesorMapper.consultarMonitorias(asi);
    }

    @Override
    public List<Monitoria> consultarTotalMonitorias(int id,int asi) {
        return profesorMapper.consultarTotalMonitorias(id,asi);
    }

    @Override
    public List<Estudiante> consulatarEstudiantesCursos(int id,int numgrupo, int numasig) {
        return profesorMapper.consulatarEstudiantesCursos(id, numgrupo, numasig);
    }

    @Override
    public List<Monitoria> consultarMonitoriasCursos(int id,int numgrupo, int numasig) {
        return profesorMapper.consultarMonitoriasCursos(id, numgrupo, numasig);
    }

    @Override
    public List<Grupo> consultarCursos(int id, int numasig) {
        return profesorMapper.consultarCursos(id, numasig);
    }

    @Override
    public List<Monitoria> consultarEstudiantesGrupo(int id, int numgrupo, int numasig) {
        return profesorMapper.consultarEstudiantesGrupo(id, numgrupo, numasig);
    }

    @Override
    public List<Monitoria> consultarTotalGrupo(int id, int numasig) {
        return profesorMapper.consultarTotalGrupo(id, numasig);
    }

    @Override
    public List<Monitoria> consultarTemaMonitoria(int id, int numasig,int idtema) {
        return profesorMapper.consultarTemaMonitoria(id, numasig,idtema);
    }

    @Override
    public List<Tema> consultarTema(int asi) {
       return profesorMapper.consultarTema(asi);
    }
}
