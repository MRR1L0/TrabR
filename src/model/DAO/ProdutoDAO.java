package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Produto;

public class ProdutoDAO implements InterfaceDAO<model.bo.Produto> {

    @Override
    public Produto create(Produto objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO produto (descricao, valorCompra, valorVenda, undCompra, undVenda, fatorConversao, status, dataCadastro, barraEntrada, barraSaida, estoqueMinimo, estoqueMaximo, marca_id, classe_id) VALUES (?,?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getDescricao());
            pstm.setDouble(2, objeto.getValorCompra());
            pstm.setDouble(3, objeto.getValorVenda());
            pstm.setString(4, objeto.getUndCompra());
            pstm.setString(5, objeto.getUndVanda());
            pstm.setDouble(6, objeto.getFatorConversao());
            pstm.setString(7, objeto.getStatus());
            pstm.setObject(8, objeto.getDataCadastro());
            pstm.setString(9, objeto.getBarraEntrada());
            pstm.setString(10, objeto.getBarraSaida());
            pstm.setFloat(11, objeto.getEstoqueMinino());
            pstm.setFloat(12, objeto.getEstoqueMaximo());
            pstm.setInt(13, objeto.getMarca().getId());
            pstm.setInt(14, objeto.getClasse().getId());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);
        return objeto;
    }

    @Override
    public Produto search(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT produto.id, produto.descricao from produto where produto.id = ?";
///id, descricao, valorCompra, valorVenda, undCompra, undVenda, fatorConversao, status, dataCadastro, barraEntrada, barraSaida, estoqueMinimo, estoqueMaximo
        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(0, codigo);
            rst = pstm.executeQuery();
            Produto produto = new Produto();

            while (rst.next()) {
                produto.setId(rst.getInt("id"));
                produto.setDescricao(rst.getString("descricao"));
                produto.setValorCompra(rst.getFloat("valorCompra"));
                produto.setValorVenda(rst.getFloat("valorVenda"));
                produto.setUndCompra(rst.getString("undCompra"));
                produto.setUndVanda(rst.getString("undVenda"));
                produto.setFatorConversao(rst.getInt("fatorConversao"));
                produto.setStatus(rst.getString("status"));
                produto.setDataCadastro(rst.getString("dataCadastro"));
                produto.setBarraEntrada(rst.getString("barraEntrada"));
                produto.setBarraSaida(rst.getString("barraSaida"));
                produto.setEstoqueMinino(rst.getInt("estoqueMinimo"));
                produto.setEstoqueMaximo(rst.getInt("estoqueMaximo"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return produto;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public Produto search(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT produto.id, produto.descricao from produto where produto.descricao = ?";
//    String sqlExecutar = "SELECT * from produto where descricao = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, descricao);
            rst = pstm.executeQuery();
            Produto produto = new Produto();

            while (rst.next()) {
                produto.setId(rst.getInt("id"));
                produto.setDescricao(rst.getString("descricao"));
                produto.setValorCompra(rst.getFloat("valorCompra"));
                produto.setValorVenda(rst.getFloat("valorVenda"));
                produto.setUndCompra(rst.getString("undCompra"));
                produto.setUndVanda(rst.getString("undVenda"));
                produto.setFatorConversao(rst.getInt("fatorConversao"));
                produto.setStatus(rst.getString("status"));
                produto.setDataCadastro(rst.getString("dataCadastro"));
                produto.setBarraEntrada(rst.getString("barraEntrada"));
                produto.setBarraSaida(rst.getString("barraSaida"));
                produto.setEstoqueMinino(rst.getInt("estoqueMinimo"));
                produto.setEstoqueMaximo(rst.getInt("estoqueMaximo"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return produto;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<Produto> search() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT produto.id, produto.descricao from produto";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<Produto> listaProduto = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Produto produto = new Produto();
                produto.setId(rst.getInt("id"));
                produto.setDescricao(rst.getString("descricao"));
                produto.setValorCompra(rst.getFloat("valorCompra"));
                produto.setValorVenda(rst.getFloat("valorVenda"));
                produto.setUndCompra(rst.getString("undCompra"));
                produto.setUndVanda(rst.getString("undVenda"));
                produto.setFatorConversao(rst.getInt("fatorConversao"));
                produto.setStatus(rst.getString("status"));
                produto.setDataCadastro(rst.getString("dataCadastro"));
                produto.setBarraEntrada(rst.getString("barraEntrada"));
                produto.setBarraSaida(rst.getString("barraSaida"));
                produto.setEstoqueMinino(rst.getInt("estoqueMinimo"));
                produto.setEstoqueMaximo(rst.getInt("estoqueMaximo"));
                listaProduto.add(produto);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaProduto;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(Produto objeto) {
//String sqlExecutar = "UPDATE produto SET descricao = ?, valorCompra = ?, valorVenda = ?, undCompra = ?, undVenda = ?, fatorConversao = ?, status = ?, dataCadastro = ?, barraEntrada = ?, barraSaida = ?, estoqueMinimo = ?, estoqueMaximo = ? WHERE id = ?";

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE produto set produto.descricao = ? where produto.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, objeto.getDescricao());
            pstm.setInt(1, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(Produto objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM produto WHERE produto.id = ?";
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
