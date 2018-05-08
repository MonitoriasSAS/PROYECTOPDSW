/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Semestre;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author monitoriasSAS
 */
public interface SemestreDAO {
    public Semestre semestre(int id) ;
    void agregarSemestre(String id,Date inicio,Date fin);    
    void agregarGrupo( String semestre,int asignatura,int carnet,int numero);
    void agregarProfesor(int id,String nombre,String apellido,String telefono, String mail);
    
}
