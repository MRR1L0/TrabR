package model.bo;

import java.util.Date;
import java.util.Timer;
import java.util.UUID;

public class HistoricoMovimentacao {
    
    
    private UUID id;
    private Date data;
    private  Timer hora;
    private char tipo;
    private float qtd;
    private char status;

    public HistoricoMovimentacao() {
    }

    public HistoricoMovimentacao(UUID id, Date data, Timer hora, char tipo, float qtd, char status) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.qtd = qtd;
        this.status = status;
    }

    public HistoricoMovimentacao(Date data, Timer hora, char tipo, float qtd, char status) {
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.qtd = qtd;
        this.status = status;
        this.id = UUID.randomUUID();
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

    public Timer getHora() {
        return hora;
    }

    public void setHora(Timer hora) {
        this.hora = hora;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HistoricoMovimentacao{" + "id=" + id + ", data=" + data + ", hora=" + hora + ", tipo=" + tipo + ", qtd=" + qtd + ", status=" + status + '}';
    }
    
    
    public String sqlConection (){
    return "data, hora, tipo, qtd, status";
    
    
    }
    
    
    
    
    
    
    
    
    
    
}
