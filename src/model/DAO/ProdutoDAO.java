/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author aluno
 */
public class ProdutoDAO implements InterfaceDAO<model.bo.Produto>{

    @Override
    public Produto create(Produto t) {
        
        Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "INSERT INTO produto ("+t.sqlConection()+") values(?,?,?,?,?,?,?,?,?,?,?)";
  
        try {
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getDescricao());
            pstm.setString(1, String.valueOf(t.getValorCompra()));
            pstm.setString(2, String.valueOf(t.getValorVenda()));
            pstm.setString(3, t.getUndCompra());
            pstm.setString(4, t.getUndVanda());
            pstm.setString(5, String.valueOf(t.getFatorConversao()));
            pstm.setString(6, String.valueOf(t.getStatus()));
            pstm.setString(7, String.valueOf(t.getDataCadastro()));
            pstm.setString(8, t.getBarraEntrada());
            pstm.setString(9, String.valueOf(t.getEstoqueMinino()));
            pstm.setString(10, String.valueOf(t.getMarca()));
            pstm.setString(11, String.valueOf(t.getClass()));
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return t;
    }

    @Override
    public Produto update(Produto t) {
        Connection conexao = ConnectionFactory.getConnection();
        
        var sqlExecutar = "UPDATE produto set " +t.sqlConection()+ ""
                + " values(?,?,?,?,?,?,?,?,?,?,?) where id = "+ t.getId();
  
        try {   
            PreparedStatement pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(0, t.getDescricao());
            pstm.setString(1, String.valueOf(t.getValorCompra()));
            pstm.setString(2, String.valueOf(t.getValorVenda()));
            pstm.setString(3, t.getUndCompra());
            pstm.setString(4, t.getUndVanda());
            pstm.setString(5, String.valueOf(t.getFatorConversao()));
            pstm.setString(6, String.valueOf(t.getStatus()));
            pstm.setString(7, String.valueOf(t.getDataCadastro()));
            pstm.setString(8, t.getBarraEntrada());
            pstm.setString(9, String.valueOf(t.getEstoqueMinino()));
            pstm.setString(10, String.valueOf(t.getMarca()));
            pstm.setString(11, String.valueOf(t.getClass()));
            pstm.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    @Override
    public Produto search(Produto t) {
        Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "SELECT descricao, valorCompra, valorVenda, undCompra, undVanda"
                + ", fatorConversao, status, dataCadastro, barraEntrada"
                + ", barraSaida, estoqueMinino, estoqueMaximo, marca, classe"
                + " from produto where id = "+t.getId();
        var produto = new Produto();
        PreparedStatement pstm;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            ResultSet rst = pstm.executeQuery();

           
            produto.setId(rst.getInt("id"));
            produto.setDescricao(rst.getString("descricao"));
            produto.setValorCompra(rst.getFloat("valorCompra"));
            produto.setValorVenda(rst.getFloat("valorVenda"));
            produto.setUndCompra(rst.getString("undCompra"));
            produto.setUndVanda(rst.getString("undVanda"));
            produto.setFatorConversao(rst.getInt("fatorConversao"));
            produto.setStatus(rst.getObject("status",char.class));
            produto.setDataCadastro(rst.getDate("dataCadastro"));
            produto.setBarraEntrada(rst.getString("barraEntrada"));
            produto.setBarraSaida(rst.getString("barraSaida"));
            produto.setEstoqueMinino(rst.getFloat("estoqueMinino"));
            produto.setEstoqueMaximo(rst.getFloat("estoqueMaximo"));
            produto.setMarca(rst.getObject("marca", model.bo.Marca.class));
            produto.setClasse(rst.getObject("classe",model.bo.Classe.class));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);     
        }
        return produto;
    }

    @Override
    public List<Produto> search() {
        Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "SELECT descricao, valorCompra, valorVenda, undCompra, undVanda"
                + ", fatorConversao, status, dataCadastro, barraEntrada"
                + ", barraSaida, estoqueMinino, estoqueMaximo, marca,classe from produto";
        
        List<Produto> listaProduto = new ArrayList<>();
        PreparedStatement pstm;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            ResultSet rst = pstm.executeQuery();
           
            while(rst.next()){
                var produto = new Produto();
                produto.setId(rst.getInt("id"));
                produto.setDescricao(rst.getString("descricao"));
                produto.setValorCompra(rst.getFloat("valorCompra"));
                produto.setValorVenda(rst.getFloat("valorVenda"));
                produto.setUndCompra(rst.getString("undCompra"));
                produto.setUndVanda(rst.getString("undVanda"));
                produto.setFatorConversao(rst.getInt("fatorConversao"));
                produto.setStatus(rst.getObject("status",char.class));
                produto.setDataCadastro(rst.getDate("dataCadastro"));
                produto.setBarraEntrada(rst.getString("barraEntrada"));
                produto.setBarraSaida(rst.getString("barraSaida"));
                produto.setEstoqueMinino(rst.getFloat("estoqueMinino"));
                produto.setEstoqueMaximo(rst.getFloat("estoqueMaximo"));
                produto.setMarca(rst.getObject("marca", model.bo.Marca.class));
                produto.setClasse(rst.getObject("classe",model.bo.Classe.class));
                listaProduto.add(produto);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProduto;
    }

    @Override
    public void remove(Produto t) {
    	Connection conexao = ConnectionFactory.getConnection();
        var sqlExecutar = "DELETE FROM produto WHERE id = "+t.getId();
        PreparedStatement pstm = null;
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
    }   
}
