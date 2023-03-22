package model.bo;

import java.util.Date;

public class Pagamento {
    
    private int id;
    private Date dataPagamento;
    private String horaPagamento;
    private float valorDesconto;
    private float valorAcrescimo;
    private float valorPago;
    private String status;

    public Pagamento() {
    }

    public Pagamento(int id, Date dataPagamento, String horaPagamento, float valorDesconto, float valorAcrescimo, float valorPago, String status) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.horaPagamento = horaPagamento;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.valorPago = valorPago;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getHoraPagamento() {
        return horaPagamento;
    }

    public void setHoraPagamento(String horaPagamento) {
        this.horaPagamento = horaPagamento;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
	public String toString() {
		return "Pagamento [id=" + id + ", dataPagamento=" + dataPagamento + ", horaPagamento=" + horaPagamento
				+ ", valorDesconto=" + valorDesconto + ", valorAcrescimo=" + valorAcrescimo + ", valorPago=" + valorPago
				+ ", status=" + status + "]";
	}

    
    public String sqlConection (){
    return null;
    
    
    }
    
}

