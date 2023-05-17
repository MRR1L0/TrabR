package service;

import java.util.List;
import model.DAO.ProdutoDAO;
import model.bo.Produto;

public class ProdutoService {

    public static void criar(Produto objeto) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.create(objeto);
    }

    public static Produto buscar(int codigo) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.search(codigo);
    }

    public static Produto buscar(String descricao) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.search(descricao);
    }

    public static List<Produto> buscar() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.search();
    }

    public static void atualizar(Produto objeto) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.update(objeto);
    }

    public static void excluir(Produto objeto) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.delete(objeto);
    }

}
