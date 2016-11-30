package com.viecost.controladores;

import java.sql.SQLException;
import java.util.List;

import com.viecost.entidades.Usuario;
import com.viecost.repositorio.RepositorioUsuario;
import com.viecost.util.CampoObrigatorioException;
import com.viecost.util.UsuarioJaCadastradoException;

public class ControladorUsuario {
	
private RepositorioUsuario repositorioUsuario;
	
	
	//CONTROLADOR
	public ControladorUsuario(){
		
		
		this.repositorioUsuario = new RepositorioUsuario();
	}
	
	//METODO CADASTRAR USUARIO
	public void cadastrarUsuario(Usuario usuario) throws UsuarioJaCadastradoException,
														 CampoObrigatorioException,
														 IllegalArgumentException,
														 SQLException{
		
		if(usuario == null) throw new IllegalArgumentException("Usuario Invalido");
		if(usuario.getNome().equals("")) throw new CampoObrigatorioException("nome");
		if(usuario.getEmail().equals("")) throw new CampoObrigatorioException("email");
		if(usuario.getSenha().equals("")) throw new CampoObrigatorioException("senha");
		this.repositorioUsuario.cadastrarUsuario(usuario);
	}
	
	//METODO ATUALIZAR
	public void atualizarUsuario(Usuario usuario){
		this.repositorioUsuario.atualizarUsuario(usuario);
	}
	
	//METODO REMOVER 
	public void removerUsuario(Usuario usuario){
		this.repositorioUsuario.removerUsuario(usuario);
	}
	
	//METODO PROCURAR 
	public Usuario procurarUsuario(int id){
		return this.repositorioUsuario.procurarUsuario(id);
	}
	
	//METODO LISTAR
	public List<Usuario> listarUsuario(){
		return this.repositorioUsuario.listarUsuario();
	}
}
