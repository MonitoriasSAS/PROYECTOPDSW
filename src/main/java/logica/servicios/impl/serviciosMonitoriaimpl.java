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
import entidades.Monitoria;
import entidades.Semestre;
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
    public void registrarMonitoria(String ip,  String observaciones,Date fecha,int id,int numero,String tema) throws ExcepcionServiciosMonitoria {
         try{
           daoMon.agregarMonitoria(ip, observaciones, fecha, id, numero, tema);
       } catch(PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Semestre getSemestre(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarSemestre(String id, Date inicio, Date fin) {
        try{
            daoSemestre.agregarSemestre(id, inicio, fin);
        } catch (PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void agregarGrupo(String semestre, int asignatura, int carnet, int numero) {
         try{
            daoSemestre.agregarGrupo(semestre, asignatura, carnet, numero);
        } catch (PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void agregarProfesor(int id, String nombre, String apellido, String telefono, String mail) {
         try{
            daoSemestre.agregarProfesor(id, nombre, apellido, telefono, mail);
        } catch (PersistenceException ex){
            Logger.getLogger(serviciosMonitoriaimpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 

    @Override
    public void consultarInfoSemestre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarAsistencia(int idmon,String idtema) {
               try{
            daoMon.agregarAsistencia(idmon, idtema);
            
           
            
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

   
}
