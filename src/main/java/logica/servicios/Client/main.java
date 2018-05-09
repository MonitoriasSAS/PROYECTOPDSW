package logica.servicios.Client;

import dao.mybatis.mappers.*;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.servicios.serviciosMonitoriaFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monitoriasSas
 */
public class main {
     public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory = null;
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return sqlSessionFactory;
    }
    public static void main(String a[]){
         SqlSessionFactory sessionfact = getSqlSessionFactory();

        SqlSession sqlss = sessionfact.openSession();
        MonitoriaMapper mm=sqlss.getMapper(MonitoriaMapper.class);
        
         //serviciosMonitoriaFactory.getInstance().getServiciosMonitoria().agregarSemestre("2018-2",fechaPru,fechaPru);
         System.exit(0);
    }
    
}
