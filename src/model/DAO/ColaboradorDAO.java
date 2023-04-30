package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bo.Colaborador;

public class ColaboradorDAO implements InterfaceDAO<Colaborador> {

    @Override
    public Colaborador create(Colaborador objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO colaborador (nome, fone1, fone2, complementoEndereco, email, dtCadastro, observacao, status, login, senha, endereco_id) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome()); // o índice do parâmetro começa em 1, não em 0
            pstm.setString(2, objeto.getFone1());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getComplementoEndereco());
            pstm.setString(5, objeto.getEmail());
            pstm.setObject(6, objeto.getDtCadastro());
            pstm.setString(7, objeto.getObservacao());
            pstm.setString(8, objeto.getStatus());
            pstm.setString(9, objeto.getLogin());
            pstm.setString(10, objeto.getSenha());
             pstm.setInt(11, objeto.getEndereco().getId());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);
        return objeto;
    }

    @Override
    public Colaborador search(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT colaborador.id, colaborador.nome, colaborador.login, colaborador.status from colaborador where colaborador.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            rst = pstm.executeQuery();
            Colaborador colaborador = new Colaborador();

            while (rst.next()) {
                colaborador.setId(rst.getInt("id"));
                colaborador.setNome(rst.getString("nome"));
                colaborador.setLogin(rst.getString("login"));
                colaborador.setStatus(rst.getString("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return colaborador;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public Colaborador search(String nome) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT colaborador.id, colaborador.nome, colaborador.login, colaborador.status from colaborador where colaborador.nome = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, nome);
            rst = pstm.executeQuery();
            Colaborador colaborador = new Colaborador();

            while (rst.next()) {
                colaborador.setId(rst.getInt("id"));
                colaborador.setNome(rst.getString("nome"));
                colaborador.setLogin(rst.getString("login"));
                colaborador.setStatus(rst.getString("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return colaborador;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<Colaborador> search() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT colaborador.id, colaborador.nome, colaborador.login, colaborador.status from colaborador";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<Colaborador> listaColaborador = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Colaborador colaborador = new Colaborador();
                colaborador.setId(rst.getInt("id"));
                colaborador.setNome(rst.getString("nome"));
                colaborador.setLogin(rst.getString("login"));
                colaborador.setStatus(rst.getString("status"));
                listaColaborador.add(colaborador);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaColaborador;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(Colaborador objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE colaborador set colaborador.descricao = ? where colaborador.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setInt(2, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(Colaborador objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM colaborador WHERE colaborador.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

}
