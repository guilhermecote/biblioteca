package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AutorDAO {

    private static AutorDAO instance;

    private AutorDAO() {
        MySQLDAO.getConnection();
    }

    public static AutorDAO getInstance() {
        if (instance == null) {
            instance = new AutorDAO();
        }
        return instance;
    }

    public long create(AutorBEAN autor) {
        System.out.println("OK");
        String query = "INSERT INTO `autores` (`Nome_Autor`, "
                + "`Telefone_Autor`, `Endereço_Autor`, `Email_Autor`, "
                + "`CPF_Autor`, `RG_Autor`, `Data_de_Nas`, `Autor_Ativo`) VALUES (?,?,?,?,?,?,?,?)";
        return MySQLDAO.executeQuery(query, autor.getNome_Autor(), autor.getTelefone_Autor(),
                autor.getEndereço_Autor(), autor.getEmail_Autor(), autor.getCPF_Autor(),
                autor.getRG_Autor(), autor.getData_de_Nas(), autor.getAutor_Ativo());
    }

    public void update(AutorBEAN autor) {
        String query = "UPDATE AUTORES SET Nome_Autor=?, "
                + "Telefone_Autor=?, Endereço_Autor=?, Email_Autor=?, "
                + "CPF_Autor=?, RG_Autor=?, Data_de_Nas=?, Autor_Ativo=? WHERE idAutor = ?";
        MySQLDAO.executeQuery(query, autor.getNome_Autor(), autor.getTelefone_Autor(),
                autor.getEndereço_Autor(), autor.getEmail_Autor(), autor.getCPF_Autor(),
                autor.getRG_Autor(), autor.getData_de_Nas(), autor.getAutor_Ativo(), autor.getIdAutor());
    }

    public void delete(int id) {
        String query = "UPDATE AUTORES SET  Autor_Ativo='0' WHERE idAutor = ?";
        MySQLDAO.executeQuery(query, id);
    }

    public void ativo(AutorBEAN autor) {
        String query = "UPDATE AUTORES SET  Autor_Ativo='1' WHERE idAutor = ?";
        MySQLDAO.executeQuery(query, autor.getIdAutor());
    }

    public ArrayList<AutorBEAN> findAllAutores() {
        return listaAutores("SELECT * FROM Autores");
    }

    public ArrayList<AutorBEAN> findAllAutoresAtivos() {
        return listaAutores("SELECT * FROM Autores where Autor_Ativo = '1'");
    }

    public ArrayList<AutorBEAN> listaAutores(String query) {
        ArrayList<AutorBEAN> lista = new ArrayList<>();
        ResultSet rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new AutorBEAN(rs.getInt("idAutor"), rs.getString("Nome_Autor"), rs.getString("Telefone_Autor"),
                        rs.getString("Endereço_Autor"), rs.getString("Email_Autor"), rs.getString("CPF_Autor"),
                        rs.getString("RG_Autor"), rs.getDate("Data_de_Nas"), rs.getBoolean("Autor_Ativo")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public AutorBEAN findAutor(int id) {
        AutorBEAN result = null;
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Autores WHERE idAutor=?", id);
        try {
            if (rs.next()) {
                result = new AutorBEAN(rs.getInt("idAutor"), rs.getString("Nome_Autor"), rs.getString("Telefone_Autor"),
                        rs.getString("Endereço_Autor"), rs.getString("Email_Autor"), rs.getString("CPF_Autor"),
                        rs.getString("RG_Autor"), rs.getDate("Data_de_Nas"), rs.getBoolean("Autor_Ativo"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<AutorBEAN> findByNome(String nome) {
        ArrayList<AutorBEAN> lista = new ArrayList<>();
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Autores WHERE Nome_Autor like ?", "%" + nome + "%");
        try {
            while (rs.next()) {
                lista.add(new AutorBEAN(rs.getInt("idAutor"), rs.getString("Nome_Autor"), rs.getString("Telefone_Autor"),
                        rs.getString("Endereço_Autor"), rs.getString("Email_Autor"), rs.getString("CPF_Autor"),
                        rs.getString("RG_Autor"), rs.getDate("Data_de_Nas"), rs.getBoolean("Autor_Ativo")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<AutorBEAN> findByNomeAndAtivo(String nome) {
        ArrayList<AutorBEAN> lista = new ArrayList<>();
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Autores WHERE Autor_Ativo = '1' and Nome_Autor like ?", "%" + nome + "%");
        try {
            while (rs.next()) {
                lista.add(new AutorBEAN(rs.getInt("idAutor"), rs.getString("Nome_Autor"), rs.getString("Telefone_Autor"),
                        rs.getString("Endereço_Autor"), rs.getString("Email_Autor"), rs.getString("CPF_Autor"),
                        rs.getString("RG_Autor"), rs.getDate("Data_de_Nas"), rs.getBoolean("Autor_Ativo")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public int findId(AutorBEAN autor) {
        int result = 0;
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Autores WHERE Nome_Autor=?, "
                + "Telefone_Autor=?, Endereço_Autor=?, Email_Autor=?, "
                + "CPF_Autor=?, RG_Autor=?, Data_de_Nas=?, Autor_Ativo=? WHERE idAutor = ?", autor.getNome_Autor(), autor.getTelefone_Autor(),
                autor.getEndereço_Autor(), autor.getEmail_Autor(), autor.getCPF_Autor(),
                autor.getRG_Autor(), autor.getData_de_Nas(), autor.getAutor_Ativo(), autor.getIdAutor());

        try {
            if (rs.next()) {
                result = rs.getInt("idAutor");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean isExist(int id) {
        Boolean result = false;
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Autores WHERE idAutor= ?", id);
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

    public ArrayList<AutorBEAN> findByObra(int idObra) {
        ArrayList<AutorBEAN> lista = new ArrayList<>();
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Autores a INNER JOIN aux_autores_obras aux on aux.Autores_idAutores = a.idAutor "
                + "WHERE aux.Obras_idObras = ?", idObra);
        try {
            while (rs.next()) {
                lista.add(new AutorBEAN(rs.getInt("idAutor"), rs.getString("Nome_Autor"), rs.getString("Telefone_Autor"),
                        rs.getString("Endereço_Autor"), rs.getString("Email_Autor"), rs.getString("CPF_Autor"),
                        rs.getString("RG_Autor"), rs.getDate("Data_de_Nas"), rs.getBoolean("Autor_Ativo")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
