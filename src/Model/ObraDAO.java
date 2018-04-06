package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ObraDAO {

    private static ObraDAO instance;

    private ObraDAO() {
        MySQLDAO.getConnection();
    }

    public static ObraDAO getInstance() {
        if (instance == null) {
            instance = new ObraDAO();
        }
        return instance;
    }

    public void create(ObraBEAN obra, List<Integer> autores) {
        String query = "INSERT INTO `Obras` (`Nome_Obras`, "
                + "`Edição_Obras`, `Ano_Obras`, "
                + "`Ativo_Obras`, id_editora) VALUES (?,?,?,?,?)";
        MySQLDAO.executeQuery(query, obra.getNome_Obras(), obra.getEdição_Obras(),
                obra.getAno_Obras(), obra.getAtivo_Obras(), obra.getId_editora());
        Integer id = findId(obra);
        System.out.println(id);

        autores.forEach(autor -> {
            String q = "INSERT INTO `aux_autores_obras` (`Autores_idAutores`, `Obras_idObras`) VALUES (?, ?);";
            MySQLDAO.executeQuery(q, autor, id);
        });
    }

    public void update(ObraBEAN obra, List<Integer> autores) {
        String query = "UPDATE OBRAS SET Nome_Obras=?, "
                + "Edição_Obras=?, Ano_Obras=?, "
                + "Ativo_Obras=?, id_editora=? WHERE idObras = ?";
        MySQLDAO.executeQuery(query, obra.getNome_Obras(), obra.getEdição_Obras(),
                obra.getAno_Obras(), obra.getAtivo_Obras(), obra.getId_editora(), obra.getIdObras());

        String q = "DELETE FROM `aux_autores_obras` WHERE Obras_idObras = ?";
        MySQLDAO.executeQuery(q, obra.getIdObras());

        autores.forEach(autor -> {
            String q2 = "INSERT INTO `aux_autores_obras` (`Autores_idAutores`, `Obras_idObras`) VALUES (?, ?);";
            MySQLDAO.executeQuery(q2, autor, obra.getIdObras());
        });
    }

    public void delete(int id) {
        String query = "UPDATE OBRAS SET  Ativo_Obras='0' WHERE idObras = ?";
        MySQLDAO.executeQuery(query, id);
    }

    public void ativo(ObraBEAN obra) {
        String query = "UPDATE OBRAS SET  Ativo_Obras='true' WHERE idObras = ?";
        MySQLDAO.executeQuery(query, obra.getIdObras());
    }

    public ArrayList<ObraBEAN> findAllObra() {
        return listaObra("SELECT * FROM Obras ");
    }

    public ArrayList<ObraBEAN> listaObrasAtivas() {
        return listaObra("SELECT * FROM Obras where Ativo_Obras = '1'");
    }

    public ArrayList<ObraBEAN> listaObra(String query) {
        ArrayList<ObraBEAN> lista = new ArrayList<>();
        ResultSet rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new ObraBEAN(rs.getInt("idObras"), rs.getString("Nome_Obras"),
                        rs.getInt("Edição_Obras"), rs.getInt("Ano_Obras"),
                        rs.getBoolean("Ativo_Obras"), rs.getInt("id_editora")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ObraBEAN findObra(int id) {
        ObraBEAN result = null;
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Obras WHERE idObras=?", id);
        try {
            if (rs.next()) {
                result = new ObraBEAN(rs.getInt("idObras"), rs.getString("Nome_Obras"),
                        rs.getInt("Edição_Obras"), rs.getInt("Ano_Obras"),
                        rs.getBoolean("Ativo_Obras"), rs.getInt("id_editora"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findId(ObraBEAN obra) {
        int result = 0;
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Obras WHERE Nome_Obras=? and "
                + "Edição_Obras=? and Ano_Obras=? and "
                + "Ativo_Obras=? ", obra.getNome_Obras(), obra.getEdição_Obras(),
                obra.getAno_Obras(), obra.getAtivo_Obras());

        try {
            if (rs.next()) {
                result = rs.getInt("idObras");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean isExist(int id) {
        Boolean result = false;
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Obras WHERE idObras= ?", id);
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

    public ArrayList<ObraBEAN> findByNome(String nome) {
        ArrayList<ObraBEAN> lista = new ArrayList<>();
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Obras WHERE Nome_Obras like ?", "%" + nome + "%");
        try {
            while (rs.next()) {
                lista.add(new ObraBEAN(rs.getInt("idObras"), rs.getString("Nome_Obras"),
                        rs.getInt("Edição_Obras"), rs.getInt("Ano_Obras"),
                        rs.getBoolean("Ativo_Obras"), rs.getInt("id_editora")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<ObraBEAN> findByNomeAndAtiva(String nome) {
        ArrayList<ObraBEAN> lista = new ArrayList<>();
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Obras WHERE Ativo_Obras = '1' and Nome_Obras like ?", "%" + nome + "%");
        try {
            while (rs.next()) {
                lista.add(new ObraBEAN(rs.getInt("idObras"), rs.getString("Nome_Obras"),
                        rs.getInt("Edição_Obras"), rs.getInt("Ano_Obras"),
                        rs.getBoolean("Ativo_Obras"), rs.getInt("id_editora")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<ObraBEAN> findByEmprestimo(int idEmprestimo) {
        ArrayList<ObraBEAN> lista = new ArrayList<>();
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM obras o inner join aux_emprestimos_obras aux on aux.id_obra = o.idObras "
                + "where aux.id_emprestimo = ?", idEmprestimo);
        try {
            while (rs.next()) {
                lista.add(new ObraBEAN(rs.getInt("idObras"), rs.getString("Nome_Obras"),
                        rs.getInt("Edição_Obras"), rs.getInt("Ano_Obras"),
                        rs.getBoolean("Ativo_Obras"), rs.getInt("id_editora")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
