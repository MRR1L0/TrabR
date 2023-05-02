package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bo.Endereco;

public class EnderecoDAO implements InterfaceDAO<model.bo.Endereco> {

 
    @Override
    public Endereco create(Endereco objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO endereco (logradouro, cep, bairro_id, cidade_id) VALUES (?,?,?,?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getLogradouro()); // atributo que estao no banco
            pstm.setString(2, objeto.getCep());
            pstm.setInt(3, objeto.getBairro().getId());
            pstm.setInt(4, objeto.getCidade().getId());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);
        return objeto;
    }

    @Override
    public Endereco search(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT * from endereco where endereco.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            rst = pstm.executeQuery();
            Endereco endereco = new Endereco();

            while (rst.next()) {
                var cidadeDao = new CidadeDAO();
                var bairroDao = new BairroDAO();
                endereco.setId(rst.getInt("id"));
                endereco.setLogradouro(rst.getString("Logradouro"));
                endereco.setCep(rst.getString("CEP"));
                endereco.setCidade(cidadeDao.search(rst.getInt("cidade_id")));
                endereco.setBairro(bairroDao.search(rst.getInt("bairro_id")));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return endereco;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public Endereco search(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT * from endereco where endereco.cep = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, descricao);
            rst = pstm.executeQuery();
            Endereco endereco = new Endereco();
            var cidadeDao = new CidadeDAO();
            var bairroDao = new BairroDAO();

            while (rst.next()) {
                endereco.setId(rst.getInt("id"));
                endereco.setLogradouro(rst.getString("Logradouro"));
                endereco.setCep(rst.getString("CEP"));
                endereco.setCidade(cidadeDao.search(rst.getInt("cidade_id")));
                endereco.setBairro(bairroDao.search(rst.getInt("bairro_id")));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return endereco;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }
    
    public Endereco search(String cidade, String bairro) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT endereco.id, endereco.cep, endereco.logradouro from endereco where endereco.cidade = ? and endereco.bairro = ?";
        String sql = "SELECT endereco.id, endereco.cep, endereco.logradouro, cidade.descricao, bairro.descricao\n" +
                    "FROM endereco\n" +
                    "INNER JOIN cidade ON cidade.id = endereco.cidade_id\n" +
                    "INNER JOIN bairro ON bairro.id = endereco.bairro_id\n" +
                    "WHERE cidade.descricao = ? AND bairro.descricao = ?";
        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, cidade);
            pstm.setString(2, bairro);
            rst = pstm.executeQuery();
            Endereco endereco = new Endereco();

            while (rst.next()) {
                endereco.setId(rst.getInt("id"));
                endereco.setLogradouro(rst.getString("Logradouro"));
                endereco.setCep(rst.getString("CEP"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return endereco;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    } 

    @Override
    public List<Endereco> search() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT * from endereco";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<Endereco> listaEndereco = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Endereco endereco = new Endereco();
                endereco.setId(rst.getInt("id"));
                endereco.setLogradouro(rst.getString("Logradouro"));
                endereco.setCep(rst.getString("CEP"));
                listaEndereco.add(endereco);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaEndereco;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(Endereco objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE endereco set endereco.logradouro = ?, endereco.cidade_id = ?, endereco.bairro_id = ?, endereco.cep = ? where endereco.id = ?";
        PreparedStatement pstm = null;

        try {
            var cidadeDao = new CidadeDAO();
            var cidade = cidadeDao.search(objeto.getCidade().getId());
            var bairroDao = new BairroDAO();
            var bairro = bairroDao.search(objeto.getBairro().getId());
            
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getLogradouro());
            pstm.setInt(2, objeto.getCidade().getId());
            pstm.setInt(3, objeto.getBairro().getId());
            pstm.setString(4, objeto.getLogradouro());
            pstm.setInt(5, objeto.getId());
            cidadeDao.update(cidade);
            bairroDao.update(bairro);
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(Endereco objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM endereco WHERE endereco.id = ?";
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
