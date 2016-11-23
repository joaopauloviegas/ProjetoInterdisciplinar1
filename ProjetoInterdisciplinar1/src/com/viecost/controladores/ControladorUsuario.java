package com.viecost.controladores;

import java.util.ArrayList;

import com.viecost.entidades.Usuario;
import com.viecost.repositorio.IRepositorioUsuario;
import com.viecost.repositorio.RepositorioUsuario;

public class ControladorUsuario {
	
	private IRepositorioUsuario repositorioUsuario;
	
	
	//CONTROLADOR
	public ControladorUsuario(){
		this.repositorioUsuario = new RepositorioUsuario();
	}
	
	//METODO CADASTRAR USUARIO
	public void cadastrarUsuario(Usuario usuario){
		System.out.println("controlador");
		this.repositorioUsuario.cadastrarUsuario(usuario);
	}
	
	//METODO ATUALIZAR
	public void atualizarUsuario(Usuario usuario){
		this.repositorioUsuario.atualizarUsuario(usuario);
	}
	
	//METODO REMOVER 
	public boolean removerUsuario(String cpf){
		return this.repositorioUsuario.removerUsuario(cpf);
	}
	
	//METODO PROCURAR 
	public Usuario procurarUsuario(String cpf){
		return this.repositorioUsuario.procurarUsuario(cpf);
	}
	
	//METODO LISTAR
	public ArrayList<Usuario> listarUsuario(){
		return this.repositorioUsuario.listarUsuario();
	}
	
	

}
