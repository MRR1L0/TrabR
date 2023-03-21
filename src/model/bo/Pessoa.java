package model.bo;

import java.util.Date;

public abstract class Pessoa {
        //n pode ser instaciada
    
    private int id;
    private String nome;
    private String fone1;
    private String fone2;
    private String email;
    private Date dtCadastro;
    private String complementoEndereco;
    private String observacao;
    private char status;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String fone1, String fone2, String email, Date dtCadastro, String complementoEndereco, 
            String observacao, char status, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.email = email;
        this.dtCadastro = dtCadastro;
        this.complementoEndereco = complementoEndereco;
        this.observacao = observacao;
        this.status = status;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", fone1=" + fone1 + ", fone2=" + fone2 + ", email=" + email
				+ ", dtCadastro=" + dtCadastro + ", complementoEndereco=" + complementoEndereco + ", observacao="
				+ observacao + ", status=" + status + ", endereco=" + endereco + "]";
	}
    
     
    public String sqlConection() {
        return "nome, fone1, fone2, email, dtCadastro, complementoEndereco, observacao, status, endereco ,";    }
    
}
