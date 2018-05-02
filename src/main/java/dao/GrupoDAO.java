/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import entidades.Grupo;
import java.util.List;
/**
 *
 * @author 2110540
 */
public interface GrupoDAO {
    List<Grupo> grupo(int id,int semestre);
}
