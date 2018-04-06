package Model;

public class ObraBEAN {

    private int idObras;
    private String Nome_Obras;
    private int Edição_Obras;
    private int Ano_Obras;
    private Boolean Ativo_Obras;
    private int id_editora;

    public ObraBEAN() {
    }

    @Override
    public String toString() {
        return "Obra: " + idObras
                + "\n Nome do Obra= " + Nome_Obras
                + "\n Ano Obras= " + Ano_Obras
                + "\n Edição Obras= " + Edição_Obras
                + "\n STATUS= " + Ativo_Obras + "\n";

    }

    public ObraBEAN(int idObras, String Nome_Obras, int Edição_Obras, int Ano_Obras, Boolean Ativo_Obras, int id_editora) {
        this.idObras = idObras;
        this.Nome_Obras = Nome_Obras;
        this.Edição_Obras = Edição_Obras;
        this.Ano_Obras = Ano_Obras;
        this.Ativo_Obras = Ativo_Obras;
        this.id_editora = id_editora;
    }

    public int getIdObras() {
        return idObras;
    }

    public void setIdObras(int idObras) {
        this.idObras = idObras;
    }

    public String getNome_Obras() {
        return Nome_Obras;
    }

    public void setNome_Obras(String Nome_Obras) {
        this.Nome_Obras = Nome_Obras;
    }

    public int getEdição_Obras() {
        return Edição_Obras;
    }

    public void setEdição_Obras(int Edição_Obras) {
        this.Edição_Obras = Edição_Obras;
    }

    public int getAno_Obras() {
        return Ano_Obras;
    }

    public void setAno_Obras(int Ano_Obras) {
        this.Ano_Obras = Ano_Obras;
    }

    public Boolean getAtivo_Obras() {
        return Ativo_Obras;
    }

    public void setAtivo_Obras(Boolean Ativo_Obras) {
        this.Ativo_Obras = Ativo_Obras;
    }

    public int getId_editora() {
        return id_editora;
    }

    public void setId_editora(int id_editora) {
        this.id_editora = id_editora;
    }

}
