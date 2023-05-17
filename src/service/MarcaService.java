package service;

import java.util.List;
import model.DAO.MarcaDAO;
import model.bo.Marca;

public class MarcaService {

    public static void criar(Marca objeto) {
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.create(objeto);
    }

    public static Marca buscar(int codigo) {
        MarcaDAO marcaDAO = new MarcaDAO();
        return marcaDAO.search(codigo);
    }

    public static Marca buscar(String descricao) {
        MarcaDAO marcaDAO = new MarcaDAO();
        return marcaDAO.search(descricao);
    }

    public static List<Marca> buscar() {
        MarcaDAO marcaDAO = new MarcaDAO();
        return marcaDAO.search();
    }

    public static void atualizar(Marca objeto) {
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.update(objeto);
    }

    public static void excluir(Marca objeto) {
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.delete(objeto);
    }

}
