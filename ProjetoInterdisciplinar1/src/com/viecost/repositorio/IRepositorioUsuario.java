package com.viecost.repositorio;

import java.util.ArrayList;

import com.viecost.entidades.Usuario;

public interface IRepositorioUsuario {
	
	public void cadastrarUsuario(Usuario usuario);
	public void atualizarUsuario(Usuario usuario);
	public boolean removerUsuario(int id);
	public Usuario procurarUsuario(int id);
	public ArrayList<Usuario> listarUsuario();
}
