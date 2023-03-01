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
import java.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
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

        return null;
    }

    @Override
    public Bairro update(Bairro t) {
        Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "SELECT bairro.id, bairro.descricao = ? where bairro.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getDescricao());
            pstm.setInt(1, t.getId());

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
        return null;
    }

    @Override
    public Bairro search(Bairro t) {
        Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "SELECT bairro.id, bairro.descricao from bairro where bairro.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(0, t.getId());
            rst = pstm.executeQuery();
            Bairro bairro = new Bairro();

            while (rst.next()) {
                bairro.setId(rst.getInt("id"));
                bairro.setDescricao(rst.getString("descricao"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return bairro;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public List<Bairro> search() {
        return null;
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
