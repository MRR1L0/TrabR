
package service;

import java.util.List;
import model.DAO.CidadeDAO;
import model.bo.Cidade;

public class CidadeService {
    
     public static void criar(Cidade objeto) {
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.create(objeto); 
    }

    public static Cidade buscar(int codigo) {
       CidadeDAO cidadeDAO = new CidadeDAO();
       return cidadeDAO.search(codigo);
    }
  
    public static Cidade buscar(String descricao) {
       CidadeDAO cidadeDAO = new CidadeDAO();
        return cidadeDAO.search(descricao);
    }

    public static List<Cidade> buscar() {
       CidadeDAO cidadeDAO = new CidadeDAO();
       return cidadeDAO.search(); 
    }


    public static void atualizar(Cidade objeto) {
       CidadeDAO cidadeDAO = new CidadeDAO();
       cidadeDAO.update(objeto);
    }

  
    public static void excluir(Cidade objeto) {
         CidadeDAO cidadeDAO = new CidadeDAO();
         cidadeDAO.delete(objeto);
    }
    
}
