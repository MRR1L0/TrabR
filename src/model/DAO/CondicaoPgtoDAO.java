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
import model.bo.CondicaoPgto;

/**
 *
 * @author aluno
 */
public class CondicaoPgtoDAO implements InterfaceDAO<model.bo.CondicaoPgto> {

    @Override
    public CondicaoPgto create(CondicaoPgto t) {
                Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO condicao_pagamento ("+t.sqlConection()+") values(?,?,?,?,?)";
  
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getDescricaoCondicao());
            pstm.setString(1, String.valueOf(t.getNumeroParcelas()));
            pstm.setString(2, String.valueOf(t.getDiasPrimeiraParcela()));
            pstm.setString(3, String.valueOf(t.getDiasEntreParcela()));
            pstm.setString(4, String.valueOf(t.getStatus()));
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       return t;
    }

    @Override
    public CondicaoPgto update(CondicaoPgto t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "UPDATE condicao_pagamento SET descricao_condicao = (?), numero_parcelas = (?), dias_primeira_parcela = (?)"
        		+ ", dias_entre_parcela = (?), status = (?) WHERE id = "+t.getId();
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getDescricaoCondicao());
            pstm.setString(1, String.valueOf(t.getNumeroParcelas()));
            pstm.setString(2, String.valueOf(t.getDiasPrimeiraParcela()));
            pstm.setString(3, String.valueOf(t.getDiasEntreParcela()));
            pstm.setString(4, String.valueOf(t.getStatus()));
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
        return t;
    }

    @Override
    public CondicaoPgto search(CondicaoPgto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CondicaoPgto> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(CondicaoPgto t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM condicao_pagamento WHERE id = "+t.getId();
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
