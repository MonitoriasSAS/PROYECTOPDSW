/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import edu.eci.pdsw.entidades.*;
import edu.eci.pdsw.logica.servicios.ExcepcionServiciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoria;
import edu.eci.pdsw.logica.servicios.serviciosMonitoriaFactory;
import java.sql.Time;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ibatis.exceptions.PersistenceException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.postgresql.util.PSQLException;

/**
 *
 * @author monitoriaSAS
 */
public class SimpleTest {
    public SimpleTest(){
    }
    @Test
    public void deberiaAgregarUnSemestre() {
        serviciosMonitoria serv= serviciosMonitoriaFactory.getInstance().getTestingServiciosMonitoria();
        Semestre semes=new Semestre("2012-7", new Date(2012,1,23), new Date(2012,5,25));
        try {
            serv.agregarSemestre(semes);
        } catch (ExcepcionServiciosMonitoria ex) {
            Logger.getLogger(SimpleTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PSQLException ex) {
            Logger.getLogger(SimpleTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PersistenceException ex) {
            Logger.getLogger(SimpleTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals("2012-7",semes.getPeriodo());
    }
    @Test
    public void deberiaAgregarUnaAsignatura(){
        serviciosMonitoria serv= serviciosMonitoriaFactory.getInstance().getTestingServiciosMonitoria();
        Asignatura as=new Asignatura("ll1l","logica calculativa");
        serv.agregarAsignatura(as);
        assertEquals("logica calculativa",as.getNombre());
    }
    @Test
    public void deberiaAgregarUnProfesor(){
        serviciosMonitoria serv= serviciosMonitoriaFactory.getInstance().getTestingServiciosMonitoria();
        Profesor x=new Profesor(2112107, "tato", "apellido", "mail@mail.escuelaing.edu.co",8018546);
        serv.agregarProfesor(x);
        assertEquals(8018546,x.getTelefono());
    }
    @Test
    public void deberiaAgregarUnMonitor(){
        serviciosMonitoria serv= serviciosMonitoriaFactory.getInstance().getTestingServiciosMonitoria();
        Monitor ho=new Monitor(2112107,"nombre"," apellido", 70172, "sistemas",2012);
        serv.agregarMonitor(ho);
        assertEquals("nombre",ho.getNombre());
    }
    @Test
    public void deberiaAgregarunGrupo(){
        serviciosMonitoria serv= serviciosMonitoriaFactory.getInstance().getTestingServiciosMonitoria();
        Semestre s=new Semestre("2012-7", new Date(2012,1,23), new Date(2012,5,25));
        Asignatura as=new Asignatura("ll1l","logica calculativa");
        Profesor x=new Profesor(2112107, "tato", "apellido", "mail@mail.escuelaing.edu.co",8018546);
        Grupo lcal=new Grupo(2,s,as, x,30);
        serv.agregarGrupo(lcal);
        assertEquals(30,lcal.getMatriculados());
    }
    @Test 
    public void deberiaAgregarUnaFranjaHorario(){
        serviciosMonitoria serv= serviciosMonitoriaFactory.getInstance().getTestingServiciosMonitoria();
        Monitor ho=new Monitor(2112107,"nombre"," apellido", 70172, "sistemas",2012);
        Semestre s=new Semestre("2012-7", new Date(2012,1,23), new Date(2012,5,25));
        Profesor x=new Profesor(2112107, "tato", "apellido", "mail@mail.escuelaing.edu.co",8018546);
        Asignatura as=new Asignatura("ll1l","logica calculativa");
        Grupo lcal=new Grupo(2,s,as, x,30);
        FranjaHorario kk=new FranjaHorario(ho,"martes",lcal,as, new Time(10,0,0), new Time(11,30,0));
        serv.agregarFranjaHorario(kk);
        assertEquals("martes",kk.getDia());
    }
    @Test
    public void deberiaAgregarUnestudiante(){
        serviciosMonitoria serv= serviciosMonitoriaFactory.getInstance().getTestingServiciosMonitoria();
        Estudiante e=new Estudiante(2112076, "carlitos", "hitler");
        serv.agregarEstudiante(e);
        assertEquals("carlitos",e.getNombre());
    }
    @Test
    public void deberiaAgregarUnTema(){
        serviciosMonitoria serv= serviciosMonitoriaFactory.getInstance().getTestingServiciosMonitoria();
        Asignatura as=new Asignatura("ll1l","logica calculativa");
        Tema tem = new Tema("Grafos","el kompayaso",as);
        serv.agregarTema(tem);
        assertEquals("el kompayaso",tem.getName());
    }
    @Test
    public void deberiaAgregarUnaMonitoria(){
        serviciosMonitoria serv= serviciosMonitoriaFactory.getInstance().getTestingServiciosMonitoria();
        Asignatura as=new Asignatura("ll1l","logica calculativa");
        Tema tem = new Tema("Grafos","el kompayaso",as);
        Monitoria hy=new Monitoria("5.78.100.1", "locha", new Date(2012,4,10) ,tem,"jesus", 2112076,2112107,2,as.getId());
    }
}
