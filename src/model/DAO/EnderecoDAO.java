package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bo.Endereco;

public class EnderecoDAO implements InterfaceDAO<model.bo.Endereco> {

    @Override
    public void create(Endereco objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO endereco (logradouro, cep) VALUES (?,?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getLogradouro()); // atributo que estao no banco
            pstm.setString(2, objeto.getCep());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public Endereco retrieve(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT endereco.id, endereco.logradouro, endereco.cep from endereco where endereco.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(0, codigo);
            rst = pstm.executeQuery();
            Endereco endereco = new Endereco();

            while (rst.next()) {
                endereco.setId(rst.getInt("id"));
                endereco.setLogradouro(rst.getString("Logradouro"));
                endereco.setCep(rst.getString("CEP"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return endereco;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public Endereco retrieve(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT endereco.id, endereco.cep, endereco.logradouro from endereco where endereco.cep = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, descricao);
            rst = pstm.executeQuery();
            Endereco endereco = new Endereco();

            while (rst.next()) {
                endereco.setId(rst.getInt("id"));
                endereco.setLogradouro(rst.getString("Logradouro"));
                endereco.setCep(rst.getString("CEP"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return endereco;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<Endereco> retrieve() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT endereco.id, endereco.cep, endereco.logradouro from endereco";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<Endereco> listaEndereco = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Endereco endereco = new Endereco();
                endereco.setId(rst.getInt("id"));
                endereco.setLogradouro(rst.getString("Logradouro"));
                endereco.setCep(rst.getString("CEP"));
                listaEndereco.add(endereco);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaEndereco;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(Endereco objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE endereco set endereco.logradouro = ? where endereco.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, objeto.getLogradouro());
            pstm.setInt(1, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(Endereco objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM endereco WHERE endereco.id = ?";
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
