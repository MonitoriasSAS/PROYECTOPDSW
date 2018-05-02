/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.managedbeans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedProperty;
import seguridad.bean.LoginBean;
/**
 *
 * @author MonitoriasSAS
 */
@ManagedBean(name="Monitor")
@SessionScoped
public class MonitorBean implements Serializable{
    @ManagedProperty(value = "#{loginBean}")
    private LoginBean seguridad;
    public MonitorBean(){
        
    }

    public LoginBean getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(LoginBean seguridad) {
        this.seguridad = seguridad;
    }
}
