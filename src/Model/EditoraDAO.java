package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EditoraDAO {

    private static EditoraDAO instance;

    public EditoraDAO() {
        MySQLDAO.getConnection();
    }

    public static EditoraDAO getInstance() {
        if (instance == null) {
            instance = new EditoraDAO();
        }
        return instance;
    }

    public long create(EditoraBEAN editora) {
        String query = "INSERT INTO `editora` (`Nome_Editora`, "
                + "`Telefone_Editora`, `Endereço_Editora`, `Email_Editora`, "
                + " `Ativo_Editora`) VALUES (?,?,?,?,?)";
        return MySQLDAO.executeQuery(query, editora.getNome_Editora(), editora.getTelefone_Editora(),
                editora.getEndereço_Editora(), editora.getEmail_Editora(), editora.getAtivo_Editora());
    }

    public void update(EditoraBEAN editora) {
        String query = "UPDATE EDITORA SET Nome_Editora=?, "
                + "Telefone_Editora=?, Endereço_Editora=?, Email_Editora=?, "
                + " Ativo_Editora=? WHERE idEditora = ?";
        MySQLDAO.executeQuery(query, editora.getNome_Editora(), editora.getTelefone_Editora(),
                editora.getEndereço_Editora(), editora.getEmail_Editora(), editora.getAtivo_Editora(), editora.getIdEditora());
    }

    public void delete(int id) {
        String query = "UPDATE EDITORA SET  Ativo_Editora='0' WHERE idEditora = ?";
        MySQLDAO.executeQuery(query, id);
    }

    public void ativo(EditoraBEAN editora) {
        String query = "UPDATE EDITORA SET  Ativo_Editora='true' WHERE idEditora = ?";
        MySQLDAO.executeQuery(query, editora.getIdEditora());
    }

    public ArrayList<EditoraBEAN> findAllPessoa() {
        return listaEditora("SELECT * FROM Editora ORDER BY idEditora");
    }

    public ArrayList<EditoraBEAN> listaEditora(String query) {
        ArrayList<EditoraBEAN> lista = new ArrayList<EditoraBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new EditoraBEAN(rs.getInt("idEditora"), rs.getString("Nome_Editora"), rs.getString("Telefone_Editora"),
                        rs.getString("Endereço_Editora"), rs.getString("Email_Editora"), rs.getBoolean("Ativo_Editora")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public EditoraBEAN findEditora(int id) {
        EditoraBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM Editora WHERE idEditora=?", id);
        try {
            if (rs.next()) {
                result = new EditoraBEAN(rs.getInt("idEditora"), rs.getString("Nome_Editora"), rs.getString("Telefone_Editora"),
                        rs.getString("Endereço_Editora"), rs.getString("Email_Editora"), rs.getBoolean("Ativo_Editora"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<EditoraBEAN> findByNome(String nome) {
        ArrayList<EditoraBEAN> lista = new ArrayList<>();

        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Editoras WHERE Nome_Editoras like ?", "%" + nome + "%");
        try {
            while (rs.next()) {
                lista.add(new EditoraBEAN(rs.getInt("idEditora"), rs.getString("Nome_Editora"), rs.getString("Telefone_Editora"),
                        rs.getString("Endereço_Editora"), rs.getString("Email_Editora"), rs.getBoolean("Ativo_Editora")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<EditoraBEAN> findByNomeAndAtivo(String nome) {
        ArrayList<EditoraBEAN> lista = new ArrayList<>();

        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Editoras WHERE Ativo = '1' and Nome_Editoras like ?", "%" + nome + "%");
        try {
            while (rs.next()) {
                lista.add(new EditoraBEAN(rs.getInt("idEditora"), rs.getString("Nome_Editora"), rs.getString("Telefone_Editora"),
                        rs.getString("Endereço_Editora"), rs.getString("Email_Editora"), rs.getBoolean("Ativo_Editora")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public int findId(EditoraBEAN editora) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM Editora WHERE Nome_Editora=?, "
                + "Telefone_Editora=?, Endereço_Editora=?, Email_Editora=?, "
                + " Ativo_Editora=? WHERE idEditora = ?", editora.getNome_Editora(), editora.getTelefone_Editora(),
                editora.getEndereço_Editora(), editora.getEmail_Editora(), editora.getAtivo_Editora(), editora.getIdEditora());

        try {
            if (rs.next()) {
                result = rs.getInt("idEditora");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean isExist(int id) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM Editora WHERE idEditora= ?", id);
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

    public ArrayList<EditoraBEAN> findAllEditoras() {
        return listaEditora("SELECT * FROM Editora");
    }

    public ArrayList<EditoraBEAN> findAllEditorasAtivas() {
        return listaEditora("SELECT * FROM Editora where Ativo_Editora = '1'");
    }
}
