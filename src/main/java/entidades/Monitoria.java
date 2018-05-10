/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Andres
 */
public class Monitoria {
    private int id;
    private String ip;
    private String observaciones;
    private Date fecha;
    private Tema tema;
    private FranjaHorario franjaHorario;
    private int idC;
    private int grupo;

    public Monitoria(int id, String ip, Date fecha, Tema tema, FranjaHorario franjaHorario, int idC, int grupo) {
        this.id = id;
        this.ip = ip;
        this.fecha = fecha;
        this.tema = tema;
        this.franjaHorario = franjaHorario;
        this.idC = idC;
        this.grupo = grupo;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Tema getTema() {
        return tema;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public String getIp() {
        return ip;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public void agregarObservacion(String observaciones){
        this.observaciones=observaciones;
    }

    @Override
    public String toString() {
        return "Monitoria{" + "id=" + id + ", ip=" + ip + ", observaciones=" + observaciones + ", fecha=" + fecha + ", tema=" + tema + ", franjaHorario=" + franjaHorario + ", idC=" + idC + ", grupo=" + grupo + '}';
    }

    
}
