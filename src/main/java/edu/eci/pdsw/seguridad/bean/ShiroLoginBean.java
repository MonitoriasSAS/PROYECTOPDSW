/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.seguridad.bean;

//prueba quitando el shiro

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author MonitoriasSAS
 */

@ManagedBean(name = "loginBean", eager = true)
@SessionScoped
public class ShiroLoginBean implements Serializable {
    //prueba quitando el shiro
    private static final Logger log = LoggerFactory.getLogger(ShiroLoginBean.class);
    private String username;
    private String password;
    
    public ShiroLoginBean() {
        
    }
     
    public Subject getSubject() {
        return SecurityUtils.getSubject();
    }
    
     public void doLogin() {
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(getUsername(), getPassword());

        try {
            subject.login(token);
            if(subject.hasRole("profesor")){
                FacesContext.getCurrentInstance().getExternalContext().redirect("inicioProfesor.xhtml");
            }
            else if (subject.hasRole("monitor")) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("inicioMonitor.xhtml");
            }
            else if (subject.hasRole("admin")) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("inicioAdmin.xhtml");
            } 
            else {
                FacesContext.getCurrentInstance().getExternalContext().redirect("AccesoDenegado.xhtml");
            }
        }
        catch (UnknownAccountException ex) {
            facesError("Unknown account");
            log.error(ex.getMessage(), ex);
        }
        catch (IncorrectCredentialsException ex) {
            facesError("Wrong password");
            log.error(ex.getMessage(), ex);
        }
        catch (LockedAccountException ex) {
            facesError("Locked account");
            log.error(ex.getMessage(), ex);
        }
        catch (AuthenticationException | IOException ex) {
            facesError("Unknown error: " + ex.getMessage());
            log.error(ex.getMessage(), ex);
        }

        finally {
            token.clear();
        }
    }
    
     
    private void facesError(String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, message, null));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String login) {
        this.username = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String senha) {
        this.password = senha;
    }
}
