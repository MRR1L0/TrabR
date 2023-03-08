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
import model.bo.Classe;

/**
 *
 * @author aluno
 */
public class ClasseDAO implements InterfaceDAO<model.bo.Classe>{

    @Override
    public Classe create(Classe t) {
                Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO classe ("+t.sqlConection()+") values(?)";
  
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getDescricao());
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Classe update(Classe t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "UPDATE classe SET descricao = (?) WHERE id = "+t.getId();
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
    public Classe search(Classe t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Classe> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Classe t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM classe WHERE id = "+t.getId();
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
