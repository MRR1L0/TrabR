package model.bo;

import java.util.Date;
import java.sql.Time;

public class Pagar {
    
    private int id;
    private Date dataEmissao;
    private Time horaEmissao;
    private Date dataVencimento;
    private float valorPagar;
    private char status;
    private Pagamento pagamento;
    private Compra compra;

    public Pagar() {
    }

    public Pagar(int id, Date dataEmissao, Time horaEmissao, Date dataVencimento, float valorPagar, char status, Pagamento pagamento, Compra compra) {
        this.id = id;
        this.dataEmissao = dataEmissao;
        this.horaEmissao = horaEmissao;
        this.dataVencimento = dataVencimento;
        this.valorPagar = valorPagar;
        this.status = status;
        this.pagamento = pagamento;
        this.compra = compra;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Time getHoraEmissao() {
        return horaEmissao;
    }

    public void setHoraEmissao(Time horaEmissao) {
        this.horaEmissao = horaEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public float getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(float valorPagar) {
        this.valorPagar = valorPagar;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    

    @Override
	public String toString() {
		return "Pagar [id=" + id + ", dataEmissao=" + dataEmissao + ", horaEmissao=" + horaEmissao + ", dataVencimento="
				+ dataVencimento + ", valorPagar=" + valorPagar + ", status=" + status + ", pagamento=" + pagamento
				+ "]";
	}
    
    
    public String sqlConection (){
        return "dataEmissao, horaEmissao, dataVencimento, valorPagar, status";
    
    
    }
    
}

