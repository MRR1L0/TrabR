/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bo.Bairro;
import model.bo.Cidade;

/**
 *
 * @author aluno
 */
public class CidadeDAO implements InterfaceDAO<model.bo.Cidade>{

    @Override
    public Cidade create(Cidade t) {
                Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO cidade ("+t.sqlConection()+") values(?)";
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getDescricao());
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cidade update(Cidade t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "UPDATE cidade SET descricao = (?) WHERE id = "+t.getId();
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getDescricao());

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
        return t;
    }

    @Override
    public Cidade search(int t) {
        Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "SELECT id, descricao from cidade where cidade.id = "+ t;
        var cidade = new Cidade();
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            while (rst.next()) {
                cidade.setId(rst.getInt("id"));
                cidade.setDescricao(rst.getString("descricao"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
                 
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm, rst); 
            return cidade;
        }
    }

    @Override
    public List<Cidade> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Cidade t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM cidade WHERE id = "+t.getId();
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
