/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.dao;

import edu.eci.pdsw.entidades.Monitoria;
import java.util.Date;

/**
 *
 * @author monitoriasSAS
 */
public interface MonitoriaDAO {
    public void agregarMonitoria(Monitoria monitoria,String tema) ;
    public Monitoria consultarMonitoria(int id) ;
}
