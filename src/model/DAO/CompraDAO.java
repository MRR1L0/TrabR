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
import model.bo.Compra;

/**
 *
 * @author aluno
 */
public class CompraDAO implements InterfaceDAO<model.bo.Compra>{

    @Override
    public Compra create(Compra t) {
                Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO compra ("+t.sqlConection()+") values(?,?,?,?,?,?,?,?,?,?,?)";
  
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, String.valueOf(t.getDataCompra()));
            pstm.setString(1, String.valueOf(t.getHoraCompra()));
            pstm.setString(2, t.getNumeroNF());
            pstm.setString(3, t.getTipoNF());
            pstm.setString(4, String.valueOf(t.getValorDesconto()));
            pstm.setString(5, String.valueOf(t.getValorAcrescimo()));
            pstm.setString(6, String.valueOf(t.getTotalNF()));
            pstm.setString(7, String.valueOf(t.getStatus()));
            pstm.setString(8, t.getFornecedor().toString());
            pstm.setString(9, t.getCondicaoPgto().toString());
            pstm.setString(10, t.getPagar().toString());
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    @Override
    public Compra update(Compra t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "UPDATE compra SET data_compra = (?), hora_compra = (?), numero_nf = (?), tipo_nf = (?),"
        		+ "valor_desconto = (?), valor_acrescimo = (?), total_nf = (?), status = (?), "
        		+ "fornecedor = (?), condicao_pagamento = (?), pagar = (?) WHERE id = "+t.getId();
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, String.valueOf(t.getDataCompra()));
            pstm.setString(1, String.valueOf(t.getHoraCompra()));
            pstm.setString(2, t.getNumeroNF());
            pstm.setString(3, t.getTipoNF());
            pstm.setString(4, String.valueOf(t.getValorDesconto()));
            pstm.setString(5, String.valueOf(t.getValorAcrescimo()));
            pstm.setString(6, String.valueOf(t.getTotalNF()));
            pstm.setString(7, String.valueOf(t.getStatus()));
            pstm.setString(8, t.getFornecedor().toString());
            pstm.setString(9, t.getCondicaoPgto().toString());
            pstm.setString(10, t.getPagar().toString());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
        return t;
    }

    @Override
    public Compra search(Compra t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Compra> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Compra t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM compra WHERE id = "+t.getId();
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
