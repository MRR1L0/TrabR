/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import model.bo.Bairro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class BairroDAO implements InterfaceDAO<model.bo.Bairro> {

    @Override
    public Bairro create(Bairro t) {
        Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "INSERT INTO bairro (descricao) VALUES(?)";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getDescricao());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);

        return t;
    }

    @Override
    public Bairro update(Bairro t) {
        Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "UPDATE bairro SET descricao= (?) WHERE bairro.id = "+t.getId();
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

    public Bairro search(int t) {
        Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "SELECT id, descricao from bairro where bairro.id = "+ t;
        var bairro = new Bairro();
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();
            while (rst.next()) {
                bairro.setId(rst.getInt("id"));
                bairro.setDescricao(rst.getString("descricao"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
                 
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm, rst); 
            return bairro;
        }
        
    }

    @Override
    public List<Bairro> search() {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "SELECT id,descricao from bairro";
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Bairro> listaBairro = new ArrayList<>();
		try {
			pstm = conexao.prepareStatement(sqlExecutar);
			rst = pstm.executeQuery();
			
			while (rst.next()) {
				var bairro = new Bairro();
				bairro.setId(rst.getInt("id"));
				bairro.setDescricao(rst.getString("descricao"));
			}
		} catch (SQLException ex) {
			 ex.printStackTrace();
	         ConnectionFactory.closeConnection(conexao, pstm, rst);      
		}
		return listaBairro;
        
    }

    @Override
    public void remove(Bairro t) {
        Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM bairro WHERE bairro.id = ?";
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(0, t.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
    }
}
