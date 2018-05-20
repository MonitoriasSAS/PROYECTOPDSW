/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.dao;
import edu.eci.pdsw.entidades.Grupo;
import java.util.List;
/**
 *
 * @author MonitoriasSAS
 */
public interface GrupoDAO {
    List<Grupo> grupo(int numero);
}
