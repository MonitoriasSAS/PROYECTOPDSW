/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mybatis;

import entidades.Monitoria;

/**
 *
 * @author MonitoriasSaS
 */
public interface MonitoriaDao {
    public Monitoria loadMonitoria(int id);
    
}
