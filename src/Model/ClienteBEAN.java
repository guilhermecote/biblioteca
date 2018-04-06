package Model;

import java.util.Date;

public class ClienteBEAN {

    private int idClientes;
    private String Nome_Clientes;
    private String Telefone_Clientes;
    private String Endereço_Clientes;
    private String Email_Clientes;
    private String CPF_Clientes;
    private String RG_Clientes;
    private Date Data_de_Nas;
    private Boolean Ativo;

    public ClienteBEAN() {
    }

    @Override
    public String toString() {
        return "Cliente: " + idClientes + "\n Nome do Cliente= " + Nome_Clientes + "\n Telefone= " + Telefone_Clientes + "\n Endereco= " + Endereço_Clientes + "\n Email= " + Email_Clientes + "\n CPF= " + CPF_Clientes + "\n RG= " + RG_Clientes + "\n Data de Nascimento= " + Data_de_Nas + "\n STATUS= " + Ativo + "\n";

    }

    public ClienteBEAN(int idClientes, String Nome_Clientes, String Telefone_Clientes, String Endereço_Clientes,
            String Email_Clientes, String CPF_Clientes, String RG_Clientes, Date Data_de_Nas, Boolean Ativo) {
        this.idClientes = idClientes;
        this.Nome_Clientes = Nome_Clientes;
        this.Telefone_Clientes = Telefone_Clientes;
        this.Endereço_Clientes = Endereço_Clientes;
        this.Email_Clientes = Email_Clientes;
        this.CPF_Clientes = CPF_Clientes;
        this.RG_Clientes = RG_Clientes;
        this.Data_de_Nas = Data_de_Nas;
        this.Ativo = Ativo;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getNome_Clientes() {
        return Nome_Clientes;
    }

    public void setNome_Clientes(String Nome_Clientes) {
        this.Nome_Clientes = Nome_Clientes;
    }

    public String getTelefone_Clientes() {
        return Telefone_Clientes;
    }

    public void setTelefone_Clientes(String Telefone_Clientes) {
        this.Telefone_Clientes = Telefone_Clientes;
    }

    public String getEndereço_Clientes() {
        return Endereço_Clientes;
    }

    public void setEndereço_Clientes(String Endereço_Clientes) {
        this.Endereço_Clientes = Endereço_Clientes;
    }

    public String getEmail_Clientes() {
        return Email_Clientes;
    }

    public void setEmail_Clientes(String Email_Clientes) {
        this.Email_Clientes = Email_Clientes;
    }

    public String getCPF_Clientes() {
        return CPF_Clientes;
    }

    public void setCPF_Clientes(String CPF_Clientes) {
        this.CPF_Clientes = CPF_Clientes;
    }

    public String getRG_Clientes() {
        return RG_Clientes;
    }

    public void setRG_Clientes(String RG_Clientes) {
        this.RG_Clientes = RG_Clientes;
    }

    public Date getData_de_Nas() {
        return Data_de_Nas;
    }

    public void setData_de_Nas(Date Data_de_Nas) {
        this.Data_de_Nas = Data_de_Nas;
    }

    public Boolean getAtivo() {
        return Ativo;
    }

    public void setAtivo(Boolean Ativo) {
        this.Ativo = Ativo;
    }

}
