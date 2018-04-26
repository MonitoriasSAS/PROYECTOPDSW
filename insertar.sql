/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  CARLOS
 * Created: 25-abr-2018
 */
---------------------------
-- Tema

INSERT INTO Tema
VALUES
('1','PRIMERA LEY DE NEWTON');

INSERT INTO Tema
VALUES
('2','HEROKU');

INSERT INTO Tema
VALUES
('3','DERIVADAS');

---------------------------
-- Asignatura
INSERT INTO Asignatura
VALUES
(1,'CALD','3');

INSERT INTO Asignatura
VALUES
(2,'FIMF','1');

INSERT INTO Asignatura
VALUES
(3,'POOB','2');

INSERT INTO Asignatura
VALUES
(4,'PDSW','2');

---------------------------
-- Semestre

INSERT INTO Semestre
VALUES
('2018/1','1-1-2018','1-5-2018');

INSERT INTO Semestre
VALUES
('2018/2','1-1-2017','1-5-2017');

INSERT INTO Semestre
VALUES
('2018/i','1-1-2016','1-5-2016');

---------------------------
-- Profesor

INSERT INTO Profesor
(id_Carnet,nombre_Prof,apellido_Prof,telefono,correo)
VALUES
(2117545,'Andres','lozada','3954234','andres.lozada@escuelaing.edu.co');

INSERT INTO Profesor
(id_Carnet,nombre_Prof,apellido_Prof,telefono,correo)
VALUES
(2117342,'carlos','castano','3953534','carlos.castano@escuelaing.edu.co');

INSERT INTO Profesor
(id_Carnet,nombre_Prof,apellido_Prof,telefono,correo)
VALUES
(2117540,'nicol','patinol','277563','nicol.patiol@escuelaing.edu.co');

---------------------------
-- Monitor

INSERT INTO Monitor
(id_Carnet,nombre_Moni,apellido_Moni,semestre_ingreso,telefono,carrera)
VALUES
(2110541,'camilo','perez',2018,2771823,'sistemas');

INSERT INTO Monitor
(id_Carnet,nombre_Moni,apellido_Moni,semestre_ingreso,telefono,carrera)
VALUES
(2110542,'sergio','nino',2016,2103445,'ambiental');

INSERT INTO Monitor
(id_Carnet,nombre_Moni,apellido_Moni,semestre_ingreso,telefono,carrera)
VALUES
(2110543,'cristian','frias',2014,2771425,'mecanica');

---------------------------
-- Grupo

INSERT INTO Grupo
(Semestre_periodo_Academico,Asignatura_id_Asignatura,Profesor_id_Carnet,numero)
VALUES
('2018/2',4,2117540,1);

INSERT INTO Grupo
(Semestre_periodo_Academico,Asignatura_id_Asignatura,Profesor_id_Carnet,numero)
VALUES
('2018/1',2,2117545,1);

INSERT INTO Grupo
(Semestre_periodo_Academico,Asignatura_id_Asignatura,Profesor_id_Carnet,numero)
VALUES
('2018/i',1,2117342,1);

---------------------------
-- Estudiante

INSERT INTO Estudiante
VALUES
(2112712,'nicolas','patino',1,1);

INSERT INTO Estudiante
VALUES
(2112713,'maria','paula',1,1);

INSERT INTO Estudiante
VALUES
(2112714,'valentina','pulido',1,1);

---------------------------
-- Franja Horario

INSERT INTO Franja_Horario
(id_Franja,Monitor_id_Carnet,Grupo_Asignatura_id_Asignatura,Grupo_numero,fecha)
VALUES
(1000,2110541,4,1,'2018-03-03');

INSERT INTO Franja_Horario
(id_Franja,Monitor_id_Carnet,Grupo_Asignatura_id_Asignatura,Grupo_numero,fecha)
VALUES
(1001,2110542,2,1,'2018-03-03');

INSERT INTO Franja_Horario
(id_Franja,Monitor_id_Carnet,Grupo_Asignatura_id_Asignatura,Grupo_numero,fecha)
VALUES
(1002,2110543,1,1,'2018-03-03');

---------------------------
-- Monitoria

INSERT INTO Monitoria
(id_Mon,ip,observaciones,Franja_id,fecha)
VALUES
(1100,'192.168.1.1','entiende el tema',1000,'2018-03-04');

INSERT INTO Monitoria
(id_Mon,ip,observaciones,Franja_id,fecha)
VALUES
(1101,'192.168.1.2','entiende el tema',1001,'2018-03-05');

INSERT INTO Monitoria
(id_Mon,ip,observaciones,Franja_id,fecha)
VALUES
(1102,'192.168.1.3','entiende el tema',1002,'2018-03-06');

---------------------------
-- Asistencia
INSERT INTO Asistencia
VALUES
(2112712,1100,'2');

INSERT INTO Asistencia
VALUES
(2112713,1101,'1');

INSERT INTO Asistencia
VALUES
(2112714,1102,'3');

