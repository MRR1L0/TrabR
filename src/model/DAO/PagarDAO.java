package model.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bo.Pagar;

public class PagarDAO implements InterfaceDAO<Pagar> {

    @Override
    public Pagar create(Pagar objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO pagar (dataEmissao, horaEmissao, dataVencimento, valorPagar, status, compra_id) VALUES (?,?,?,?,?,?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setObject(1, objeto.getDataEmissao()); // atributo que estao no banco
            pstm.setObject(2, objeto.getHoraEmissao());
            pstm.setObject(3, objeto.getDataVencimento());
            pstm.setFloat(4, objeto.getValorPagar());
            pstm.setInt(5, objeto.getStatus());
            pstm.setInt(6, objeto.getCompra().getId());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);
        return objeto;
    }

    @Override
    public Pagar search(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
//        String sqlExecutar = "SELECT pagar.id, pagar.dataEmissao from pagar where pagar.id = ?";
        String sqlExecutar = "SELECT pagar.id, pagar.dataEmissao, pagar.horaEmissao, pagar.dataVencimento, pagar.valorPagar, pagar.status FROM pagar WHERE pagar.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            rst = pstm.executeQuery();
            Pagar pagar = new Pagar();

            while (rst.next()) {
                pagar.setId(rst.getInt("id"));
                pagar.setDataEmissao(rst.getDate("dataEmissao"));
                pagar.setHoraEmissao(rst.getTime("horaEmissao"));
                pagar.setDataVencimento(rst.getDate("dataVencimento"));
                pagar.setValorPagar(rst.getFloat("valorPagar"));
                pagar.setStatus((char) rst.getInt("status"));

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return pagar;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public Pagar search(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT pagar.id, pagar.descricao from pagar where pagar.descricao = ?";
///    String sqlExecutar = "SELECT pagar.id, pagar.dataEmissao, pagar.horaEmissao, pagar.dataVencimento, pagar.valorPagar, pagar.status FROM pagar WHERE pagar.descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, descricao);
            rst = pstm.executeQuery();
            Pagar pagar = new Pagar();

            while (rst.next()) {
                pagar.setId(rst.getInt("id"));
                pagar.setDataEmissao(rst.getDate("dataEmissao"));
                pagar.setHoraEmissao(rst.getTime("horaEmissao"));
                pagar.setDataVencimento(rst.getDate("dataVencimento"));
                pagar.setValorPagar(rst.getFloat("valorPagar"));
                pagar.setStatus((char) rst.getInt("status"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return pagar;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<Pagar> search() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT pagar.id, pagar.descricao from pagar";
////        String sqlExecutar = "SELECT pagar.id, pagar.descricao, pagar.dataEmissao, pagar.horaEmissao, pagar.dataVencimento, pagar.valorPagar, pagar.status FROM pagar";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<Pagar> listaPagar = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Pagar pagar = new Pagar();
                pagar.setId(rst.getInt("id"));
                pagar.setDataEmissao(rst.getDate("dataEmissao"));
                pagar.setHoraEmissao(rst.getTime("horaEmissao"));
                pagar.setDataVencimento(rst.getDate("dataVencimento"));
                pagar.setValorPagar(rst.getFloat("valorPagar"));
                pagar.setStatus((char) rst.getInt("status"));
                listaPagar.add(pagar);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaPagar;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(Pagar objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE pagar SET dataEmissao = ?, horaEmissao = ?, dataVencimento = ?, valorPagar = ?, status = ? WHERE id = ?";

////String sqlExecutar = "UPDATE pagar set pagar.dataEmissao, pagar.horaEmissao, pagar.dataVencimento, pagar.valorPagar, pagar.status = ? where pagar.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setDate(1, (Date) objeto.getDataEmissao());
            pstm.setTime(2, objeto.getHoraEmissao());
            pstm.setDate(3, (Date) objeto.getDataVencimento());
            pstm.setFloat(4, objeto.getValorPagar());
            pstm.setInt(5, objeto.getStatus());
            pstm.setInt(6, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(Pagar objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM pagar WHERE pagar.id = ?";
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
