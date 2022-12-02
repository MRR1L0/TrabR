package model.bo;

import java.util.UUID;

public class ItensCupomFiscal {
    
   private UUID id;
   private float qtdProduto;
   private float valorUnitarioProduto;
   private char status;
   private CupomFiscal cupomFiscal;
   private HistoricoMovimentacao historicoMovimentacao;

    public ItensCupomFiscal() {
    }

    public ItensCupomFiscal(UUID id, float qtdProduto, float valorUnitarioProduto, char status, CupomFiscal cupomFiscal, HistoricoMovimentacao historicoMovimentacao) {
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

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
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
        return "ItensCupomFiscal{" + "id=" + id + ", qtdProduto=" + qtdProduto + ", valorUnitarioProduto=" + valorUnitarioProduto + ", status=" + status + ", cupomFiscal=" + cupomFiscal + '}';
    }
   
   
    
}
