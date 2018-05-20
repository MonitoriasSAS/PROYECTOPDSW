/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.logica.servicios;

import com.google.inject.Injector;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;
import static com.google.inject.Guice.createInjector;
import edu.eci.pdsw.dao.MonitoriaDAO;
import edu.eci.pdsw.dao.ProfesorDAO;
import edu.eci.pdsw.dao.SemestreDAO;
import edu.eci.pdsw.dao.mybatis.MonitoriaDaoMyBatis;
import edu.eci.pdsw.dao.mybatis.ProfesorDaoMyBatis;
import edu.eci.pdsw.dao.mybatis.SemestreDaoMyBatis;
import edu.eci.pdsw.logica.servicios.impl.serviciosMonitoriaimpl;
/**
 *
 * @author 2112076
 */
public class serviciosMonitoriaFactory {
    private static serviciosMonitoriaFactory instance = new serviciosMonitoriaFactory();
    private static Injector injector;
    private static Injector testInjector;
    public serviciosMonitoriaFactory(){
        
        injector = createInjector(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                install(JdbcHelper.MySQL);              
                setClassPathResource("mybatis-config.xml");
                bind(serviciosMonitoria.class).to(serviciosMonitoriaimpl.class);
                bind(MonitoriaDAO.class).to(MonitoriaDaoMyBatis.class);
                bind(SemestreDAO.class).to(SemestreDaoMyBatis.class);
                bind(ProfesorDAO.class).to(ProfesorDaoMyBatis.class);
            }
        }
        );
    }

    
    public serviciosMonitoria getServiciosMonitoria() {
        return injector.getInstance(serviciosMonitoria.class);
    }    
    
     public serviciosMonitoria getTestingServiciosMonitoria() {
        return testInjector.getInstance(serviciosMonitoria.class);
    }
     
    public static serviciosMonitoriaFactory getInstance() {
        return instance;
    }
}
