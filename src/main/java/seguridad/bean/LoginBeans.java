/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.bean;
import entidades.Estudiante;
import logica.servicios.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
/**
 *
 * @author CARLOS
 */
@ManagedBean(name = "beanLogin")
@SessionScoped
 public class LoginBeans implements Serializable {
    private String usuario;
    private String contrasena;
    
    public LoginBeans() {
        
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String login) {
        this.usuario = login;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String cos) {
        this.contrasena = cos;
    }

}

