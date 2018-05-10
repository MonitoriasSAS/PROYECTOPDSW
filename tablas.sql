
-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-04-25 02:51:11.743
-- tables

CREATE TABLE IF NOT EXISTS Semestre (
   periodo_Academico varchar  NOT NULL,
   fecha_Inicio date  NOT NULL,
   fecha_Fin date  NOT NULL,
   CONSTRAINT Semestre_pk PRIMARY KEY (periodo_Academico)
);

CREATE TABLE IF NOT EXISTS Asignatura (
   id_Asignatura int  NOT NULL,
   nombre_Asig varchar(4)  NOT NULL,
   Tema_TemaID varchar(20)  NOT NULL,
   CONSTRAINT Asignatura_pk PRIMARY KEY (id_Asignatura)
);
CREATE TABLE IF NOT EXISTS Profesor (
   id_Carnet int  NOT NULL,
   nombre_Prof varchar(20)  NOT NULL,
   apellido_Prof varchar(20)  NOT NULL,
   telefono int  NOT NULL,
   correo varchar(100)  NOT NULL,
   --CONSTRAINT Profesor_ak_1 UNIQUE (correo) NOT DEFERRABLE  INITIALLY IMMEDIATE,
   --CONSTRAINT Profesor_ak_2 UNIQUE (telefono) NOT DEFERRABLE  INITIALLY IMMEDIATE,
   CONSTRAINT Profesor_pk PRIMARY KEY (id_Carnet)
);

CREATE TABLE IF NOT EXISTS Monitor (
   id_Carnet int  NOT NULL,
   nombre_Moni varchar(20)  NOT NULL,
   apellido_Moni varchar(20)  NOT NULL,
   semestre_ingreso int  NOT NULL,
   telefono int  NOT NULL,
   carrera varchar(20)  NOT NULL,
   CONSTRAINT Monitor_pk PRIMARY KEY (id_Carnet)
);

CREATE TABLE IF NOT EXISTS Grupo (
   Semestre_periodo_Academico varchar  NOT NULL,
   Asignatura_id_Asignatura int  NOT NULL,
   Profesor_id_Carnet int  NOT NULL,
   numero int  NOT NULL,
   CONSTRAINT Grupo_pk PRIMARY KEY (Asignatura_id_Asignatura,numero)
);

CREATE TABLE IF NOT EXISTS Tema (
   TemaID varchar(20)  NOT NULL,
   nombre varchar(50)  NOT NULL,
   CONSTRAINT Tema_pk PRIMARY KEY (TemaID)
);

CREATE TABLE IF NOT EXISTS Franja_Horario (
   id_Franja int  NOT NULL,
   Monitor_id_Carnet int  NOT NULL,
   Grupo_Asignatura_id_Asignatura int  NOT NULL,
   Grupo_numero int  NOT NULL,
   fecha timestamp  NOT NULL,
   CONSTRAINT Franja_Horario_pk PRIMARY KEY (id_Franja)
);

CREATE TABLE IF NOT EXISTS Monitoria (
   id_Mon int  NOT NULL,
   ip varchar(15)  NOT NULL,
   observaciones varchar(100)  NOT NULL,
   Franja_id int  ,
   fecha timestamp  NOT NULL,
   id_carnet int NOT NULL,
   grupo int NOT NULL,
   CONSTRAINT Monitoria_pk PRIMARY KEY (id_Mon)
);

CREATE TABLE IF NOT EXISTS Asistencia (
   Monitoria_id_Monitoria int  NOT NULL,
   Tema_TemaID varchar(20)  NOT NULL,
   CONSTRAINT Asistencia_pk PRIMARY KEY (Monitoria_id_Monitoria)
);

CREATE TABLE IF NOT EXISTS Observaciones (
   idobs int NOT NULL,
   id_car int NOT NULL,
   Monitor_id_Carnet int NOT NULL,
   observacion varchar(100),
   CONSTRAINT obs_pk PRIMARY KEY (idobs) 
);
/*
-----------------------------------------
--Foraneas
ALTER TABLE Grupo
ADD CONSTRAINT FK_Semestre_Periodo
FOREIGN KEY (Semestre_periodo_Academico)
REFERENCES Semestre(periodo_Academico);

ALTER TABLE Grupo
ADD CONSTRAINT FK_id_Asignatura
FOREIGN KEY (Asignatura_id_Asignatura)
REFERENCES  Asignatura(id_Asignatura)
ALTER TABLE Asignatura
ADD CONSTRAINT FK_TemaID_Asi
FOREIGN KEY (Tema_TemaID)
REFERENCES Tema(TemaID);

ALTER TABLE Grupo
ADD CONSTRAINT FK_ProfesorID
FOREIGN KEY (Profesor_id_Carnet)
REFERENCES Profesor(id_Carnet);

ALTER TABLE Franja_Horario
ADD CONSTRAINT FK_MonitorID
FOREIGN KEY (Monitor_id_Carnet)
REFERENCES Monitor(id_Carnet);

ALTER TABLE Franja_Horario
ADD CONSTRAINT FK_Grupo_asig
FOREIGN KEY (Grupo_Asignatura_id_Asignatura)
REFERENCES Grupo(Asignatura_id_Asignatura);

ALTER TABLE Franja_Horario
ADD CONSTRAINT FK_Grupo_numeroFra
FOREIGN KEY (Grupo_numero)
REFERENCES Grupo(numero);

ALTER TABLE Monitoria
ADD CONSTRAINT FK_FranjaID
FOREIGN KEY (Franja_id)
REFERENCES Franja_Horario(id_Franja);

ALTER TABLE Asistencia
ADD CONSTRAINT FK_Monitoria_id_Monito
FOREIGN KEY (Monitoria_id_Monitoria)
REFERENCES Monitoria(id_Mon);

ALTER TABLE Asistencia
ADD CONSTRAINT FK_Tema_id_Tema
FOREIGN KEY (Tema_TemaID)
REFERENCES Tema(TemaID);

ALTER TABLE Observaciones
ADD CONSTRAINT FK_Monitor_id_Carnet
FOREIGN KEY (Monitor_id_Carnet)
REFERENCES Monitor(id_Carnet);
*/
