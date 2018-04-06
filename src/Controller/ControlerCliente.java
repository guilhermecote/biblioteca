package Controller;

import java.util.ArrayList;
import Model.ClienteBEAN;
import Model.ClienteDAO;

public class ControlerCliente {

    public ControlerCliente() {
    }

    public void addCliente(ClienteBEAN autor) {
        ClienteDAO.getInstance().create(autor);
    }

    public void ativaCliente(ClienteBEAN autor) {
        ClienteDAO.getInstance().ativo(autor);
    }

    public void updateCliente(ClienteBEAN autor) {
        ClienteDAO.getInstance().update(autor);
    }

    public void deleteCliente(int id) {
        ClienteDAO.getInstance().delete(id);
    }

    public ClienteBEAN findCliente(int id) {
        return ClienteDAO.getInstance().findCliente(id);
    }

    public ArrayList<ClienteBEAN> findByNome(String nome) {
        return ClienteDAO.getInstance().findByNome(nome);
    }

    public ArrayList<ClienteBEAN> findByNomeAndAtivo(String nome) {
        return ClienteDAO.getInstance().findByNomeAndAtivo(nome);
    }

    public int findIdCliente(ClienteBEAN autor) {
        return ClienteDAO.getInstance().findId(autor);
    }

    public Boolean isExist(int id) {
        return ClienteDAO.getInstance().isExist(id);
    }

    public ArrayList<ClienteBEAN> listaClientes() {
        return ClienteDAO.getInstance().findAllClientes();
    }

    public ArrayList<ClienteBEAN> listaClienteesAtivos() {
        return ClienteDAO.getInstance().findAllClientesAtivos();
    }
}
