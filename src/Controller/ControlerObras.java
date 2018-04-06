package Controller;

import java.util.ArrayList;
import Model.ObraBEAN;
import Model.ObraDAO;
import java.util.List;

public class ControlerObras {

    public ControlerObras() {
    }

    public void addObra(ObraBEAN obra, List<Integer> autores) {
        ObraDAO.getInstance().create(obra, autores);
    }

    public void updateObra(ObraBEAN obra, List<Integer> autores) {
        ObraDAO.getInstance().update(obra, autores);
    }

    public void deleteObra(int id) {
        ObraDAO.getInstance().delete(id);
    }

    public ObraBEAN findObra(int id) {
        return ObraDAO.getInstance().findObra(id);
    }

    public int findIdObra(ObraBEAN obra) {
        return ObraDAO.getInstance().findId(obra);
    }

    public Boolean isExist(int id) {
        return ObraDAO.getInstance().isExist(id);
    }

    public ArrayList<ObraBEAN> listaObras() {
        return ObraDAO.getInstance().findAllObra();
    }

    public ArrayList<ObraBEAN> findByNome(String nome) {
        return ObraDAO.getInstance().findByNome(nome);
    }

    public ArrayList<ObraBEAN> findByNomeAndAtiva(String nome) {
        return ObraDAO.getInstance().findByNomeAndAtiva(nome);
    }

    public ArrayList<ObraBEAN> listaObrasAtivas() {
        return ObraDAO.getInstance().listaObrasAtivas();
    }

    public ArrayList<ObraBEAN> findByEmprestimo(int idEmprestimo) {
        return ObraDAO.getInstance().findByEmprestimo(idEmprestimo);
    }
}
