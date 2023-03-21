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
import model.bo.Pagar;

/**
 *
 * @author aluno
 */
public class PagarDAO implements InterfaceDAO<model.bo.Pagar> {

    @Override
    public Pagar create(Pagar t) {
        Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO pagar ("+t.sqlConection()+") values(?,?,?,?,?)";
  
        try {
            
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, String.valueOf(t.getDataEmissao()));
            pstm.setString(1, String.valueOf(t.getHoraEmissao()));
            pstm.setString(2, String.valueOf(t.getDataVencimento()));
            pstm.setString(3, String.valueOf(t.getValorPagar()));
            pstm.setString(4, String.valueOf(t.getStatus()));
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    @Override
    public Pagar update(Pagar t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "UPDATE pagar SET data_emissao= (?), hora_emissao = (?)"
        		+ ", data_vencimento = (?), valor_pagar = (?), status = (?)"
        		+ " WHERE id = "+t.getId();
        PreparedStatement pstm = null;

        try {
        	pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, String.valueOf(t.getDataEmissao()));
            pstm.setString(1, String.valueOf(t.getHoraEmissao()));
            pstm.setString(2, String.valueOf(t.getDataVencimento()));
            pstm.setString(3, String.valueOf(t.getValorPagar()));
            pstm.setString(4, String.valueOf(t.getStatus()));
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
        return t;
    }

    @Override
    public Pagar search(Pagar t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pagar> search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Pagar t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM pagar WHERE id = "+t.getId();
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
