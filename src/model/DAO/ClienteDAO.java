package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bo.Cliente;

public class ClienteDAO implements InterfaceDAO<model.bo.Cliente> {

    @Override
    public Cliente create(Cliente objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cliente (nome, fone1, fone2, complementoEndereco, email, dtCadastro, observacao, status, cpf, rg, dtNascimento, sexo, endereco_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm = null; // interagir com o banco de dados

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome()); // atributo que estao no banco
            pstm.setString(2, objeto.getFone1());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getComplementoEndereco());
            pstm.setString(5, objeto.getEmail());
            pstm.setString(6, objeto.getDtCadastro());
            pstm.setString(7, objeto.getObservacao());
            pstm.setString(8, objeto.getStatus());
            pstm.setString(9, objeto.getCpf());
            pstm.setString(10, objeto.getRg());
            pstm.setString(11, objeto.getDtNascimento());
            pstm.setString(12, objeto.getSexo());
            pstm.setInt(13, objeto.getEndereco().getId());

            pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);
        return objeto;
    }

    @Override
    public Cliente search(int codigo) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cliente.id, cliente.nome from cliente where cliente.id = ?";
//Para corrigir isso, você deve atualizar a consulta SQL para selecionar todas as colunas necessárias. Por exemplo, se quiser selecionar todas as colunas da tabela cliente, a consulta deve ser:

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            rst = pstm.executeQuery();
            Cliente cliente = new Cliente();

            while (rst.next()) {
                cliente.setId(rst.getInt("id"));
                cliente.setNome(rst.getString("nome"));
                cliente.setFone1(rst.getString("fone1"));
                cliente.setFone2(rst.getString("fone2"));
                cliente.setComplementoEndereco(rst.getString("complementoEndereco"));
                cliente.setEmail(rst.getString("email"));
                cliente.setDtCadastro(rst.getString("dtCadastro"));
                cliente.setObservacao(rst.getString("observacao"));
                cliente.setStatus(rst.getString("status"));
                cliente.setCpf(rst.getString("cpf"));
                cliente.setRg(rst.getString("rg"));
                cliente.setDtNascimento(rst.getString("dtNascimento"));
                cliente.setSexo(rst.getString("sexo"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cliente;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public Cliente search(String nome) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cliente.id, cliente.nome, cliente.cpf, cliente.fone1, cliente.status from cliente where cliente.nome = ?";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, nome);
            rst = pstm.executeQuery();
            Cliente cliente = new Cliente();

            while (rst.next()) {
                cliente.setId(rst.getInt("id"));
                cliente.setNome(rst.getString("nome"));
                cliente.setCpf(rst.getString("cpf"));
                cliente.setFone1(rst.getString("fone1"));
                cliente.setStatus(rst.getString("status"));                  //o valor do campo status é retornado como uma String e o primeiro caractere é obtido utilizando o método charAt(0), convertendo-o em um char.
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cliente;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public List<Cliente> search() {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "SELECT cliente.id, cliente.nome, cliente.cpf, cliente.fone1, cliente.status, cliente.sexo, cliente.dtCadastro  from cliente";

        PreparedStatement pstm = null;
        ResultSet rst = null;

        List<Cliente> listaCliente = new ArrayList<>();

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();

            while (rst.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rst.getInt("id"));
                cliente.setNome(rst.getString("nome"));
                cliente.setCpf(rst.getString("cpf"));
                cliente.setFone1(rst.getString("fone1"));
                cliente.setStatus(rst.getString("status"));
                cliente.setSexo(rst.getString("sexo"));
                cliente.setDtCadastro(rst.getString("dtCadastro"));
                listaCliente.add(cliente);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return listaCliente;

        } catch (SQLException ex) {
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }

    }

    @Override
    public void update(Cliente objeto) {
//// (nome, fone1, fone2, complementoEndereco, email, dtCadastro, observacao, status, cpf, rg, dtNascimento, sexo
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "UPDATE cliente SET cliente.nome = ?, "
                + "cliente.fone1 = ?, cliente.fone2 = ?, cliente.complementoEndereco = ?, cliente.email = ?, "
                + "cliente.dtCadastro = ?, cliente.observacao = ?, cliente.status = ?, cliente.cpf = ?, cliente.rg = ?, "
                + "cliente.dtNascimento = ?, cliente.sexo= ? where cliente.id = ?";   //descrição do cliente e o ID do cliente estão sendo utilizados para atualizar o registro no banco de dados.
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getFone1());
            pstm.setString(3, objeto.getFone2());
            pstm.setString(4, objeto.getComplementoEndereco());
            pstm.setString(5, objeto.getEmail());
            pstm.setObject(6, objeto.getDtCadastro());           ///object - desde que o tipo de dados do campo dtCadastro no banco de dados seja DATETIME, TIMESTAMP ou similar.
            pstm.setString(7, objeto.getObservacao());
            pstm.setString(8, objeto.getStatus());
            pstm.setString(9, objeto.getCpf());
            pstm.setString(10, objeto.getRg());
            pstm.setObject(11, objeto.getDtNascimento());
            pstm.setString(12, objeto.getSexo());   ///// convertendo char para string
            pstm.setInt(13, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);
    }

    @Override
    public void delete(Cliente objeto) {

        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "DELETE FROM cliente WHERE cliente.id = ?";   //ID do cliente está sendo utilizado para identificar o registro a ser excluído.
        PreparedStatement pstm = null;

        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, objeto.getId());
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ConnectionFactory.closeConnection(conexao, pstm);

    }

}
