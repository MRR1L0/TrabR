
package service;

import java.util.List;
import model.DAO.ClienteDAO;
import model.bo.Cliente;


public class ClienteService {
    
     public static void criar(Cliente objeto) {
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.create(objeto); 
    }

    public static Cliente buscar(int codigo) {
       ClienteDAO clienteDAO = new ClienteDAO();
       return clienteDAO.search(codigo);
    }
  
    public static Cliente buscar(String descricao) {
       ClienteDAO clienteDAO = new ClienteDAO();
      return clienteDAO.search(descricao);
    }

    public static List<Cliente> buscar() {
       ClienteDAO clienteDAO = new ClienteDAO();
       return clienteDAO.search(); 
    }


    public static void atualizar(Cliente objeto) {
       ClienteDAO clienteDAO = new ClienteDAO();
       clienteDAO.update(objeto);
    }

 
    public static void excluir(Cliente objeto) {
         ClienteDAO clienteDAO = new ClienteDAO();
         clienteDAO.delete(objeto);
    }
    
    
}
