/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Monitoria;
import entidades.Profesor;

/**
 *
 * @author monitoriasSAS
 */
public interface ProfesorDAO {
    public Profesor profesor(int id) ;
    public Monitoria consularInfoMonitoria(int id);
}
