package edu.eci.pdsw.entidades;




import java.util.Date;
import java.util.List;

/**
 *
 * @author MonitoriasSAS
 */
public class Semestre {
    private String periodo;
    private Date inicio;
    private Date fin;
    public Semestre(){
        
    }
    public Semestre(String periodo, Date inicio, Date fin) {
        this.periodo = periodo;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Semestre{" + "periodo=" + periodo + ", inicio=" + inicio + ", fin=" + fin + '}';
    }

   
    
}
