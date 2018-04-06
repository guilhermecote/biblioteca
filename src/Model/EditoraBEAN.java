package Model;

import java.util.Date;

public class EditoraBEAN {

    private int idEditora;
    private String Nome_Editora;
    private String Telefone_Editora;
    private String Endereço_Editora;
    private String Email_Editora;
    private Boolean Ativo_Editora;

    @Override
    public String toString() {
        return "Editora: " + idEditora + "\n Nome do Editora= " + Nome_Editora
                + "\n Telefone= " + Telefone_Editora
                + "\n Endereco= " + Endereço_Editora
                + "\n Email= " + Email_Editora
                + "\n STATUS= " + Ativo_Editora + "\n";

    }

    public EditoraBEAN() {

    }

    public EditoraBEAN(int idEditora, String Nome_Editora, String Telefone_Editora, String Endereço_Editora,
            String Email_Editora, Boolean Ativo) {
        this.idEditora = idEditora;
        this.Nome_Editora = Nome_Editora;
        this.Telefone_Editora = Telefone_Editora;
        this.Endereço_Editora = Endereço_Editora;
        this.Email_Editora = Email_Editora;
        this.Ativo_Editora = Ativo;
    }

    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getNome_Editora() {
        return Nome_Editora;
    }

    public void setNome_Editora(String Nome_Editora) {
        this.Nome_Editora = Nome_Editora;
    }

    public String getTelefone_Editora() {
        return Telefone_Editora;
    }

    public void setTelefone_Editora(String Telefone_Editora) {
        this.Telefone_Editora = Telefone_Editora;
    }

    public String getEndereço_Editora() {
        return Endereço_Editora;
    }

    public void setEndereço_Editora(String Endereço_Editora) {
        this.Endereço_Editora = Endereço_Editora;
    }

    public String getEmail_Editora() {
        return Email_Editora;
    }

    public void setEmail_Editora(String Email_Editora) {
        this.Email_Editora = Email_Editora;
    }

    public Boolean getAtivo_Editora() {
        return Ativo_Editora;
    }

    public void setAtivo_Editora(Boolean Ativo_Editora) {
        this.Ativo_Editora = Ativo_Editora;
    }

}
