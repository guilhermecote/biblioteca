package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmprestimosDAO {

    private static EmprestimosDAO instance;

    private EmprestimosDAO() {
        MySQLDAO.getConnection();
    }

    public static EmprestimosDAO getInstance() {
        if (instance == null) {
            instance = new EmprestimosDAO();
        }
        return instance;
    }

    public void create(EmprestimosBEAN emprestimo, List<Integer> obras) {
        String query = "INSERT INTO `emprestimos` (`dtSaida`, `dtVolta`,`dtRetorno`, `id_cliente`) "
                + "VALUES (now(), DATE_ADD(now(), INTERVAL 7 DAY), ?, ?);";
        MySQLDAO.executeQuery(query, emprestimo.getDtRetorno(), emprestimo.getId_cliente());
        Integer id = findId(emprestimo);

        obras.forEach(obra -> {
            String q = "INSERT INTO `aux_emprestimos_obras` (`id_emprestimo`, `id_obra`) VALUES (? ,?);";
            MySQLDAO.executeQuery(q, id, obra);
        });
    }

    public void update(EmprestimosBEAN emprestimo, List<Integer> obras) {
        String query = "UPDATE `emprestimos` SET `id_cliente` = ? , `dtRetorno` = ? "
                + "WHERE `emprestimos`.`id_emprestimo` = ?;";
        MySQLDAO.executeQuery(query, emprestimo.getId_cliente(), emprestimo.getDtRetorno(),
                emprestimo.getId_emprestimo());

        String q = "DELETE FROM `aux_emprestimos_obras` WHERE id_emprestimo = ?";
        MySQLDAO.executeQuery(q, emprestimo.getId_emprestimo());

        obras.forEach(obra -> {
            String q2 = "INSERT INTO `aux_emprestimos_obras` (`id_emprestimo`, `id_Obra`) VALUES (?, ?);";
            MySQLDAO.executeQuery(q2, emprestimo.getId_emprestimo(), obra);
        });
    }

    public ArrayList<EmprestimosBEAN> findAllEmprestimos() {
        return listaEmprestimos("SELECT * FROM Emprestimos ");
    }

    public ArrayList<EmprestimosBEAN> listaEmprestimosAtivas() {
        return listaEmprestimos("SELECT * FROM Emprestimos where Ativo_Emprestimos = '1'");
    }

    public ArrayList<EmprestimosBEAN> listaEmprestimos(String query) {
        ArrayList<EmprestimosBEAN> lista = new ArrayList<>();
        ResultSet rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new EmprestimosBEAN(rs.getInt("id_emprestimo"), rs.getDate("dtSaida"),
                        rs.getDate("dtVolta"), rs.getDate("dtRetorno"), rs.getInt("id_cliente")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public EmprestimosBEAN findEmprestimos(int id) {
        EmprestimosBEAN result = null;
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Emprestimos WHERE id_Emprestimo=?", id);
        try {
            if (rs.next()) {
                result = new EmprestimosBEAN(rs.getInt("id_emprestimo"), rs.getDate("dtSaida"),
                        rs.getDate("dtVolta"), rs.getDate("dtRetorno"), rs.getInt("id_cliente"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findId(EmprestimosBEAN emprestimo) {
        int result = 0;
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Emprestimos WHERE id_emprestimo=? and "
                + "dtSaida=? and dtVolta=? and "
                + "id_cliente=? ", emprestimo.getId_emprestimo(), emprestimo.getDtSaida(),
                emprestimo.getDtVolta(), emprestimo.getId_cliente());

        try {
            if (rs.next()) {
                result = rs.getInt("idEmprestimos");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Boolean isExist(int id) {
        Boolean result = false;
        ResultSet rs = MySQLDAO.getResultSet("SELECT * FROM Emprestimos WHERE idEmprestimos= ?", id);
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

}
