package Model;

import java.util.Date;

public class AutorBEAN {

    private int idAutor;
    private String Nome_Autor;
    private String Telefone_Autor;
    private String Endereço_Autor;
    private String Email_Autor;
    private String CPF_Autor;
    private String RG_Autor;
    private Date Data_de_Nas;
    private Boolean Autor_Ativo;

    public AutorBEAN() {
        }

    @Override
    public String toString() {
        return "Autor: " + idAutor + "\n Nome do Autor= " + Nome_Autor + "\n Telefone= " + Telefone_Autor + "\n Endereco= " + Endereço_Autor + "\n Email= " + Email_Autor + "\n CPF= " + CPF_Autor + "\n RG= " + RG_Autor + "\n Data de Nascimento= " + Data_de_Nas + "\n STATUS= " + Autor_Ativo + "\n";

    }

    public AutorBEAN(int idAutor, String Nome_Autor, String Telefone_Autor, String Endereço_Autor,
            String Email_Autor, String CPF_Autor, String RG_Autor, Date Data_de_Nas, Boolean Ativo) {
        this.idAutor = idAutor;
        this.Nome_Autor = Nome_Autor;
        this.Telefone_Autor = Telefone_Autor;
        this.Endereço_Autor = Endereço_Autor;
        this.Email_Autor = Email_Autor;
        this.CPF_Autor = CPF_Autor;
        this.RG_Autor = RG_Autor;
        this.Data_de_Nas = Data_de_Nas;
        this.Autor_Ativo = Ativo;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNome_Autor() {
        return Nome_Autor;
    }

    public void setNome_Autor(String Nome_Autor) {
        this.Nome_Autor = Nome_Autor;
    }

    public String getTelefone_Autor() {
        return Telefone_Autor;
    }

    public void setTelefone_Autor(String Telefone_Autor) {
        this.Telefone_Autor = Telefone_Autor;
    }

    public String getEndereço_Autor() {
        return Endereço_Autor;
    }

    public void setEndereço_Autor(String Endereço_Autor) {
        this.Endereço_Autor = Endereço_Autor;
    }

    public String getEmail_Autor() {
        return Email_Autor;
    }

    public void setEmail_Autor(String Email_Autor) {
        this.Email_Autor = Email_Autor;
    }

    public String getCPF_Autor() {
        return CPF_Autor;
    }

    public void setCPF_Autor(String CPF_Autor) {
        this.CPF_Autor = CPF_Autor;
    }

    public String getRG_Autor() {
        return RG_Autor;
    }

    public void setRG_Autor(String RG_Autor) {
        this.RG_Autor = RG_Autor;
    }

    public Date getData_de_Nas() {
        return Data_de_Nas;
    }

    public void setData_de_Nas(Date Data_de_Nas) {
        this.Data_de_Nas = Data_de_Nas;
    }

    public Boolean getAutor_Ativo() {
        return Autor_Ativo;
    }

    public void setAutor_Ativo(Boolean Autor_Ativo) {
        this.Autor_Ativo = Autor_Ativo;
    }

}
