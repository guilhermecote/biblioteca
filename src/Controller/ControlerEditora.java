package Controller;

import Model.EditoraBEAN;
import Model.EditoraDAO;
import java.util.ArrayList;
import java.util.Date;
import Model.EditoraBEAN;
import Model.EditoraDAO;

public class ControlerEditora {

    public ControlerEditora() {
    }

    public void addEditora(EditoraBEAN editora) {
        EditoraDAO.getInstance().create(editora);
    }

    public void updateEditora(EditoraBEAN editora) {
        EditoraDAO.getInstance().update(editora);
    }

    public void deleteEditora(int id) {
        EditoraDAO.getInstance().delete(id);
    }

    public EditoraBEAN findEditora(int id) {
        return EditoraDAO.getInstance().findEditora(id);
    }

    public int findIdEditora(EditoraBEAN editora) {
        return EditoraDAO.getInstance().findId(editora);
    }

    public Boolean isExist(int id) {
        return EditoraDAO.getInstance().isExist(id);
    }

    public ArrayList<EditoraBEAN> listaEditora() {
        return EditoraDAO.getInstance().findAllPessoa();
    }

    public ArrayList<EditoraBEAN> listaEditoras() {
        return EditoraDAO.getInstance().findAllEditoras();
    }

    public ArrayList<EditoraBEAN> listaEditorasAtivos() {
        return EditoraDAO.getInstance().findAllEditorasAtivas();
    }

    public ArrayList<EditoraBEAN> findByNome(String nome) {
        return EditoraDAO.getInstance().findByNome(nome);
    }

    public ArrayList<EditoraBEAN> findByNomeAndAtivo(String nome) {
        return EditoraDAO.getInstance().findByNomeAndAtivo(nome);
    }
}
