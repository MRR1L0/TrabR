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
import model.bo.CupomFiscal;

/**
 *
 * @author aluno
 */
public class CupomFiscalDAO implements InterfaceDAO<model.bo.CupomFiscal> {

    @Override
    public CupomFiscal create(CupomFiscal t) {
                Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO cupom_fiscal ("+t.sqlConection()+") values(?,?,?,?,?,?)";
  
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, String.valueOf(t.getDataVenda()));
            pstm.setString(1, t.getHoraVenda());
            pstm.setString(2, String.valueOf(t.getValorDesconto()));
            pstm.setString(3, String.valueOf(t.getValorAcrescimo()));
            pstm.setString(4, String.valueOf(t.getTotalCupom()));
            pstm.setString(5, String.valueOf(t.getStatus()));
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    @Override
    public CupomFiscal update(CupomFiscal t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "UPDATE cupom_fiscal SET data_venda = (?), hora_venda = (?), valor_desconto = (?)"
        		+ ", valor_acrescimo = (?), total_cupom_fiscal = (?), status = (?) WHERE id = "+t.getId();
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, String.valueOf(t.getDataVenda()));
            pstm.setString(1, t.getHoraVenda());
            pstm.setString(2, String.valueOf(t.getValorDesconto()));
            pstm.setString(3, String.valueOf(t.getValorAcrescimo()));
            pstm.setString(4, String.valueOf(t.getTotalCupom()));
            pstm.setString(5, String.valueOf(t.getStatus()));
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
        return t;
    }

    @Override
    public CupomFiscal search(CupomFiscal t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CupomFiscal> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(CupomFiscal t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM cupom_fiscal WHERE id = "+t.getId();
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
    }
    
}
