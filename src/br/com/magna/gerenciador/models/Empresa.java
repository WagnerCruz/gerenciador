package br.com.magna.gerenciador.models;

public class Empresa {
	
	private Integer id;	
	private String nome;
	private String cnpj;
//	private String endereco;
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
//	public String getEndereco() {
//		return endereco;
//	}
//	public void setEndereco(String endereco) {
//		this.endereco = endereco;
//	}
	

}
