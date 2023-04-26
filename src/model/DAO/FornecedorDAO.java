package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bo.Fornecedor;

public class FornecedorDAO implements InterfaceDAO<model.bo.Fornecedor> {

    @Override
    public Fornecedor create(Fornecedor objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO fornecedor (nome, fone1, fone2, complementoEndereco, email, dtCadastro, observacao, status, cnpj, inscEstadual, contato, razaoSocial, cpf, rg, endereco_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome()); // atributo que estao no banco
            pstm.setString(2, objeto.getFone1());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getComplementoEndereco());
            pstm.setString(5, objeto.getEmail());
            pstm.setObject(6, objeto.getDtCadastro());
            pstm.setString(7, objeto.getObservacao());
            pstm.setString(8, objeto.getStatus());
            pstm.setString(5, objeto.getCnpj());
            pstm.setString(5, objeto.getInscEstadual());
            pstm.setString(0, objeto.getContato());
            pstm.setString(0, objeto.getRazaoSocial());
            pstm.setString(9, objeto.getCpf());
            pstm.setString(10, objeto.getRg());
            pstm.setInt(11, objeto.getEndereco().getId());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);
        return objeto;
    }

    @Override
    public Fornecedor search(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT fornecedor.id, fornecedor.nome from fornecedor where fornecedor.id = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(0, codigo);
            rst = pstm.executeQuery();
            Fornecedor fornecedor = new Fornecedor();

            while (rst.next()) {
                fornecedor.setId(rst.getInt("id"));
                fornecedor.setNome(rst.getString("nome"));
                fornecedor.setFone1(rst.getString("fone1"));
                fornecedor.setFone2(rst.getString("fone2"));
                fornecedor.setComplementoEndereco(rst.getString("complementoEndereco"));
                fornecedor.setEmail(rst.getString("email"));
                fornecedor.setDtCadastro(rst.getString("dtCadastro"));
                fornecedor.setObservacao(rst.getString("observacao"));
                fornecedor.setStatus(rst.getString("status"));
                fornecedor.setCnpj(rst.getString("cnpj"));
                fornecedor.setInscEstadual(rst.getString("Inscricao Estadual"));
                fornecedor.setContato(rst.getString("Contato"));
                fornecedor.setRazaoSocial(rst.getString("Razao Social"));
                fornecedor.setCpf(rst.getString("CPF"));
                fornecedor.setRg(rst.getString("RG"));

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return fornecedor;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public Fornecedor search(String descricao) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT fornecedor.id, fornecedor.cnpj, fornecedor.razaoSocial, fornecedor.inscricaoEstadual, fornecedor.status from fornecedor where fornecedor.cnpj = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, descricao);
            rst = pstm.executeQuery();
            Fornecedor fornecedor = new Fornecedor();

            while (rst.next()) {
                fornecedor.setId(rst.getInt("id"));
                fornecedor.setCnpj(rst.getString("nome"));
                fornecedor.setRazaoSocial(rst.getString("Razao Social"));
                fornecedor.setInscEstadual(rst.getString("Inscricao Estadual"));
                fornecedor.setStatus(rst.getString("status"));

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return fornecedor;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<Fornecedor> search() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT fornecedor.id, fornecedor.cnpj, fornecedor.razaoSocial, fornecedor.inscricaoEstadual, fornecedor.status from fornecedor where fornecedor";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<Fornecedor> listaFornecedor = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rst.getInt("id"));
                fornecedor.setCnpj(rst.getString("nome"));
                fornecedor.setRazaoSocial(rst.getString("Razao Social"));
                fornecedor.setInscEstadual(rst.getString("Inscricao Estadual"));
                fornecedor.setStatus(rst.getString("status"));
                listaFornecedor.add(fornecedor);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaFornecedor;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(Fornecedor objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE fornecedor set fornecedor.nome = ? where fornecedor.id = ?";
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, objeto.getNome());
            pstm.setInt(1, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

    @Override
    public void delete(Fornecedor objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM fornecedor WHERE fornecedor.id = ?";
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
