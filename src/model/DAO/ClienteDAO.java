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
import model.bo.Cliente;

/**
 *
 * @author aluno
 */
public class ClienteDAO implements InterfaceDAO<model.bo.Cliente>{

    @Override
    public Cliente create(Cliente t) {
                Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO cliente ("+t.sqlConection()+") values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
  
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getNome());
            pstm.setString(1, t.getFone1());
            pstm.setString(2, t.getFone2());
            pstm.setString(3, t.getEmail());
            pstm.setString(4, String.valueOf(t.getDtCadastro()));
            pstm.setString(5, t.getComplementoEndereco());
            pstm.setString(6, t.getObservacao());
            pstm.setString(7, String.valueOf(t.getStatus()));
            pstm.setString(8, String.valueOf(t.getEndereco().toString()));
            pstm.setString(9, t.getCpf());
            pstm.setString(10, t.getRg());
            pstm.setString(11, String.valueOf(t.getDtNascimento()));
            pstm.setString(12, String.valueOf(t.getSexo()));
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    @Override
    public Cliente update(Cliente t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "UPDATE cliente SET nome = (?), fone1 = (?), fone2 = (?), email = (?),"
        		+ "complemento_endereco = (?), observacao = (?), status = (?), endereco = (?), cpf = (?),"
        		+ "rg = (?), data_nascimento = (?), sexo = (?) WHERE id = "+t.getId();
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getNome());
            pstm.setString(1, t.getFone1());
            pstm.setString(2, t.getFone2());
            pstm.setString(3, t.getEmail());
            pstm.setString(5, t.getComplementoEndereco());
            pstm.setString(6, t.getObservacao());
            pstm.setString(7, String.valueOf(t.getStatus()));
            pstm.setString(8, String.valueOf(t.getEndereco().toString()));
            pstm.setString(9, t.getCpf());
            pstm.setString(10, t.getRg());
            pstm.setString(11, String.valueOf(t.getDtNascimento()));
            pstm.setString(12, String.valueOf(t.getSexo()));
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
        return t;
    }

    @Override
    public Cliente search(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Cliente t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM cliente WHERE id = "+t.getId();
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
