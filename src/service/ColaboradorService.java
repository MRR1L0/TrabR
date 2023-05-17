package service;

import java.util.List;
import model.DAO.ColaboradorDAO;
import model.bo.Colaborador;

public class ColaboradorService {

    public static void criar(Colaborador objeto) {
        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
        colaboradorDAO.create(objeto);
    }

    public static Colaborador buscar(int codigo) {
        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
        return colaboradorDAO.search(codigo);
    }

    public static Colaborador buscar(String descricao) {
        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
        return colaboradorDAO.search(descricao);
    }

    public static List<Colaborador> buscar() {
        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
        return colaboradorDAO.search();
    }

    public static void atualizar(Colaborador objeto) {
        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
        colaboradorDAO.update(objeto);
    }

    public static void excluir(Colaborador objeto) {
        ColaboradorDAO colaboradorDAO = new ColaboradorDAO();
        colaboradorDAO.delete(objeto);
    }

}
