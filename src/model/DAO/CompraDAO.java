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
        
        var sqlExecutar = "INSERT INTO pagar "+t.sqlConection()+" values(?,?,?,?,?,?,?,?,?,?,?)";
  
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, String.valueOf(t.getDataCompra()));
            pstm.setString(1, String.valueOf(t.getHoraCompra()));
            pstm.setString(2, String.valueOf(t.getNumeroNF()));
            pstm.setString(3, t.getNumeroNF());
            pstm.setString(4, t.getTipoNF());
            pstm.setString(5, String.valueOf(t.getValorDesconto()));
            pstm.setString(6, String.valueOf(t.getValorAcrescimo()));
            pstm.setString(7, String.valueOf(t.getTotalNF()));
            pstm.setString(8, String.valueOf(t.getStatus()));
            pstm.setString(9, t.getFornecedor().toString());
            pstm.setString(10, t.getCondicaoPgto().toString());
            pstm.setString(11, t.getPagar().toString());
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compra update(Compra t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
