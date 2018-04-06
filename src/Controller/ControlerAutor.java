package Controller;

import java.util.ArrayList;
import Model.AutorBEAN;
import Model.AutorDAO;

public class ControlerAutor {

    public ControlerAutor() {
    }

    public void addAutor(AutorBEAN autor) {
        AutorDAO.getInstance().create(autor);
    }

    public void ativaAutor(AutorBEAN autor) {
        AutorDAO.getInstance().ativo(autor);
    }

    public void updateAutor(AutorBEAN autor) {
        AutorDAO.getInstance().update(autor);
    }

    public void deleteAutor(int id) {
        AutorDAO.getInstance().delete(id);
    }

    public AutorBEAN findAutor(int id) {
        return AutorDAO.getInstance().findAutor(id);
    }

    public ArrayList<AutorBEAN> findByNome(String nome) {
        return AutorDAO.getInstance().findByNome(nome);
    }

    public ArrayList<AutorBEAN> findByNomeAndAtivo(String nome) {
        return AutorDAO.getInstance().findByNomeAndAtivo(nome);
    }

    public int findIdAutor(AutorBEAN autor) {
        return AutorDAO.getInstance().findId(autor);
    }

    public Boolean isExist(int id) {
        return AutorDAO.getInstance().isExist(id);
    }

    public ArrayList<AutorBEAN> listaAutores() {
        return AutorDAO.getInstance().findAllAutores();
    }

    public ArrayList<AutorBEAN> listaAutoresAtivos() {
        return AutorDAO.getInstance().findAllAutoresAtivos();
    }

    public ArrayList<AutorBEAN> findByObra(int idObra) {
        return AutorDAO.getInstance().findByObra(idObra);
    }
}
