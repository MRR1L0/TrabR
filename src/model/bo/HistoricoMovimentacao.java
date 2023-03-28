package model.bo;

import java.util.Date;
import java.util.Timer;
import java.util.UUID;

public class HistoricoMovimentacao {
    
    
    private UUID id;
    private Date data;
    private  String hora;
    private String tipo;
    private float qtd;
    private String status;
    private Produto produto;
    private ItensCupomFiscal ItensCupomFiscal;
    private ItensCompra itensCompra;

    public HistoricoMovimentacao() {
    }

    public Produto getProduto() {
        return produto;
    }

    public ItensCupomFiscal getItensCupomFiscal() {
        return ItensCupomFiscal;
    }

    public void setItensCupomFiscal(ItensCupomFiscal ItensCupomFiscal) {
        this.ItensCupomFiscal = ItensCupomFiscal;
    }

    public HistoricoMovimentacao(UUID id, Date data, String hora, String tipo, float qtd, String status, Produto produto, ItensCupomFiscal ItensCupomFiscal, ItensCompra itensCompra) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.qtd = qtd;
        this.status = status;
        this.produto = produto;
        this.ItensCupomFiscal = ItensCupomFiscal;
        this.itensCompra = itensCompra;
    }



    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public ItensCompra getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(ItensCompra itensCompra) {
        this.itensCompra = itensCompra;
    }



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
	public String toString() {
		return "HistoricoMovimentacao [id=" + id + ", data=" + data + ", hora=" + hora + ", tipo=" + tipo + ", qtd="
				+ qtd + ", status=" + status + "]";
	}
    
    
    public String sqlConection (){
    return "data, hora, tipo, qtd, status";
    
    
    }
    
    
    
    
    
    
    
    
    
    
}
