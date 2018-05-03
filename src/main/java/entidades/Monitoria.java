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
    
}
