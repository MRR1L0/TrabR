package model.bo;

import java.util.Date;

public class Fornecedor extends Pessoa {
    
    private String cnpj;
    private String inscEstadual;
    private String contato;
    private String razaoSocial;
    private String cpf;
    private String rg;
    private int id;

    public Fornecedor(String cnpj, String inscEstadual, String contato, String razaoSocial, String cpf, String rg) {
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.contato = contato;
        this.razaoSocial = razaoSocial;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Fornecedor(String cnpj, String inscEstadual, String contato, String razaoSocial, String cpf, String rg, int id, String nome, String fone1, String fone2, String email, Date dtCadastro, String complementoEndereco, String observacao, char status, Endereco endereco) {
        super( nome, fone1, fone2, email, dtCadastro, complementoEndereco, observacao, status, endereco);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.contato = contato;
        this.razaoSocial = razaoSocial;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Fornecedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
	public String toString() {
		return "Fornecedor [cnpj=" + cnpj + ", inscEstadual=" + inscEstadual + ", contato=" + contato + ", razaoSocial="
				+ razaoSocial + ", cpf=" + cpf + ", rg=" + rg + "]";
	}
    
    
    public String sqlConection (){
    return "cnpj,inscEstadual, contato, razaoSocial, cpf, rg";
    
    
    }
    
    
}
