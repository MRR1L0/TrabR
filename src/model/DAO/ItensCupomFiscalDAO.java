/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bo.ItensCupomFiscal;

/**
 *
 * @author aluno
 */
public class ItensCupomFiscalDAO implements InterfaceDAO<model.bo.ItensCupomFiscal> {

    @Override
    public ItensCupomFiscal create(ItensCupomFiscal t) {
        
                Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO pagar "+t.sqlConection()+" values(?,?,?,?,?,?,?,?,?,?,?)";
  
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, String.valueOf(t.getQtdProduto()));
            pstm.setString(2, String.valueOf(t.getValorUnitarioProduto()));
            pstm.setString(3, String.valueOf(t.getStatus()));
            pstm.setString(4, String.valueOf(t.getCupomFiscal()));
            pstm.setString(5, String.valueOf(t.getHistoricoMovimentacao()));
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItensCupomFiscal update(ItensCupomFiscal t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItensCupomFiscal search(ItensCupomFiscal t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItensCupomFiscal> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(ItensCupomFiscal t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
