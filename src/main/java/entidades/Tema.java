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
public class Tema {
    private String id;
    private String name;
    private Asignatura asignatura;

    public Tema(){
        
    }
    public Tema(String id, String name, Asignatura asignatura) {
        this.id = id;
        this.name = name;
        this.asignatura = asignatura;
    }
    

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tema{" + "id=" + id + ", name=" + name + ", asignatura=" + asignatura + '}';
    }
    
}
