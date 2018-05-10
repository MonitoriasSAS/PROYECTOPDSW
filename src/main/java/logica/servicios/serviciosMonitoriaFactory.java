/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.servicios;

import com.google.inject.Injector;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;
import static com.google.inject.Guice.createInjector;
import dao.MonitoriaDAO;
import dao.ProfesorDAO;
import dao.SemestreDAO;
import dao.mybatis.MonitoriaDaoMyBatis;
import dao.mybatis.ProfesorDaoMyBatis;
import dao.mybatis.SemestreDaoMyBatis;
import logica.servicios.impl.serviciosMonitoriaimpl;
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
