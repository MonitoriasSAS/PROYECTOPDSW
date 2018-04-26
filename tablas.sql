
-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-04-25 02:51:11.743
-- tables

CREATE TABLE Semestre (
   periodo_Academico varchar  NOT NULL,
   fecha_Inicio date  NOT NULL,
   fecha_Fin date  NOT NULL,
   CONSTRAINT Semestre_pk PRIMARY KEY (periodo_Academico)
);

CREATE TABLE Asignatura (
   id_Asignatura int  NOT NULL,
   nombre_Asig varchar(4)  NOT NULL,
   CONSTRAINT Asignatura_pk PRIMARY KEY (id_Asignatura)
);

CREATE TABLE Profesor (
   id_Carnet int  NOT NULL,
   nombre_Prof varchar(20)  NOT NULL,
   apellido_Prof varchar(20)  NOT NULL,
   telefono int  NOT NULL,
   correo varchar(100)  NOT NULL,
   CONSTRAINT Profesor_ak_1 UNIQUE (correo) NOT DEFERRABLE  INITIALLY IMMEDIATE,
   CONSTRAINT Profesor_ak_2 UNIQUE (telefono) NOT DEFERRABLE  INITIALLY IMMEDIATE,
   CONSTRAINT Profesor_pk PRIMARY KEY (id_Carnet)
);

CREATE TABLE Monitor (
   id_Carnet int  NOT NULL,
   nombre_Moni varchar(20)  NOT NULL,
   apellido_Moni varchar(20)  NOT NULL,
   semestre_ingreso int  NOT NULL,
   telefono int  NOT NULL,
   carrera varchar(20)  NOT NULL,
   CONSTRAINT Monitor_pk PRIMARY KEY (id_Carnet)
);

CREATE TABLE Grupo (
   Semestre_periodo_Academico varchar  NOT NULL,
   Asignatura_id_Asignatura int  NOT NULL,
   Profesor_id_Carnet int  NOT NULL,
   numero int  NOT NULL,
   CONSTRAINT Grupo_pk PRIMARY KEY (Asignatura_id_Asignatura,numero)
);

CREATE TABLE Estudiante (
   id_Carnet int  NOT NULL,
   nombre_Es varchar(20)  NOT NULL,
   apellido_Es varchar(20)  NOT NULL,
   id_Asignatura int  ,
   Grupo_numero int  ,
   CONSTRAINT Estudiante_pk PRIMARY KEY (id_Carnet)
);

CREATE TABLE Tema (
   TemaID varchar(15)  NOT NULL,
   descripcion varchar(100)  NOT NULL,
   Asignatura_id_Asignatura int  ,
   CONSTRAINT Tema_pk PRIMARY KEY (TemaID)
);

CREATE TABLE Franja_Horario (
   id_Franja int  NOT NULL,
   Monitor_id_Carnet int  NOT NULL,
   Grupo_Asignatura_id_Asignatura int  NOT NULL,
   Grupo_numero int  NOT NULL,
   fecha timestamp  NOT NULL,
   CONSTRAINT Franja_Horario_pk PRIMARY KEY (id_Franja)
);

CREATE TABLE Monitoria (
   id_Mon int  NOT NULL,
   ip varchar(15)  NOT NULL,
   observaciones varchar(100)  NOT NULL,
   Franja_id int  ,
   fecha timestamp  NOT NULL,
   CONSTRAINT Monitoria_pk PRIMARY KEY (id_Mon)
);

CREATE TABLE Asistencia (
   Estudiante_id_Carnet int  NOT NULL,
   Monitoria_id_Monitoria int  NOT NULL,
   Tema_TemaID int  NOT NULL,
   CONSTRAINT Asistencia_pk PRIMARY KEY (Estudiante_id_Carnet,Monitoria_id_Monitoria)
);
