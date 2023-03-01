/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;
import java.util.List;
import java.sql.Connection;
import model.bo.Bairro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author aluno
 */
public class BairroDAO implements InterfaceDAO<model.bo.Bairro>{

    @Override
    public Bairro create(Bairro t) {
        Connection  conexao = ConnectionFactory.getConnection();
        var sqlExecutar ="INSERT INTO bairro (descricao) VALUES(?)";
        PreparedStatement pstm = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0,t.getDescricao());
            pstm.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
     ConnectionFactory.closeConnection(conexao, pstm);
     
     return null;
    }

    @Override
    public Bairro update(Bairro t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bairro search(Bairro t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Bairro> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Bairro t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
