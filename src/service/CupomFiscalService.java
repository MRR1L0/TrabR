
package service;

import java.util.List;
import model.DAO.CupomFiscalDAO;
import model.bo.CupomFiscal;

public class CupomFiscalService {
      
    public static void criar(CupomFiscal objeto) {
        CupomFiscalDAO cupomFiscalDAO = new CupomFiscalDAO();
        cupomFiscalDAO.create(objeto); 
    }

    public static CupomFiscal buscar(int codigo) {
       CupomFiscalDAO cupomFiscalDAO = new CupomFiscalDAO();
       return cupomFiscalDAO.search(codigo);
    }
  
    public static CupomFiscal buscar(String descricao) {
       CupomFiscalDAO cupomFiscalDAO = new CupomFiscalDAO();
      return cupomFiscalDAO.search(descricao);
    }

    public static List<CupomFiscal> buscar() {
       CupomFiscalDAO cupomFiscalDAO = new CupomFiscalDAO();
       return cupomFiscalDAO.search(); 
    }


    public static void atualizar(CupomFiscal objeto) {
       CupomFiscalDAO cupomFiscalDAO = new CupomFiscalDAO();
       cupomFiscalDAO.update(objeto);
    }

  
    public static void excluir(CupomFiscal objeto) {
         CupomFiscalDAO cupomFiscalDAO = new CupomFiscalDAO();
         cupomFiscalDAO.delete(objeto);
    }
}
