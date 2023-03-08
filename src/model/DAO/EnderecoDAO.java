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
import model.bo.Endereco;

/**
 *
 * @author aluno
 */
public class EnderecoDAO implements InterfaceDAO<model.bo.Endereco>{

    @Override
    public Endereco create(Endereco t) {
        
                Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO endereco ("+t.sqlConection()+") values(?,?,?,?)";
  
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getLogradouro());
            pstm.setString(1, t.getCep());
            pstm.setString(2, String.valueOf(t.getBairro()));
            pstm.setString(3, String.valueOf(t.getCidade()));
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    @Override
    public Endereco update(Endereco t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "UPDATE endereco SET logradouro = (?), cep = (?), bairro = (?)"
        		+ ", cidade = (?) WHERE id = "+t.getId();
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getLogradouro());
            pstm.setString(1, t.getCep());
            pstm.setString(2, String.valueOf(t.getBairro()));
            pstm.setString(3, String.valueOf(t.getCidade()));
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
        return t;
    }

    @Override
    public Endereco search(Endereco t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Endereco> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Endereco t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM endereco WHERE id = "+t.getId();
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
