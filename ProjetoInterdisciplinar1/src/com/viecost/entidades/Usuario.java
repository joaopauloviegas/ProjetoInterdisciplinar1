package com.viecost.entidades;

public class Usuario {

	private int id;
	private String nome;
	private String email;
	private String senha;
	private String cidade;
	private String sexo;
	private String fone;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String email, String senha, String cidade, String sexo, String fone){
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cidade = cidade;
		this.sexo = sexo;
		this.fone = fone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", senha=" + senha + ", cidade=" + cidade + ", sexo="
				+ sexo + ", fone=" + fone + "]";
	}
	
	
}
