package model.DAO;

import java.util.List;
import java.sql.Connection;
import model.bo.Bairro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BairroDAO implements InterfaceDAO<Bairro> {

    @Override
    public void create(Bairro objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO bairro (descricao) VALUES (?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao()); // atributo que estao no banco
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);
    }

    @Override
    public Bairro retrieve(int codigo) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT bairro.id, bairro.descricao from bairro where bairro.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
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
    public Bairro retrieve(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT bairro.id, bairro.descricao from bairro where bairro.descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
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

    @Override   // nao usar "*" por conta do desempenho, ele faz duas pesquisas no banco de dados 
    public List<Bairro> retrieve() {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT bairro.id, bairro.descricao from bairro";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<Bairro> listaBairro = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Bairro bairro = new Bairro();
                bairro.setId(rst.getInt("id"));
                bairro.setDescricao(rst.getString("descricao"));
                listaBairro.add(bairro);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaBairro;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(Bairro objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE bairro set bairro.descricao = ? where bairro.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setInt(2, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(Bairro objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM bairro WHERE bairro.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(0, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }
}
