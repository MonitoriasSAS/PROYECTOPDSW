/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Monitoria;

/**
 *
 * @author monitoriasSAS
 */
public interface MonitoriaDAO {
    public void agregarMonitoria(String ip,String obvservaciones, int id ,
             String nombre, String apellido);
    public Monitoria ConsultarMonitoria(int id);
    
}
