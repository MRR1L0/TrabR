package model.bo;

import java.util.UUID;

public class ItensCupomFiscal {
    
   private UUID id;
   private float qtdProduto;
   private float valorUnitarioProduto;
   private String status;
   private CupomFiscal cupomFiscal;
   private HistoricoMovimentacao historicoMovimentacao;

    public ItensCupomFiscal() {
    }

    public ItensCupomFiscal(UUID id, float qtdProduto, float valorUnitarioProduto, String status, CupomFiscal cupomFiscal, HistoricoMovimentacao historicoMovimentacao) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.cupomFiscal = cupomFiscal;
        this.historicoMovimentacao = historicoMovimentacao;
    }

   
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public void setValorUnitarioProduto(float valorUnitarioProduto) {
        this.valorUnitarioProduto = valorUnitarioProduto;
    }

    public String getStatus() {
        return status;
    }

    public HistoricoMovimentacao getHistoricoMovimentacao() {
        return historicoMovimentacao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CupomFiscal getCupomFiscal() {
        return cupomFiscal;
    }

    public void setCupomFiscal(CupomFiscal cupomFiscal) {
        this.cupomFiscal = cupomFiscal;
    }

    @Override
	public String toString() {
		return "ItensCupomFiscal [id=" + id + ", qtdProduto=" + qtdProduto + ", valorUnitarioProduto="
				+ valorUnitarioProduto + ", status=" + status + ", cupomFiscal=" + cupomFiscal
				+ ", historicoMovimentacao=" + historicoMovimentacao + "]";
	}
   
   public String sqlConection (){
         return "qtdProduto, valorUnitarioProduto, status, cupomFiscal, historicoMovimentacao";
    
    
    }
    
}
