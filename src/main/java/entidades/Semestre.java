package entidades;




import java.util.Date;

/**
 *
 * @author 2112076
 */
public class Semestre {
    private String periodo;
    private Date inicio;
    private Date fin;

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

}
