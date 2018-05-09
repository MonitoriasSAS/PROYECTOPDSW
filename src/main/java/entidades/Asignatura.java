/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author 2112076
 */
public class Asignatura {
    private int id;
    private String nombre;
    private Tema tema;  

    public Asignatura(int id, String nombre, Tema tema) {
        this.id = id;
        this.nombre = nombre;
        this.tema = tema;
    }
    
    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Tema getTema() {
        return tema;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     @Override
    public String toString() {
        return "Asignatura{" + "id=" + id + ", nombre=" + nombre + ", tema=" + tema + '}';
    }
}
