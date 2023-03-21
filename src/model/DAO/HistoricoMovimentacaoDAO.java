package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bo.HistoricoMovimentacao;

public class HistoricoMovimentacaoDAO implements InterfaceDAO<HistoricoMovimentacao> {

    @Override
    public void create(HistoricoMovimentacao objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO HistoricoMovimentacao (data, hora, tipo, qtd, status) VALUES (?,?,?,?,?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setObject(1, objeto.getData());
            pstm.setTime(2, objeto.getHora());
            pstm.setString(3, objeto.getTipo());
            pstm.setFloat(4, objeto.getQtde());
            pstm.setString(5, String.valueOf(objeto.getStatus()));    /// convertido o char em String.
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public HistoricoMovimentacao search(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT HistoricoMovimentacao.id, HistoricoMovimentacao.data HistoricoMovimentacao.hora, HistoricoMovimentacao.tipo, HistoricoMovimentacao.qtd, HistoricoMovimentacao.status from HistoricoMovimentacao where HistoricoMovimentacao.id = ?";
////id, data, hora, tipo, qtd, status
        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(0, codigo);
            rst = pstm.executeQuery();
            HistoricoMovimentacao historicoMovimentacao = new HistoricoMovimentacao();

            while (rst.next()) {
                historicoMovimentacao.setId(rst.getInt("id"));
                historicoMovimentacao.setData(rst.getDate("data"));
                historicoMovimentacao.setHora(rst.getTime("hora"));
                historicoMovimentacao.setTipo(rst.getString("tipo"));
                historicoMovimentacao.setQtde(rst.getInt("qtd"));
                historicoMovimentacao.setStatus(rst.getString("status"));       ///itensCupomFiscal.setStatus(rst.getString("status"));

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return historicoMovimentacao;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public HistoricoMovimentacao search(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT HistoricoMovimentacao.id, HistoricoMovimentacao.data HistoricoMovimentacao.hora, HistoricoMovimentacao.tipo, HistoricoMovimentacao.qtd, HistoricoMovimentacao.status from HistoricoMovimentacao where HistoricoMovimentacao.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, descricao);
            rst = pstm.executeQuery();
            HistoricoMovimentacao historicoMovimentacao = new HistoricoMovimentacao();

            while (rst.next()) {
                historicoMovimentacao.setId(rst.getInt("id"));
                historicoMovimentacao.setData(rst.getDate("data"));
                historicoMovimentacao.setHora(rst.getTime("hora"));
                historicoMovimentacao.setTipo(rst.getString("tipo"));
                historicoMovimentacao.setQtde(rst.getInt("qtd"));
                historicoMovimentacao.setStatus(rst.getString("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return historicoMovimentacao;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public List<HistoricoMovimentacao> search() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT HistoricoMovimentacao.id, HistoricoMovimentacao.data HistoricoMovimentacao.hora, HistoricoMovimentacao.tipo, HistoricoMovimentacao.qtd, HistoricoMovimentacao.status from HistoricoMovimentacao";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<HistoricoMovimentacao> listaHistoricoMovimentacao = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                HistoricoMovimentacao historicoMovimentacao = new HistoricoMovimentacao();
                historicoMovimentacao.setId(rst.getInt("id"));
                historicoMovimentacao.setData(rst.getDate("data"));
                historicoMovimentacao.setHora(rst.getTime("hora"));
                historicoMovimentacao.setTipo(rst.getString("tipo"));
                historicoMovimentacao.setQtde(rst.getFloat("qtd"));
                historicoMovimentacao.setStatus(rst.getString("status"));
                listaHistoricoMovimentacao.add(historicoMovimentacao);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaHistoricoMovimentacao;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(HistoricoMovimentacao objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE HistoricoMovimentacao set HistoricoMovimentacao.descricao = ? where HistoricoMovimentacao.id = ?";
        PreparedStatement pstm = null;
////    String sqlExecutar = "UPDATE HistoricoMovimentacao SET data = ?, hora = ?, tipo = ?, qtd = ?, status = ? WHERE id = ?";

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setObject(1, objeto.getData());
            pstm.setTime(2, objeto.getHora());
            pstm.setString(3, objeto.getTipo());
            pstm.setFloat(4, objeto.getQtde());
            pstm.setString(5, objeto.getStatus());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(HistoricoMovimentacao objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM HistoricoMovimentacao WHERE HistoricoMovimentacao.id = ?";
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
