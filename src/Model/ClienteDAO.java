package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {

    private static ClienteDAO instance;

    private ClienteDAO() {
        MySQLDAO.getConnection();
    }

    public static ClienteDAO getInstance() {
        if (instance == null) {
            instance = new ClienteDAO();
        }
        return instance;
    }

    public long create(ClienteBEAN clientes) {
        String query = "INSERT INTO `clientes` (`Nome_Clientes`, "
                + "`Telefone_Clientes`, `Endereço_Clientes`, `Email_Clientes`, "
                + "`CPF_Clientes`, `RG_Clientes`, `Data_de_Nas`, `Ativo`) VALUES (?,?,?,?,?,?,?,?)";
        return MySQLDAO.executeQuery(query, clientes.getNome_Clientes(), clientes.getTelefone_Clientes(),
                clientes.getEndereço_Clientes(), clientes.getEmail_Clientes(), clientes.getCPF_Clientes(),
                clientes.getRG_Clientes(), clientes.getData_de_Nas(), clientes.getAtivo());
    }

    public void update(ClienteBEAN clientes) {
        String query = "UPDATE CLIENTES SET Nome_Clientes=?, "
                + "Telefone_Clientes=?, Endereço_Clientes=?, Email_Clientes=?, "
                + "CPF_Clientes=?, RG_Clientes=?, Data_de_Nas=?, Ativo=? WHERE idClientes = ?";
        MySQLDAO.executeQuery(query, clientes.getNome_Clientes(), clientes.getTelefone_Clientes(),
                clientes.getEndereço_Clientes(), clientes.getEmail_Clientes(), clientes.getCPF_Clientes(),
                clientes.getRG_Clientes(), clientes.getData_de_Nas(), clientes.getAtivo(), clientes.getIdClientes());
    }

    public void delete(int id) {
        String query = "UPDATE CLIENTES SET  Ativo='0' WHERE idClientes = ?";
        MySQLDAO.executeQuery(query, id);
    }

    public void ativo(ClienteBEAN clientes) {
        String query = "UPDATE CLIENTES SET  Ativo='1' WHERE idClientes = ?";
        MySQLDAO.executeQuery(query, clientes.getIdClientes());
    }

    public ArrayList<ClienteBEAN> findAllPessoa() {
        return listaClientes("SELECT * FROM Clientes ORDER BY idClientes");
    }

    public ArrayList<ClienteBEAN> listaClientes(String query) {
        ArrayList<ClienteBEAN> lista = new ArrayList<ClienteBEAN>();
        ResultSet rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new ClienteBEAN(rs.getInt("idClientes"), rs.getString("Nome_Clientes"), rs.getString("Telefone_Clientes"),
                        rs.getString("Endereço_Clientes"), rs.getString("Email_Clientes"), rs.getString("CPF_Clientes"),
                        rs.getString("RG_Clientes"), rs.getDate("Data_de_Nas"), rs.getBoolean("Ativo")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ClienteBEAN findCliente(int id) {
        ClienteBEAN result = null;
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Clientes WHERE idClientes=?", id);
        try {
            if (rs.next()) {
                result = new ClienteBEAN(rs.getInt("idClientes"), rs.getString("Nome_Clientes"), rs.getString("Telefone_Clientes"),
                        rs.getString("Endereço_Clientes"), rs.getString("Email_Clientes"), rs.getString("CPF_Clientes"),
                        rs.getString("RG_Clientes"), rs.getDate("Data_de_Nas"), rs.getBoolean("Ativo"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<ClienteBEAN> findByNome(String nome) {
        ArrayList<ClienteBEAN> lista = new ArrayList<>();

        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Clientes WHERE Nome_Clientes like ?", "%" + nome + "%");
        try {
            while (rs.next()) {
                lista.add(new ClienteBEAN(rs.getInt("idClientes"), rs.getString("Nome_Clientes"), rs.getString("Telefone_Clientes"),
                        rs.getString("Endereço_Clientes"), rs.getString("Email_Clientes"), rs.getString("CPF_Clientes"),
                        rs.getString("RG_Clientes"), rs.getDate("Data_de_Nas"), rs.getBoolean("Ativo")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<ClienteBEAN> findByNomeAndAtivo(String nome) {
        ArrayList<ClienteBEAN> lista = new ArrayList<>();

        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Clientes WHERE Ativo = '1' and Nome_Clientes like ?", "%" + nome + "%");
        try {
            while (rs.next()) {
                lista.add(new ClienteBEAN(rs.getInt("idClientes"), rs.getString("Nome_Clientes"), rs.getString("Telefone_Clientes"),
                        rs.getString("Endereço_Clientes"), rs.getString("Email_Clientes"), rs.getString("CPF_Clientes"),
                        rs.getString("RG_Clientes"), rs.getDate("Data_de_Nas"), rs.getBoolean("Ativo")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public int findId(ClienteBEAN clientes) {
        int result = 0;
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Clientes WHERE Nome_Clientes=?, "
                + "Telefone_Clientes=?, Endereço_Clientes=?, Email_Clientes=?, "
                + "CPF_Clientes=?, RG_Clientes=?, Data_de_Nas=?, Ativo=? WHERE idClientes = ?", clientes.getNome_Clientes(), clientes.getTelefone_Clientes(),
                clientes.getEndereço_Clientes(), clientes.getEmail_Clientes(), clientes.getCPF_Clientes(),
                clientes.getRG_Clientes(), clientes.getData_de_Nas(), clientes.getAtivo(), clientes.getIdClientes());

        try {
            if (rs.next()) {
                result = rs.getInt("idClientes");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean isExist(int id) {
        Boolean result = false;
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Clientes WHERE idClientes= ?", id);
        try {
            if (rs.next()) {
                result = true;
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<ClienteBEAN> findAllClientes() {
        return listaClientes("SELECT * FROM Clientes");
    }

    public ArrayList<ClienteBEAN> findAllClientesAtivos() {
        return listaClientes("SELECT * FROM Clientes where Ativo = '1'");
    }

}
