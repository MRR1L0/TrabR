package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Compra;



public class ComprasDAO implements InterfaceDAO<Compra> {

    @Override
    public Compra create(Compra objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO compras (dataCompra, horaCompra, numeroNF, tipoNF, valorDesconto, valorAcrescimo, totalNF, status, fonecedor,_id, condicaoPgto_id) VALUES (?,?,?, ?, ?, ?, ?, ?, ?, ?)";

        //String sqlExecutar = "INSERT INTO compras (dataCompra, horaCompra, numeroNF, tipoNF, valorDesconto, valorAcrescimo, totalNF, status) VALUES (?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setDate(1, new java.sql.Date(objeto.getDataCompra().getTime()));
            pstm.setString(2, objeto.getHoraCompra());
            pstm.setString(3, objeto.getNumeroNF());
            pstm.setString(4, objeto.getTipoNF());
            pstm.setDouble(5, objeto.getValorDesconto());
            pstm.setDouble(6, objeto.getValorAcrescimo());
            pstm.setDouble(7, objeto.getTotalNF());
            pstm.setString(8, String.valueOf(objeto.getStatus()));
            pstm.setInt(9, objeto.getFornecedor().getId());
            pstm.setInt(10, objeto.getCondicaoPgto().getId());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);
        return objeto;
    }

    @Override
    public Compra search(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        // String sqlExecutar = "SELECT compras.id, compras.descricao from compras where compras.id = ?";
        String sqlExecutar = "SELECT compras.id, compras.dataCompra, compras.horaCompra, compras.numeroNF, compras.tipoNF, compras.valorDesconto, compras.valorAcrescimo, compras.totalNF, compras.status FROM compras WHERE compras.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(0, codigo);
            rst = pstm.executeQuery();
            Compra compras = new Compra() {
            };

            while (rst.next()) {
                compras.setId(rst.getInt("id"));
                compras.setId(rst.getInt("id"));
                compras.setDataCompra(rst.getDate("dataCompra"));
                compras.setHoraCompra(rst.getString("horaCompra"));
                compras.setNumeroNF(rst.getString("numeroNF"));
                compras.setTipoNF(rst.getString("tipoNF"));
                compras.setValorDesconto(rst.getFloat("valorDesconto"));
                compras.setValorAcrescimo(rst.getFloat("valorAcrescimo"));
                compras.setTotalNF(rst.getFloat("totalNF"));
                 compras.setStatus(rst.getString("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return compras;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public Compra search(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT compras.id, compras.dataCompra, compras.horaCompra, compras.numeroNF, compras.tipoNF, compras.valorDesconto, compras.valorAcrescimo, compras.totalNF, compras.status  from compras where compras.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, descricao);
            rst = pstm.executeQuery();
            Compra compras = new Compra();

            while (rst.next()) {
                compras.setId(rst.getInt("id"));
                compras.setDataCompra(rst.getDate("dataCompra"));
                compras.setHoraCompra(rst.getString("horaCompra"));
                compras.setNumeroNF(rst.getString("numeroNF"));
                compras.setTipoNF(rst.getString("tipoNF"));
                compras.setValorDesconto(rst.getFloat("valorDesconto"));
                compras.setValorAcrescimo(rst.getFloat("valorAcrescimo"));
                compras.setTotalNF(rst.getFloat("totalNF"));
                  compras.setStatus(rst.getString("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return compras;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<Compra> search() {

        Connection conexao = ConnectionFactory.getConnection();
        ///String sqlExecutar = "SELECT compras.id, compras.descricao from compras";
        String sqlExecutar = "SELECT compras.id, compras.dataCompra, compras.horaCompra, compras.numeroNF, compras.tipoNF, compras.valorDesconto, compras.valorAcrescimo, compras.totalNF, compras.status from compras";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<Compra> listaCompras = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Compra compras = new Compra();
                compras.setId(rst.getInt("id"));
                compras.setDataCompra(rst.getDate("dataCompra"));
                compras.setHoraCompra(rst.getString("horaCompra"));
                compras.setNumeroNF(rst.getString("numeroNF"));
                compras.setTipoNF(rst.getString("tipoNF"));
                compras.setValorDesconto(rst.getFloat("valorDesconto"));
                compras.setValorAcrescimo(rst.getFloat("valorAcrescimo"));
                compras.setTotalNF(rst.getFloat("totalNF"));
                compras.setStatus(rst.getString("status"));
                listaCompras.add(compras);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCompras;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(Compra objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE compras SET dataCompra = ?, horaCompra = ?, numeroNF = ?, tipoNF = ?, valorDesconto = ?, valorAcrescimo = ?, totalNF = ?, status = ? WHERE id = ?";

//  String sqlExecutar = "UPDATE compras set compras.dataCompra, compras.horaCompra, compras.numeroNF, compras.tipoNF, compras.valorDesconto, compras.valorAcrescimo, compras.totalNF, compras.status  = ? where compras.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setObject(1, objeto.getDataCompra());
            pstm.setString(2, objeto.getHoraCompra());
            pstm.setString(3, objeto.getNumeroNF());
            pstm.setString(4, objeto.getTipoNF());
            pstm.setDouble(5, objeto.getValorDesconto());
            pstm.setDouble(6, objeto.getValorAcrescimo());
            pstm.setDouble(7, objeto.getTotalNF());
            pstm.setString(8, objeto.getStatus());
            pstm.setInt(9, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(Compra objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM compras WHERE compras.id = ?";
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
