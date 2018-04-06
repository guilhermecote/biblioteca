package Model;

import java.util.Date;

public class EmprestimosBEAN {

    private int id_emprestimo;
    private Date dtSaida;
    private Date dtVolta;
    private Date dtRetorno;
    private int id_cliente;

    public EmprestimosBEAN() {

    }

    public EmprestimosBEAN(int id_emprestimo, Date dtSaida, Date dtVolta, Date dtRetorno, int id_cliente) {
        this.id_emprestimo = id_emprestimo;
        this.dtSaida = dtSaida;
        this.dtVolta = dtVolta;
        this.dtRetorno = dtRetorno;
        this.id_cliente = id_cliente;
    }

    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public Date getDtVolta() {
        return dtVolta;
    }

    public void setDtVolta(Date dtVolta) {
        this.dtVolta = dtVolta;
    }

    public Date getDtRetorno() {
        return dtRetorno;
    }

    public void setDtRetorno(Date dtRetorno) {
        this.dtRetorno = dtRetorno;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

}
