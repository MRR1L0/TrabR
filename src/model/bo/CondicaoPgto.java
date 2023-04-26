package model.bo;
public class CondicaoPgto {
    
    private int id;
    private String descricaoCondicao;
    private int numeroParcelas;
    private int diasPrimeiraParcela;
    private int diasEntreParcela;
    private String status;

    public CondicaoPgto() {
    }

    public CondicaoPgto(int id, String descricaoCondicao, int numeroParcelas, int diasPrimeiraParcela, int diasEntreParcela, String status) {
        this.id = id;
        this.descricaoCondicao = descricaoCondicao;
        this.numeroParcelas = numeroParcelas;
        this.diasPrimeiraParcela = diasPrimeiraParcela;
        this.diasEntreParcela = diasEntreParcela;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoCondicao() {
        return descricaoCondicao;
    }

    public void setDescricaoCondicao(String descricaoCondicao) {
        this.descricaoCondicao = descricaoCondicao;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public int getDiasPrimeiraParcela() {
        return diasPrimeiraParcela;
    }

    public void setDiasPrimeiraParcela(int diasPrimeiraParcela) {
        this.diasPrimeiraParcela = diasPrimeiraParcela;
    }

    public int getDiasEntreParcela() {
        return diasEntreParcela;
    }

    public void setDiasEntreParcela(int diasEntreParcela) {
        this.diasEntreParcela = diasEntreParcela;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
	public String toString() {
		return "CondicaoPgto [id=" + id + ", descricaoCondicao=" + descricaoCondicao + ", numeroParcelas="
				+ numeroParcelas + ", diasPrimeiraParcela=" + diasPrimeiraParcela + ", diasEntreParcela="
				+ diasEntreParcela + ", status=" + status + "]";
	}
    
    
   public String sqlConection (){
        return "descricaoCondicao, numeroParcelas, diasPrimeiraParcela, diasEntreParcela, status";
   
   }
   
}
