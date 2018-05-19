package logica.servicios.Client;

import dao.mybatis.mappers.*;
import entidades.*;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
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
        ProfesorMapper pm=sqlss.getMapper(ProfesorMapper.class);
        Semestre s=new Semestre("2012-7", new Date(2012,1,23), new Date(2012,5,25));
        mm.agregarSemestre(s);
        System.out.println(mm.Consultarsemestre("2012-7"));
        Profesor x=new Profesor(2112107, "tato", "apellido", "mail@mail.escuelaing.edu.co",8018546);
        mm.agregarProfesor(x);
        Monitor ho=new Monitor(2112107,"nombre"," apellido", 70172, "sistemas",2012);
        mm.agregarMonitor(ho);
        Asignatura as=new Asignatura(7, "lcal");
        mm.agregarAsignatura(as);
        Grupo lcal=new Grupo(2,s,as, x);
        mm.agregarGrupo(lcal);
        FranjaHorario kk=new FranjaHorario(30, ho,"martes", lcal, as, new Time(10,0,0), new Time(11,30,0));
        mm.agregarFranja(kk);
        mm.agregarEstudiante(new Estudiante(2112076, "carlitos", "hitler"));
        Tema tem = new Tema(1,"Grafos",as);
        mm.agregarTema(tem);
        Monitoria hi=new Monitoria(21,"10.18.45.0", "tato me perrio", new Date(2012,4,10) ,tem,kk,  "tato", 2112076,2);
        hi.setTema(tem);
        hi.setFranjaHorario(kk);
        mp.agregarMonitoria(hi);
        mp.agregarMoni(2112076,1,21);
        System.out.println(mp.loadMonitoria(21));
       // System.out.println(pm.consultarEstudiantes(2));
        //System.out.println(pm.consularInfoMonitoria(21));
         System.exit(0);
    }
    
}
