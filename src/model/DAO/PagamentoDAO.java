package model.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Pagamento;

public class PagamentoDAO implements InterfaceDAO<Pagamento> {

    @Override
    public void create(Pagamento objeto) {

        Connection conexao = ConnectionFactory.getConnection();

        String sqlExecutar = "INSERT INTO pagamento (dataPagamento, horaPagamento, valorDesconto, valorAcrescimo, valorPago, status, pagar_id) VALUES (?,?, ?, ?, ?, ?, ?)";
///  String sqlExecutar = "INSERT INTO pagamento (dataPagamento, horaPagamento, valorDesconto, valorAcrescimo, valorPago, status) VALUES (?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setDate(1, new java.sql.Date(objeto.getDataPagamento().getTime()));
            pstm.setString(2, objeto.getHoraPagamento());
            pstm.setFloat(3, objeto.getValorDesconto());
            pstm.setFloat(4, objeto.getValorAcrescimo());
            pstm.setFloat(5, objeto.getValorPago());
            pstm.setString(6, String.valueOf(objeto.getStatus()));
            pstm.setInt(7, objeto.getPagar().getId());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public Pagamento search(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        // String sqlExecutar = "SELECT pagamento.id, pagamento.descricao from pagamento where pagamento.id = ?";
        String sqlExecutar = "SELECT pagamento.id, pagamento.dataPagamento, pagamento.horaPagamento, pagamento.valorDesconto, pagamento.valorAcrescimo, pagamento.valorPago, pagamento.status from pagamento where pagamento.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(0, codigo);
            rst = pstm.executeQuery();
            Pagamento pagamento = new Pagamento();

            while (rst.next()) {
                pagamento.setId(rst.getInt("id"));
                pagamento.setDataPagamento(rst.getDate("dataPagamento"));
                pagamento.setHoraPagamento(rst.getString("horaPagamento"));
                pagamento.setValorDesconto(rst.getFloat("valorDesconto"));
                pagamento.setValorAcrescimo(rst.getFloat("valorAcrescimo"));
                pagamento.setValorPago(rst.getFloat("valorPago"));
                pagamento.setStatus(rst.getString("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return pagamento;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public Pagamento search(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        /// String sqlExecutar = "SELECT pagamento.id, pagamento.descricao from pagamento where pagamento.descricao = ?";
        String sqlExecutar = "SELECT pagamento.id, pagamento.dataPagamento, pagamento.horaPagamento, pagamento.valorDesconto, pagamento.valorAcrescimo, pagamento.valorPago, pagamento.status FROM pagamento WHERE descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, descricao);
            rst = pstm.executeQuery();
            Pagamento pagamento = new Pagamento();

            while (rst.next()) {
                pagamento.setId(rst.getInt("id"));
                pagamento.setDataPagamento(rst.getDate("dataPagamento"));
                pagamento.setHoraPagamento(rst.getString("horaPagamento"));
                pagamento.setValorDesconto(rst.getFloat("valorDesconto"));
                pagamento.setValorAcrescimo(rst.getFloat("valorAcrescimo"));
                pagamento.setValorPago(rst.getFloat("valorPago"));
                pagamento.setStatus(rst.getString("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return pagamento;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<Pagamento> search() {

        Connection conexao = ConnectionFactory.getConnection();
        /// String sqlExecutar = "SELECT pagamento.id, pagamento.descricao from pagamento";
        String sqlExecutar = "SELECT pagamento.id, pagamento.dataPagamento, pagamento.horaPagamento, pagamento.valorDesconto, pagamento.valorAcrescimo, pagamento.valorPago, status FROM pagamento";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<Pagamento> listaPagamento = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Pagamento pagamento = new Pagamento();
                pagamento.setId(rst.getInt("id"));
                pagamento.setDataPagamento(rst.getDate("dataPagamento"));
                pagamento.setHoraPagamento(rst.getString("horaPagamento"));
                pagamento.setValorDesconto(rst.getFloat("valorDesconto"));
                pagamento.setValorAcrescimo(rst.getFloat("valorAcrescimo"));
                pagamento.setValorPago(rst.getFloat("valorPago"));
              pagamento.setStatus(rst.getString("status"));
                listaPagamento.add(pagamento);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaPagamento;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public void update(Pagamento objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE pagamento SET  dataPagamento = ?, horaPagamento = ?, valorDesconto = ?, valorAcrescimo = ?, valorPago = ?, status = ? WHERE id = ?";
        /// String sqlExecutar = "UPDATE pagamento set pagamento.descricao = ? where pagamento.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setDate(2, (Date) objeto.getDataPagamento());
            pstm.setString(3, objeto.getHoraPagamento());
            pstm.setFloat(4, objeto.getValorDesconto());
            pstm.setFloat(5, objeto.getValorAcrescimo());
            pstm.setFloat(6, objeto.getValorPago());
            pstm.setString(7, String.valueOf(objeto.getStatus()));
            pstm.setInt(8, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(Pagamento objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM pagamento WHERE pagamento.id = ?";
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
