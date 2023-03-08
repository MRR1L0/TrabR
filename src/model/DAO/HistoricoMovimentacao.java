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

/**
 *
 * @author aluno
 */
public class HistoricoMovimentacao implements InterfaceDAO<model.bo.HistoricoMovimentacao> {

    @Override
    public model.bo.HistoricoMovimentacao create(model.bo.HistoricoMovimentacao t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "INSERT INTO historico_movimentacao (id, "+t.sqlConection()+") descricao VALUES(?,?,?,?,?,?)";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, String.valueOf(t.getId()));
            pstm.setString(1, String.valueOf(t.getData()));
            pstm.setString(2, String.valueOf(t.getHora()));
            pstm.setString(3,String.valueOf(t.getTipo()));
            pstm.setString(4, String.valueOf(t.getQtd()));
            pstm.setString(5, String.valueOf(t.getStatus()));
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);

        return t;
    }

    @Override
    public model.bo.HistoricoMovimentacao update(model.bo.HistoricoMovimentacao t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "UPDATE historico_movimentacao SET descricao= (?), data = (?)"
        		+ ", hora = (?), tipo = (?), quantidade = (?), status = (?)"
        		+ " WHERE id = "+t.getId();
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, String.valueOf(t.getData()));
            pstm.setString(2, String.valueOf(t.getHora()));
            pstm.setString(3,String.valueOf(t.getTipo()));
            pstm.setString(4, String.valueOf(t.getQtd()));
            pstm.setString(5, String.valueOf(t.getStatus()));
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
        return t;
    }

    @Override
    public model.bo.HistoricoMovimentacao search(model.bo.HistoricoMovimentacao t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model.bo.HistoricoMovimentacao> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(model.bo.HistoricoMovimentacao t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM historico_movimentacao WHERE id = "+t.getId();
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
