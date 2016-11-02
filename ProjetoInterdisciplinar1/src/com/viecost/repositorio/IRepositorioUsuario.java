package com.viecost.repositorio;

import java.util.ArrayList;

import com.viecost.entidades.Usuario;

public interface IRepositorioUsuario {
	
	public void cadastrarUsuario(Usuario usuario);
	public void atualizarUsuario(Usuario usuario);
	public boolean removerUsuario(String cpf);
	public Usuario procurarUsuario(String cpf);
	public ArrayList<Usuario> listarUsuario();
}
