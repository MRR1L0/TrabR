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
import model.bo.Pagamento;

/**
 *
 * @author aluno
 */
public class PagamentoDAO implements InterfaceDAO<model.bo.Pagamento>{

    @Override
    public Pagamento create(Pagamento t) {
                Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO pagamento ("+t.sqlConection()+") values(?,?,?,?,?,?)";
  
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, String.valueOf(t.getDataPagamento()));
            pstm.setString(1, String.valueOf(t.getHoraPagamento()));
            pstm.setString(2, String.valueOf(t.getValorDesconto()));
            pstm.setString(3, String.valueOf(t.getValorAcrescimo()));
            pstm.setString(4, String.valueOf(t.getValorPago()));
            pstm.setString(5, String.valueOf(t.getStatus()));
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    @Override
    public Pagamento update(Pagamento t) {
        Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "UPDATE pagamento SET data_pagamento= (?), hora_pagamento = (?)"
        		+ ", valor_desconto = (?), valor_acrescimo = (?), valor_pago = (?), status = (?)"
        		+ " WHERE id = "+t.getId();
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, String.valueOf(t.getDataPagamento()));
            pstm.setString(1, String.valueOf(t.getHoraPagamento()));
            pstm.setString(2, String.valueOf(t.getValorDesconto()));
            pstm.setString(3, String.valueOf(t.getValorAcrescimo()));
            pstm.setString(4, String.valueOf(t.getValorPago()));
            pstm.setString(5, String.valueOf(t.getStatus()));
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
        return t;
    }

    @Override
    public Pagamento search(Pagamento t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pagamento> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Pagamento t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM pagamento WHERE id = "+t.getId();
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
