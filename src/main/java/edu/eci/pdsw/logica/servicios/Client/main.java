package edu.eci.pdsw.logica.servicios.Client;

import edu.eci.pdsw.dao.mybatis.mappers.SemestreMapper;
import edu.eci.pdsw.dao.mybatis.mappers.ProfesorMapper;
import edu.eci.pdsw.dao.mybatis.mappers.MonitoriaMapper;
import edu.eci.pdsw.entidades.Semestre;
import edu.eci.pdsw.entidades.Monitoria;
import edu.eci.pdsw.entidades.Tema;
import edu.eci.pdsw.entidades.Estudiante;
import edu.eci.pdsw.entidades.Grupo;
import edu.eci.pdsw.entidades.Profesor;
import edu.eci.pdsw.entidades.Monitor;
import edu.eci.pdsw.entidades.FranjaHorario;
import edu.eci.pdsw.entidades.Asignatura;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MonitoriasSAS
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
        Profesor x=new Profesor(2112107, "tato", "apellido", "mail@mail.escuelaing.edu.co",8018546);
        mm.agregarProfesor(x);
        Monitor ho=new Monitor(2112107,"nombre"," apellido", 70172, "sistemas",2012);
        mm.agregarMonitor(ho);
        Asignatura as=new Asignatura("ll1l","logica calculativa");
        mm.agregarAsignatura(as);
        Grupo lcal=new Grupo(2,s,as, x,30);
        mm.agregarGrupo(lcal);
        FranjaHorario kk=new FranjaHorario( ho,"martes", lcal, as, new Time(10,0,0), new Time(11,30,0));
        mm.agregarFranja(kk);
        mm.agregarEstudiante(new Estudiante(2112076, "carlitos", "hitler"));
        Tema tem = new Tema("Grafos","el kompayaso",as);
        mm.agregarTema(tem);
        Monitoria hi=new Monitoria("10.18.45.0", "tato me perrio", new Date(2012,4,10) ,tem,kk,  "tato", 2112076,2,as.getId());
        hi.setTema(tem);
        hi.setFranjaHorario(kk);
        mp.agregarMonitoria(hi);
        System.out.println(mm.Consultarsemestre("2012-7"));
        System.out.println(mp.loadMonitoria(hi.getIdC()));
        System.out.println(pm.consultarMonitorias(as.getId()));
        System.out.println(pm.consultarTotalMonitorias(2112107, as.getId()));
        System.out.println(pm.consultarCursos(2112107, as.getId()));
        System.out.println(pm.consulatarEstudiatesCursos(2112107, 2,as.getId()).getMatriculados());
        System.out.println(pm.consultarMonitoriasCursos(2112107, 2,as.getId()));
        System.out.println(pm.consultarEstudiantesGrupo(2112107, 2,as.getId()));
        System.out.println(pm.consultarTotalGrupo(2112107, as.getId()));
        /*System.out.println(pm.consultarTema(as.getId()));
        System.out.println(pm.consultarTemaMonitoria(2112107,as.getId(),tem.getId())); */
        System.exit(0);
    }
    
}
