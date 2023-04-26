package model.bo;

import java.util.Date;

public class Cliente extends Pessoa {
    
    private int id;
    private String cpf;
    private String rg;
    private String dtNascimento;
    private String sexo;

    public Cliente(String cpf, String rg, String dtNascimento, String sexo) {
        this.cpf = cpf;
        this.rg = rg;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
    }

    public Cliente(String cpf, String rg, String dtNascimento, String sexo,  String nome, String fone1, String fone2,
     String email, String dtCadastro, String complementoEndereco, String observacao, String status, Endereco endereco) {
        super(nome, fone1, fone2, email, dtCadastro, complementoEndereco, observacao, status, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.dtNascimento = dtNascimento;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public Cliente() {
      
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

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", rg=" + rg + ", dtNascimento=" + dtNascimento + ", sexo=" + sexo + "]";
	}
    
     
    public String sqlConection() {
        return super.sqlConection() + "cpf, rg, dtNascimento, sexo";    
    }
    
}
