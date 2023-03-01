package model.bo;

import java.util.Date;
import java.util.Timer;

public class Compra {
    
    private int id;
    private Date dataCompra;
    private Timer horaCompra;
    private String numeroNF;
    private String tipoNF;
    private float valorDesconto;
    private float valorAcrescimo;
    private float totalNF;
    private char status;
    private Fornecedor fornecedor;
    private CondicaoPgto condicaoPgto;
    private Pagar pagar;

    public Compra() {
    }

    public Compra(int id, Date dataCompra, Timer horaCompra, String numeroNF, String tipoNF, float valorDesconto, float valorAcrescimo, float totalNF, char status, Fornecedor fornecedor) {
        this.id = id;
        this.dataCompra = dataCompra;
        this.horaCompra = horaCompra;
        this.numeroNF = numeroNF;
        this.tipoNF = tipoNF;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.totalNF = totalNF;
        this.status = status;
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Timer getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(Timer horaCompra) {
        this.horaCompra = horaCompra;
    }

    public String getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(String numeroNF) {
        this.numeroNF = numeroNF;
    }

    public String getTipoNF() {
        return tipoNF;
    }

    public void setTipoNF(String tipoNF) {
        this.tipoNF = tipoNF;
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

    public float getTotalNF() {
        return totalNF;
    }

    public void setTotalNF(float totalNF) {
        this.totalNF = totalNF;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", dataCompra=" + dataCompra + ", horaCompra=" + horaCompra + ", numeroNF=" + numeroNF + ", tipoNF=" + tipoNF + ", valorDesconto=" + valorDesconto + ", valorAcrescimo=" + valorAcrescimo + ", totalNF=" + totalNF + ", status=" + status + '}';
    }
    
      
    public String sqlConection() {
        return "dataCompra, horaCompra, numeroNF, tipoNF, valorDesconto, valorAcrescimo, totalNF, status, fornecedor, condicaoPgto, pagar";    
    }
    
    
}
