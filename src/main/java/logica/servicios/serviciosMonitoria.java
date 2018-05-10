/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.servicios;

import entidades.Monitoria;
import entidades.Semestre;
import java.util.Date;

/**
 *
 * @author 2112076
 */
public interface serviciosMonitoria {
     /**
     * agrega una monitoria a la base de datos
     * @param id id de la monitoria
     * @param observaciones comentarios de el monitor
     * @param ip donde se registra la monitoria
     * @throws ExcepcionServiciosMonitoria si hay error de persistencia-
     **/
    public abstract void registrarMonitoria(String ip,  String obvservaciones,Date fecha
            ,int id,int numero,String tema) throws ExcepcionServiciosMonitoria;
    /**
     * Retorna una monitoria en especifico con su id correspondiente
     * @param id identificador de la monitoria
     * @return la monitoria con el id dado
     * @Throws ExcepcionServiciosMonitoria si no existe dicha monitoria
     */
    public abstract Monitoria consulatarMonitoria(int id) throws ExcepcionServiciosMonitoria;
    
    public abstract void agregarSemestre(String id, Date inicio, Date fin);
    
    public abstract void agregarGrupo(String semestre, int asignatura, int carnet, int numero);
    
    public void agregarProfesor(int id, String nombre, String apellido, int telefono, String mail);
    
    public abstract Semestre getSemestre(String i);
    
    public abstract void registrarAsistencia(int idmon, String idtema);
    
    public abstract void consultarInfoSemestre();
    
   public abstract  Monitoria consularInfoMonitoria(int id);
   
   public void agregarMonitor(int id, String nombre, String apellido, int telefono, String carrera, String ingreso); 
}
