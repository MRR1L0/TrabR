package model.bo;

import java.util.Date;

public class Produto {
    
        
    private int id;
    private String descricao;
    private float valorCompra;
    private float valorVenda;
    private String undCompra;
    private String undVanda;
    private int fatorConversao;
    private String status;
    private String dataCadastro;
    private String barraEntrada;
    private String barraSaida;
    private float estoqueMinino;
    private float estoqueMaximo;
    private Marca marca;
    private Classe classe;

    public Produto() {
    }

    public Produto(int id, String descricao, float valorCompra, float valorVenda, String undCompra, String undVanda, int fatorConversao, String status, String dataCadastro, String barraEntrada, String barraSaida, float estoqueMinino, float estoqueMaximo) {
        this.id = id;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.undCompra = undCompra;
        this.undVanda = undVanda;
        this.fatorConversao = fatorConversao;
        this.status = status;
        this.dataCadastro = dataCadastro;
        this.barraEntrada = barraEntrada;
        this.barraSaida = barraSaida;
        this.estoqueMinino = estoqueMinino;
        this.estoqueMaximo = estoqueMaximo;
    }

    public int getId() {
        return id;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getUndCompra() {
        return undCompra;
    }

    public void setUndCompra(String undCompra) {
        this.undCompra = undCompra;
    }

    public String getUndVanda() {
        return undVanda;
    }

    public void setUndVanda(String undVanda) {
        this.undVanda = undVanda;
    }

    public int getFatorConversao() {
        return fatorConversao;
    }

    public void setFatorConversao(int fatorConversao) {
        this.fatorConversao = fatorConversao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getBarraEntrada() {
        return barraEntrada;
    }

    public void setBarraEntrada(String barraEntrada) {
        this.barraEntrada = barraEntrada;
    }

    public String getBarraSaida() {
        return barraSaida;
    }

    public void setBarraSaida(String barraSaida) {
        this.barraSaida = barraSaida;
    }

    public float getEstoqueMinino() {
        return estoqueMinino;
    }

    public void setEstoqueMinino(float estoqueMinino) {
        this.estoqueMinino = estoqueMinino;
    }

    public float getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(float estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    @Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorCompra=" + valorCompra + ", valorVenda="
				+ valorVenda + ", undCompra=" + undCompra + ", undVanda=" + undVanda + ", fatorConversao="
				+ fatorConversao + ", status=" + status + ", dataCadastro=" + dataCadastro + ", barraEntrada="
				+ barraEntrada + ", barraSaida=" + barraSaida + ", estoqueMinino=" + estoqueMinino + ", estoqueMaximo="
				+ estoqueMaximo + ", marca=" + marca + ", classe=" + classe + "]";
	}


    public String sqlConection(){
        return "descricao, valorCompra, valorVenda, undCompra, undVanda"
                + ", fatorConversao, status, dataCadastro, barraEntrada"
                + ", barraSaida, estoqueMinino, estoqueMaximo, marca,classe";

    }
}
