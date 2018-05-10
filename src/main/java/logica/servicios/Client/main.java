package logica.servicios.Client;

import dao.mybatis.mappers.*;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
         Connection conn = null;
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
    public static void main(String a[])throws SQLException {
        SqlSessionFactory sessionfact = getSqlSessionFactory();
        SqlSession sqlss = sessionfact.openSession();
        SemestreMapper mm=sqlss.getMapper(SemestreMapper.class);
        MonitoriaMapper mp=sqlss.getMapper(MonitoriaMapper.class);
        mm.agregarSemestre("2012-2", new Date(2012,1,23), new Date(2012,5,25));
        mm.Consultarsemestre("2012-2");
        mm.agregarProfesor(2112107, "tato", "apellido",8018546, "mail@mail.escuelaing.edu.co");
        mm.agregarMonitor(2112107,"nombre"," apellido"," 2010-2", 70172, "carrera");
        mm.agregarAsignatura(7, "lcal");
       // mm.agregarGrupo("2012-2", 7, 2112107, 2);
        //mm.agregarFranja(30, 2112107, 7, 2, new Date("2012,4,10"));
        mp.agregarMonitoria("10.18.45.0", "tato me perrio", new Date(2012,4,10), 2112076, 2, "recurrencia");
         //serviciosMonitoriaFactory.getInstance().getServiciosMonitoria().agregarSemestre("2018-2",fechaPru,fechaPru);
         System.exit(0);
    }
    
}
