package service;

import java.util.List;
import model.DAO.ComprasDAO;
import model.bo.Compra;

public class ComprasService {

    public static void criar(Compra objeto) {
        ComprasDAO comprasDAO = new ComprasDAO();
        comprasDAO.create(objeto);
    }

    public static Compra buscar(int codigo) {
        ComprasDAO comprasDAO = new ComprasDAO();
        return comprasDAO.search(codigo);
    }

    public static Compra buscar(String descricao) {
        ComprasDAO comprasDAO = new ComprasDAO();
        return comprasDAO.search(descricao);
    }

    public static List<Compra> buscar() {
        ComprasDAO comprasDAO = new ComprasDAO();
        return comprasDAO.search();
    }

    public static void atualizar(Compra objeto) {
        ComprasDAO comprasDAO = new ComprasDAO();
        comprasDAO.update(objeto);
    }

    public static void excluir(Compra objeto) {
        ComprasDAO comprasDAO = new ComprasDAO();
        comprasDAO.delete(objeto);
    }

}
