/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Andres
 */
public class Monitoria {
    private int id;
    private String ip;
    private String observaciones;
    private String tema;

    public void setId(int id) {
        this.id = id;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setTema(String tema) {
        this.tema = tema;
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

    public String getTema() {
        return tema;
    }
    
}
