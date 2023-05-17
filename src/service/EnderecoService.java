package service;

import java.util.List;
import model.DAO.EnderecoDAO;
import model.bo.Endereco;

public class EnderecoService {

    public static void criar(Endereco objeto) {
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        enderecoDAO.create(objeto);
    }

    public static Endereco buscar(int codigo) {
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        return enderecoDAO.search(codigo);
    }

    public static Endereco buscar(String descricao) {
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        return enderecoDAO.search(descricao);
    }

    public static List<Endereco> buscar() {
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        return enderecoDAO.search();
    }

    public static void atualizar(Endereco objeto) {
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        enderecoDAO.update(objeto);
    }

    public static void excluir(Endereco objeto) {
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        enderecoDAO.delete(objeto);
    }

}
