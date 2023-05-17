package service;

import java.util.List;
import model.DAO.BairroDAO;
import model.DAO.CondicaoPagamentoDAO;
import model.bo.Bairro;
import model.bo.CondicaoPgto;

public class CondicaoPagamentoService {

    public static void criar(CondicaoPgto objeto) {
        CondicaoPagamentoDAO condicaoPgtoDAO = new CondicaoPagamentoDAO();
        condicaoPgtoDAO.create(objeto);
    }

    public static CondicaoPgto buscar(int codigo) {
        CondicaoPagamentoDAO condicaoPgtoDAO = new CondicaoPagamentoDAO();
        return condicaoPgtoDAO.search(codigo);
    }

    public static CondicaoPgto buscar(String descricao) {
        CondicaoPagamentoDAO condicaoPgtoDAO = new CondicaoPagamentoDAO();
        return condicaoPgtoDAO.search(descricao);
    }

    public static List<CondicaoPgto> buscar() {
        CondicaoPagamentoDAO condicaoPgtoDAO = new CondicaoPagamentoDAO();
        return condicaoPgtoDAO.search();
    }

    public static void atualizar(CondicaoPgto objeto) {
        CondicaoPagamentoDAO condicaoPgtoDAO = new CondicaoPagamentoDAO();
        condicaoPgtoDAO.update(objeto);
    }

    public static void excluir(CondicaoPgto objeto) {
        CondicaoPagamentoDAO condicaoPgtoDAO = new CondicaoPagamentoDAO();
        condicaoPgtoDAO.delete(objeto);
    }

}
