/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.servicios;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

/**
 *
 * @author 2110540
 */
public class ServiciosXFactory {
    private static ServiciosXFactory instance = new ServiciosXFactory();
    private static Injector injector;
    private static Injector testInjector;
    
    public ServiciosXFactory(){
        injector = createInjector(new XMLMyBatisModule(){
            @Override
            protected void initialize(){
                install(JdbcHelper.PostgreSQL);
                setClassPathResource("mybatis-config.xml");
                      
            }
            }
        );
        testInjector = createInjector(new XMLMyBatisModule(){
            @Override
            protected void initialize(){
                install(JdbcHelper.PostgreSQL);
                setClassPathResource("mybatis-config-h2.xml");
            }
        }
        );
    }
    
    public ServiciosX getServiciosX(){
        return injector.getInstance(ServiciosX.class);
    }
    
    public ServiciosX getServiciosXTesting(){
        return testInjector.getInstance(ServiciosX.class);
    }
    
    public static ServiciosXFactory getInstance(){
        return instance;
    }
}   
