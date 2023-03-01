/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author aluno
 */
public class ProdutoDAO implements InterfaceDAO<model.bo.Produto>{

    @Override
    public Produto create(Produto t) {
        
        Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO produto (descricao) values(?,?,?,?,?,?,?,?,?,?,?) ";
  
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getDescricao());
            pstm.setString(1, String.valueOf(t.getValorCompra()));
            pstm.setString(2, String.valueOf(t.getValorVenda()));
            pstm.setString(3, t.getUndCompra());
            pstm.setString(4, t.getUndVanda());
            pstm.setString(5, String.valueOf(t.getFatorConversao()));
            pstm.setString(6, String.valueOf(t.getStatus()));
            pstm.setString(7, String.valueOf(t.getDataCadastro()));
            pstm.setString(8, t.getBarraEntrada());
            pstm.setString(9, String.valueOf(t.getEstoqueMinino()));
            pstm.setString(10, String.valueOf(t.getMarca()));
            pstm.setString(11, String.valueOf(t.getClass()));
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto update(Produto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto search(Produto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Produto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
