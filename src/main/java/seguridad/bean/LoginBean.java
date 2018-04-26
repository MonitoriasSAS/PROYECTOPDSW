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
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.security.auth.Subject;
import org.apache.log4j.spi.LoggerFactory;
import org.primefaces.util.SecurityUtils;
import org.slf4j.Logger;
/**
 *
 * @author nicolas
 */
@ManagedBean(name = "beanLogin", eager = true)
@SessionScoped
 public class LoginBean implements Serializable {
    private static final Logger log = LoggerFactory.getLogger(LoginBean.class);
    

    private String usuario;
    private String contrasena;
    
    public LoginBean() {
        
    }
    public Subject getSubject() {
        return SecurityUtils.getSubject();
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
    public void doLogin() {
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(getUsername(), getPassword(), getRememberMe());

        try {
            subject.login(token);

            if (subject.hasRole("estudiante")) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("estudiante/serviciocancelaciones.xhtml");
            }  
            else if(subject.hasRole("directivo")){
                FacesContext.getCurrentInstance().getExternalContext().redirect("directivo/consultarparametros.xhtml");
            }
            else if(subject.hasRole("consejero")){
                FacesContext.getCurrentInstance().getExternalContext().redirect("consejero/listadosolcancel.xhtml");
            }
            else {
                FacesContext.getCurrentInstance().getExternalContext().redirect("unauthorized.xhtml");
            }
        }
}