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
import model.bo.Fornecedor;

/**
 *
 * @author aluno
 */
public class FornecedorDAO implements InterfaceDAO<model.bo.Fornecedor>{

    @Override
    public Fornecedor create(Fornecedor t) {
        
        Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO pagar "+t.sqlConection()+" values(?,?,?,?,?,?,?,?,?,?,?)";
  
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
            pstm.setString(9, t.getCnpj());
            pstm.setString(10, t.getInscEstadual());
            pstm.setString(11, t.getContato());
            pstm.setString(12, t.getRazaoSocial());
            pstm.setString(13, t.getCpf());
            pstm.setString(13, t.getRg());

        }catch(SQLException ex){
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Fornecedor update(Fornecedor t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Fornecedor search(Fornecedor t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fornecedor> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Fornecedor t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
