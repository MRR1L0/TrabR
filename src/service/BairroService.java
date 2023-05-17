
package service;

import java.util.List;
import model.DAO.BairroDAO;
import model.bo.Bairro;

public class BairroService {

    public static void criar(Bairro objeto) {
        BairroDAO bairroDAO = new BairroDAO();
        bairroDAO.create(objeto); 
    }

    public static Bairro buscar(int codigo) {
       BairroDAO bairroDAO = new BairroDAO();
       return bairroDAO.search(codigo);
    }
  
    public static Bairro buscar(String descricao) {
       BairroDAO bairroDAO = new BairroDAO();
      return bairroDAO.search(descricao);
    }

    public static List<Bairro> buscar() {
       BairroDAO bairroDAO = new BairroDAO();
       return bairroDAO.search(); 
    }


    public static void atualizar(Bairro objeto) {
       BairroDAO bairroDAO = new BairroDAO();
       bairroDAO.update(objeto);
    }

  
    public static void excluir(Bairro objeto) {
         BairroDAO bairroDAO = new BairroDAO();
         bairroDAO.delete(objeto);
    }
    
    
    
}
