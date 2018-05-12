/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.servicios;

import entidades.*;
import java.util.Date;

/**
 *
 * @author 2112076
 */
public interface serviciosMonitoria {
     /**
     * agrega una monitoria a la base de datos
     * @param monitoria monitoria que se empieza a registrar
     * @throws ExcepcionServiciosMonitoria si hay error de persistencia-
     **/
    public abstract void registrarMonitoria(Monitoria monitoria,String tema) throws ExcepcionServiciosMonitoria;
    /**
     * Retorna una monitoria en especifico con su id correspondiente
     * @param id identificador de la monitoria
     * @return la monitoria con el id dado
     * @Throws ExcepcionServiciosMonitoria si no existe dicha monitoria
     */
    public abstract Monitoria consulatarMonitoria(int id) throws ExcepcionServiciosMonitoria;
    
    public abstract void agregarSemestre(Semestre semestre);
    
    public abstract void agregarGrupo(Grupo grupo);
    
    public void agregarProfesor(Profesor profesor);
    
    public abstract Semestre getSemestre(String i);
    
   
    
    public abstract void consultarInfoSemestre();
    
   public abstract  Monitoria consularInfoMonitoria(int id);
   
   public void agregarMonitor(Monitor monitor); 
   
   public void agregarEstudiante(Estudiante estudiante);
   
   public void agregarTema(Tema tema);
}
