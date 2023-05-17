package service;

import java.util.List;
import model.DAO.FornecedorDAO;
import model.bo.Fornecedor;

public class FornecedorService {

    public static void criar(Fornecedor objeto) {
        FornecedorDAO fornecedoroDAO = new FornecedorDAO();
        fornecedoroDAO.create(objeto);
    }

    public static Fornecedor buscar(int codigo) {
        FornecedorDAO fornecedoroDAO = new FornecedorDAO();
        return fornecedoroDAO.search(codigo);
    }

    public static Fornecedor buscar(String descricao) {
        FornecedorDAO fornecedoroDAO = new FornecedorDAO();
        return fornecedoroDAO.search(descricao);
    }

    public static List<Fornecedor> buscar() {
        FornecedorDAO fornecedoroDAO = new FornecedorDAO();
        return fornecedoroDAO.search();
    }

    public static void atualizar(Fornecedor objeto) {
        FornecedorDAO fornecedoroDAO = new FornecedorDAO();
        fornecedoroDAO.update(objeto);
    }

    public static void excluir(Fornecedor objeto) {
        FornecedorDAO fornecedoroDAO = new FornecedorDAO();
        fornecedoroDAO.delete(objeto);
    }

}
