package Controller;

import java.util.ArrayList;
import Model.EmprestimosBEAN;
import Model.EmprestimosDAO;
import java.util.List;

public class ControlerEmprestimos {

    public ControlerEmprestimos() {
    }

    public void addEmprestimos(EmprestimosBEAN emprestimos, List<Integer> obras) {
        EmprestimosDAO.getInstance().create(emprestimos, obras);
    }

    public void updateEmprestimos(EmprestimosBEAN emprestimos, List<Integer> obras) {
        EmprestimosDAO.getInstance().update(emprestimos, obras);
    }

    public EmprestimosBEAN findEmprestimos(int id) {
        return EmprestimosDAO.getInstance().findEmprestimos(id);
    }

    public int findIdEmprestimos(EmprestimosBEAN emprestimos) {
        return EmprestimosDAO.getInstance().findId(emprestimos);
    }

    public Boolean isExist(int id) {
        return EmprestimosDAO.getInstance().isExist(id);
    }

    public List<EmprestimosBEAN> listaEmprestimoss() {
        return EmprestimosDAO.getInstance().findAllEmprestimos();
    }

}
