package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import model.bo.ItensCupomFiscal;

public class ItensCupomFiscalDAO implements InterfaceDAO<ItensCupomFiscal> {

    @Override
    public void create(ItensCupomFiscal objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO ItensCupomFiscal (qtdProduto, valorUnitarioProduto, status, cupomFiscal_id, produto_id) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setFloat(1, objeto.getQtdProduto());
            pstm.setFloat(2, objeto.getValorUnitarioProduto());
            pstm.setString(3, objeto.getStatus());
            pstm.setObject(4, objeto.getCupomFiscal().getId());
            pstm.setInt(5, objeto.getProduto().getId());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public ItensCupomFiscal search(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT ItensCupomFiscal.id, ItensCupomFiscal.qtdProduto, ItensCupomFiscal.valorUnitarioProduto, ItensCupomFiscal.status from ItensCupomFiscal where ItensCupomFiscal.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(0, codigo);
            rst = pstm.executeQuery();
            ItensCupomFiscal itensCupomFiscal = new ItensCupomFiscal();

            while (rst.next()) {
                itensCupomFiscal.setId(rst.getObject("id", UUID.class));
                itensCupomFiscal.setQtdProduto(rst.getInt("qtdProduto"));
                itensCupomFiscal.setValorUnitarioProduto(rst.getFloat("valorUnitarioProduto"));
                itensCupomFiscal.setStatus(rst.getString("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return itensCupomFiscal;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public ItensCupomFiscal search(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT ItensCupomFiscal.id, ItensCupomFiscal.qtdProduto, ItensCupomFiscal.valorUnitarioProduto, ItensCupomFiscal.status from ItensCupomFiscal where ItensCupomFiscal.descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, descricao);
            rst = pstm.executeQuery();
            ItensCupomFiscal itensCupomFiscal = new ItensCupomFiscal();

            while (rst.next()) {
               itensCupomFiscal.setId(rst.getObject("id", UUID.class));
                itensCupomFiscal.setQtdProduto(rst.getInt("qtdProduto"));
                itensCupomFiscal.setValorUnitarioProduto(rst.getFloat("valorUnitarioProduto"));
                itensCupomFiscal.setStatus(rst.getString("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return itensCupomFiscal;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<ItensCupomFiscal> search() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT ItensCupomFiscal.id, ItensCupomFiscal.qtdProduto, ItensCupomFiscal.valorUnitarioProduto, ItensCupomFiscal.status from ItensCupomFiscal";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<ItensCupomFiscal> listaCupomFiscal = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                ItensCupomFiscal itensCupomFiscal = new ItensCupomFiscal();
               itensCupomFiscal.setId(rst.getObject("id", UUID.class));
                itensCupomFiscal.setQtdProduto(rst.getInt("qtdProduto"));
                itensCupomFiscal.setValorUnitarioProduto(rst.getFloat("valorUnitarioProduto"));
                itensCupomFiscal.setStatus(rst.getString("status"));
                listaCupomFiscal.add(itensCupomFiscal);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCupomFiscal;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(ItensCupomFiscal objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE ItensCupomFiscal SET qtdProduto = ?, valorUnitarioProduto = ?, status = ? WHERE id = ?";

//  String sqlExecutar = "UPDATE ItensCupomFiscal set ItensCupomFiscal.descricao = ? where ItensCupomFiscal.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setFloat(1, objeto.getQtdProduto());
            pstm.setFloat(2, objeto.getValorUnitarioProduto());
            pstm.setString(3, objeto.getStatus());
            pstm.setString(4, objeto.getId().toString());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(ItensCupomFiscal objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM ItensCupomFiscal WHERE ItensCupomFiscal.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, objeto.getId().toString());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

}
