package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Cidade;

public class CidadeDAO implements InterfaceDAO<Cidade> {

    @Override
    public Cidade create(Cidade objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cidade (descricao) VALUES (?)";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        ConnectionFactory.closeConnection(conexao, pstm);
        return objeto;
    }

    @Override
    public Cidade search(int t) {
        Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "SELECT cidade.id, cidade.descricao from cidade where cidade.id = ?";
        var cidade = new Cidade();
        PreparedStatement pstm = null;
        ResultSet rst = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, t);
            rst = pstm.executeQuery();
            
            while (rst.next()) {
                cidade.setId(rst.getInt("id"));
                cidade.setDescricao(rst.getString("descricao"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
                 
        }finally{
            ConnectionFactory.closeConnection(conexao, pstm, rst); 
            return cidade;
        }
    }

    @Override
    public Cidade search(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cidade.id, cidade.descricao from cidade where cidade.descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();
            Cidade cidade = new Cidade();

            while (rst.next()) {
                cidade.setId(rst.getInt("id"));
                cidade.setDescricao(rst.getString("descricao"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cidade;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<Cidade> search() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cidade.id, cidade.descricao from cidade";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<Cidade> listaCidade = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Cidade cidade = new Cidade();
                cidade.setId(rst.getInt("id"));
                cidade.setDescricao(rst.getString("descricao"));
                listaCidade.add(cidade);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCidade;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(Cidade objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE cidade set cidade.descricao = ? where cidade.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setInt(2, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);
    }

    @Override
    public void delete(Cidade objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM cidade WHERE cidade.id = ?";
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
