/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.mybatis;


import dao.mybatis.*;
import com.google.inject.Inject;
import dao.GrupoDAO;
import dao.mybatis.mappers.GrupoMapper;
import entidades.Profesor;
import entidades.Grupo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;

/**
 *
 * @author MonitoriasSAS
 */
public class GrupoDaoMyBatis implements GrupoDAO {
     @Inject
     private GrupoMapper grupoMapper; 

    @Override
    public List<Grupo> grupo(int numero) {
       return grupoMapper.grupo(numero);
    }
     
}
