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

/**
 *
 * @author aluno
 */
public class ItensCompra implements InterfaceDAO<model.bo.ItensCompra> {

    @Override
    public model.bo.ItensCompra create(model.bo.ItensCompra t) {
        
                Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO itens_compra ("+t.sqlConection()+") values(?,?,?,?,?,?)";
  
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, String.valueOf(t.getQtdProduto()));
            pstm.setString(2, String.valueOf(t.getValorUnitarioProduto()));
            pstm.setString(3, String.valueOf(t.getStatus()));
            pstm.setString(4, String.valueOf(t.getHistoricoMovimentacao()));
            pstm.setString(5, String.valueOf(t.getCompra()));
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    @Override
    public model.bo.ItensCompra update(model.bo.ItensCompra t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "UPDATE itens_compra SET quantidade_produto= (?), valor_unitario = (?)"
        		+ ", status = (?), historico_movimentacao = (?), compra = (?)"
        		+ " WHERE id = "+t.getId();
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, String.valueOf(t.getQtdProduto()));
            pstm.setString(1, String.valueOf(t.getValorUnitarioProduto()));
            pstm.setString(2, String.valueOf(t.getStatus()));
            pstm.setString(3, String.valueOf(t.getHistoricoMovimentacao()));
            pstm.setString(4, String.valueOf(t.getCompra()));
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
        return t;
    }

    @Override
    public model.bo.ItensCompra search(model.bo.ItensCompra t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model.bo.ItensCompra> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(model.bo.ItensCompra t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM itens_compra WHERE id = "+t.getId();
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
