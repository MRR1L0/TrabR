package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bo.CupomFiscal;

public class CupomFiscalDAO implements InterfaceDAO<CupomFiscal> {

    @Override
    public void create(CupomFiscal objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cupomFiscal (dataVenda, horaVenda, valorDesconto, valorAcrescimo, totalCupom, status) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        /// pstm.setString(12, Character.toString(objeto.getSexo()));
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setObject(1, objeto.getDataVenda());
            pstm.setObject(2, objeto.getHoraVenda());
            pstm.setFloat(3, objeto.getValorDesconto());
            pstm.setFloat(4, objeto.getValorAcrescimo());
            pstm.setFloat(5, objeto.getTotalCupom());
            pstm.setInt(8, objeto.getStatus());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public CupomFiscal retrieve(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        // String sqlExecutar = "SELECT cupomFiscal.id, cupomFiscal.descricao from cupomFiscal where cupomFiscal.id = ?";
        String sqlExecutar = "SELECT cupomFiscal.id, cupomFiscal.dataVenda, cupomFiscal.horaVenda, cupomFiscal.valorDesconto, cupomFiscal.valorAcrescimo, cupomFiscal.totalCupom, cupomFiscal.status FROM cupom_fiscal WHERE id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            rst = pstm.executeQuery();
            CupomFiscal cupomFiscal = new CupomFiscal();

            while (rst.next()) {
                cupomFiscal.setId(rst.getInt("id"));
                cupomFiscal.setDataVenda(rst.getDate("dataVenda"));
                //cupomFiscal.setHoraVenda(rst.getTime("horaVenda"));
                cupomFiscal.setValorDesconto(rst.getFloat("valorDesconto"));
                cupomFiscal.setValorAcrescimo(rst.getFloat("valorAcrescimo"));
                cupomFiscal.setTotalCupom(rst.getFloat("totalCupom"));
                cupomFiscal.setStatus((char) rst.getInt("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cupomFiscal;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public CupomFiscal retrieve(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cupomFiscal.id, cupomFiscal.dataVenda, cupomFiscal.horaVenda, cupomFiscal.valorDesconto, cupomFiscal.valorAcrescimo, cupomFiscal.totalCupom, cupomFiscal.status FROM cupom_fiscal where cupomFiscal.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, descricao);
            rst = pstm.executeQuery();
            CupomFiscal cupomFiscal = new CupomFiscal();

            while (rst.next()) {
                cupomFiscal.setId(rst.getInt("id"));
                cupomFiscal.setDataVenda(rst.getDate("dataVenda"));
                //cupomFiscal.setHoraVenda(rst.getTime("horaVenda"));
                cupomFiscal.setValorDesconto(rst.getFloat("valorDesconto"));
                cupomFiscal.setValorAcrescimo(rst.getFloat("valorAcrescimo"));
                cupomFiscal.setTotalCupom(rst.getFloat("totalCupom"));
                cupomFiscal.setStatus((char) rst.getInt("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cupomFiscal;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<CupomFiscal> retrieve() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cupomFiscal.id, cupomFiscal.dataVenda, cupomFiscal.horaVenda, cupomFiscal.valorDesconto, cupomFiscal.ValorAcrescimo, cupomFiscal.totalCupom, cupomFiscal.status from cupomFiscal";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<CupomFiscal> listaCupomFiscal = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                CupomFiscal cupomFiscal = new CupomFiscal();
                cupomFiscal.setId(rst.getInt("id"));
                cupomFiscal.setDataVenda(rst.getDate("dataVenda"));
               // cupomFiscal.setHoraVenda(rst.getTime("horaVenda"));
                cupomFiscal.setValorDesconto(rst.getFloat("valorDesconto"));
                cupomFiscal.setValorAcrescimo(rst.getFloat("valorAcrescimo"));
                cupomFiscal.setTotalCupom(rst.getFloat("totalCupom"));
                cupomFiscal.setStatus((char) rst.getInt("status"));
                listaCupomFiscal.add(cupomFiscal);
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
    public void update(CupomFiscal objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE cupomFiscal set cupomFiscal.dataVenda = ? where cupomFiscal.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            ///pstm.setString(0, objeto.getDataVenda());
            pstm.setInt(1, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(CupomFiscal objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM cupomFiscal WHERE cupomFiscal.id = ?";
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
