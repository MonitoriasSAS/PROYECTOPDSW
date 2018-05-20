/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.logica.servicios.impl;

import edu.eci.pdsw.entidades.Semestre;
import edu.eci.pdsw.entidades.Monitoria;
import edu.eci.pdsw.entidades.Tema;
import edu.eci.pdsw.entidades.Estudiante;
import edu.eci.pdsw.entidades.Profesor;
import edu.eci.pdsw.entidades.Grupo;
import edu.eci.pdsw.entidades.Monitor;
import edu.eci.pdsw.entidades.FranjaHorario;
import com.google.inject.Inject;
import edu.eci.pdsw.dao.MonitoriaDAO;
import edu.eci.pdsw.dao.ProfesorDAO;
import edu.eci.pdsw.dao.SemestreDAO;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import edu.eci.pdsw.logica.servicios.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoria;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.PersistenceException;

/**
 *
 * @author 2112076
 */
public class serviciosMonitoriaimpl implements serviciosMonitoria {
    
    @Inject
    private SemestreDAO daoSemestre;
    @Inject
    private MonitoriaDAO daoMon;
    @Inject
    private ProfesorDAO daoPro;
    
    @Override
    public Monitoria consulatarMonitoria(int id) throws ExcepcionServiciosMonitoria{
        Monitoria x=null;
        try{
            x=daoMon.consultarMonitoria(id);
        } catch(Exception ex){
              Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    @Override
    public void registrarMonitoria(Monitoria monitoria,String tema) throws ExcepcionServiciosMonitoria {
         try{
           daoMon.agregarMonitoria(monitoria, tema);
       } catch(PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Semestre getSemestre(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarSemestre(Semestre semestre) {
        try{
            daoSemestre.agregarSemestre(semestre);
        } catch (PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void agregarGrupo(Grupo grupo) {
         try{
            daoSemestre.agregarGrupo(grupo);
        } catch (PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void agregarProfesor(Profesor profesor) {
         try{
            daoSemestre.agregarProfesor(profesor);
        } catch (PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }





    @Override
    public Monitoria consularInfoMonitoria(int id) {
        Monitoria x=null;
        try{
            daoPro.consularInfoMonitoria(id);
        } catch (PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    @Override
    public Semestre getSemestre(String i) {
        Semestre x=null;
         try{
            x=daoSemestre.ConsultarSemestre(i);
        } catch (PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
         return x;
    }

    @Override
    public void consultarInfoSemestre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarMonitor(Monitor monitor) {
         try{
           daoSemestre.agregarMonitor(monitor);
        } catch (PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void agregarEstudiante(Estudiante estudiante) {
        try{
           daoSemestre.agregarEstudiante(estudiante);
        } catch (PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void agregarTema(Tema tema) {
         try{
           daoSemestre.agregarTema(tema);
        } catch (PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
   @Override
   public void agregarFranjaHorario(FranjaHorario franjaHorario){
        try{
          daoSemestre.agregarFranja(franjaHorario);
        } catch (PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

    @Override
    public float consultarMonitorias(int id) {
      float x=0;
      try{
        x= daoPro.consultarMonitorias().size()/daoPro.consultarTotalMonitorias(id).size();
      } catch (PersistenceException ex){
        Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
      }
      return x;
    }

    @Override
    public List<Float> consultarCursos(int id, int asig) {
      List<Float> x= new ArrayList<Float>();
      try{
          Grupo g=new Grupo();
          List<Grupo> grupos=daoPro.consultarCursos(id, asig);
          for (Grupo i: grupos){
              x.add((float)daoPro.consultarMonitoriasCursos(id,i.getNumero(), asig).size()/daoPro.consulatarEstudiantesCursos(id,i.getNumero(), asig).size());
          }
      } catch (PersistenceException ex){
        Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
      }
      return x;
    }
}
