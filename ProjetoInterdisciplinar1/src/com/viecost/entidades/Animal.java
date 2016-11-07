package com.viecost.entidades;

public class Animal {

	private String nome;
	private String raca;
	private int idade;
	private String sexo;
	private String pelagem;
	private String porte;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", raca=" + raca + ", idade=" + idade + ", sexo=" + sexo + ", pelagem="
				+ pelagem + ", porte=" + porte + "]";
	}
	
	
	
	
}
