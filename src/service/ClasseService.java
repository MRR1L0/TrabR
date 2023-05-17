
package service;

import java.util.List;
import model.DAO.ClasseDAO;
import model.bo.Classe;


public class ClasseService  {
    
    public static void criar(Classe objeto) {
        ClasseDAO classeDAO = new ClasseDAO();
        classeDAO.create(objeto); 
    }

    public static Classe buscar(int codigo) {
       ClasseDAO classeDAO = new ClasseDAO();
       return classeDAO.search(codigo);
    }
  
    public static Classe buscar(String descricao) {
       ClasseDAO classeDAO = new ClasseDAO();
      return classeDAO.search(descricao);
    }

    public static List<Classe> buscar() {
       ClasseDAO classeDAO = new ClasseDAO();
       return classeDAO.search(); 
    }


    public static void atualizar(Classe objeto) {
       ClasseDAO classeDAO = new ClasseDAO();
       classeDAO.update(objeto);
    }

  
    public static void excluir(Classe objeto) {
         ClasseDAO classeDAO = new ClasseDAO();
         classeDAO.delete(objeto);
    }
    
    
}
