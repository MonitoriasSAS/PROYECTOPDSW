/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Monitoria;
import java.util.Date;

/**
 *
 * @author monitoriasSAS
 */
public interface MonitoriaDAO {
    public void agregarMonitoria(String ip,  String obvservaciones,Date fecha,int id,int numero,String tema) ;
    public Monitoria ConsultarMonitoria(int id) ;
    
}
