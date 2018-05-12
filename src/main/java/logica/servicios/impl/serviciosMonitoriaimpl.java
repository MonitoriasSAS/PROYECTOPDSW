/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.servicios.impl;

import com.google.inject.Inject;
import dao.MonitoriaDAO;
import dao.ProfesorDAO;
import dao.SemestreDAO;
import entidades.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.servicios.ExcepcionServiciosMonitoria;
import logica.servicios.serviciosMonitoria;
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

   
}
