package model.bo;
public class ItensCompra {
    
    private int id;
    private float qtdProduto;
    private float valorUnitarioProduto;
    private String status;
    private HistoricoMovimentacao historicoMovimentacao;
    private Compra compra;
    private Produto produto;

    public ItensCompra() {
    }

    public ItensCompra(int id, float qtdProduto, float valorUnitarioProduto, String status, HistoricoMovimentacao historicoMovimentacao, Compra compra, Produto produto) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.historicoMovimentacao = historicoMovimentacao;
        this.compra = compra;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(float qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public float getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public Compra getCompra() {
        return compra;
    }

    public HistoricoMovimentacao getHistoricoMovimentacao() {
        return historicoMovimentacao;
    }

    public void setValorUnitarioProduto(float valorUnitarioProduto) {
        this.valorUnitarioProduto = valorUnitarioProduto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
	public String toString() {
		return "ItensCompra [id=" + id + ", qtdProduto=" + qtdProduto + ", valorUnitarioProduto=" + valorUnitarioProduto
				+ ", status=" + status + ", historicoMovimentacao=" + historicoMovimentacao + ", compra=" + compra
				+ "]";
	}
    
    
    public String sqlConection (){
        return "qtdProduto, valorUnitarioProduto, status, historicoMovimentacao, compra";
    
    }
   
    
}
