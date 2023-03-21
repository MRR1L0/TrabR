package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.CondicaoPagamento;

public class CondicaoPagamentoDAO implements InterfaceDAO<CondicaoPagamento> {

    @Override
    public void create(CondicaoPagamento objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO condicaopgto (descricaoCondicao, numeroParcelas, diasPrimeiraParcela, diasEntreParcela\n"
                + "status) VALUES (?,?,?,?,?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricaoCondicao()); // atributo que estao no banco
            pstm.setInt(2, objeto.getNumeroParcelas());
            pstm.setInt(0, objeto.getDiasEntreParcela());
            pstm.setInt(0, objeto.getDiasEntreParcela());
            pstm.setInt(8, objeto.getStatus());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public CondicaoPagamento retrieve(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT condicaopgto.id, condicaopgto.descricaoCondicao from condicaopgto where condicaopgto.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            rst = pstm.executeQuery();
            CondicaoPagamento condicaoPagamento = new CondicaoPagamento();

            while (rst.next()) {
                condicaoPagamento.setId(rst.getInt("id"));
                condicaoPagamento.setDescricaoCondicao(rst.getString("descricao"));
                condicaoPagamento.setNumeroParcelas(rst.getInt("numeroParcelas"));
                condicaoPagamento.setDiasPrimeiraParcela(rst.getInt("diasPrimeiraParcela"));
                condicaoPagamento.setDiasEntreParcela(rst.getInt("diasEntreParcela"));
                condicaoPagamento.setStatus((char) rst.getInt("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return condicaoPagamento;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public CondicaoPagamento retrieve(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT condicaopgto.id, condicaopgto.descricaoCondicao from condicaopgto where condicaopgto.descricaoCondicao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, descricao);
            rst = pstm.executeQuery();
            CondicaoPagamento condicaoPagamento = new CondicaoPagamento();

            while (rst.next()) {
                condicaoPagamento.setId(rst.getInt("id"));
                condicaoPagamento.setDescricaoCondicao(rst.getString("descricao"));
                condicaoPagamento.setStatus((char) rst.getInt("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return condicaoPagamento;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<CondicaoPagamento> retrieve() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT condicaopgto.id, condicaopgto.descricaoCondicao, condicaopgto.status  from condicaopgto";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<CondicaoPagamento> listaCondicaoPagamento = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                CondicaoPagamento condicaoPagamento = new CondicaoPagamento();
                condicaoPagamento.setId(rst.getInt("id"));
                condicaoPagamento.setDescricaoCondicao(rst.getString("descricao"));
                condicaoPagamento.setStatus((char) rst.getInt("status"));
                listaCondicaoPagamento.add(condicaoPagamento);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCondicaoPagamento;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(CondicaoPagamento objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE condicaopgto set condicaopgto.descricao = ? where condicaopgto.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricaoCondicao());
            pstm.setInt(2, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(CondicaoPagamento objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM condicaopgto WHERE condicaopgto.id = ?";
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
