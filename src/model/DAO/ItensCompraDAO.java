package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bo.ItensCompra;

public class ItensCompraDAO implements InterfaceDAO<ItensCompra> {

    @Override
    public void create(ItensCompra objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO itensCompra (qtdProduto, valorUnitario, status) VALUES (?, ?, ?)";

        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setFloat(1, objeto.getQtdProduto());
            pstm.setFloat(2, objeto.getValorUnitario());
            pstm.setString(3, objeto.getStatus());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public ItensCompra retrieve(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT itenscompra.id, itenscompra.qtdProduto, itenscompra.valorUnitarioProduto, itenscompra.status FROM itenscompra WHERE itenscompra.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(0, codigo);
            rst = pstm.executeQuery();
            ItensCompra itensCompra = new ItensCompra();

            while (rst.next()) {
                itensCompra.setId(rst.getInt("id"));
                itensCompra.setQtdProduto(rst.getFloat("qtdProduto"));
                itensCompra.setValorUnitario(rst.getFloat("valorUnitarioProduto"));
                itensCompra.setStatus(rst.getString("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return itensCompra;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public ItensCompra retrieve(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT itensCompra.id, itensCompra.qtdProduto, itensCompra.valorUnitarioProduto, itensCompra.status  from itensCompra where itensCompra.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, descricao);
            rst = pstm.executeQuery();
            ItensCompra itensCompra = new ItensCompra();

            while (rst.next()) {
                itensCompra.setId(rst.getInt("id"));
                itensCompra.setQtdProduto(rst.getFloat("qtdProduto"));
                itensCompra.setValorUnitario(rst.getFloat("valorUnitarioProduto"));
                itensCompra.setStatus(rst.getString("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return itensCompra;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<ItensCompra> retrieve() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT itensCompra.id, itensCompra.qtdProduto, itensCompra.valorUnitarioProduto , itensCompra.status from itensCompra";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<ItensCompra> listaItensCompra = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                ItensCompra itensCompra = new ItensCompra();
                itensCompra.setQtdProduto(rst.getFloat("qtdProduto"));
                itensCompra.setValorUnitario(rst.getFloat("valorUnitarioProduto"));
                itensCompra.setStatus(rst.getString("status"));
                listaItensCompra.add(itensCompra);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaItensCompra;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public void update(ItensCompra objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE itensCompra SET qtdProduto = ?, valorUnitarioProduto = ?, status = ? WHERE id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setFloat(1, objeto.getQtdProduto());
            pstm.setFloat(2, objeto.getValorUnitario());
            pstm.setString(3, objeto.getStatus());
            pstm.setInt(4, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(ItensCompra objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM itensCompra WHERE id = ?";

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
