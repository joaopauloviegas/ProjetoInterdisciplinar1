package com.viecost.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.viecost.entidades.Usuario;

import com.viecost.util.Conexao;

public class RepositorioUsuario {

	Connection con = Conexao.getConnection();
	
	public void Salvar(Usuario usuario){
		if (usuario.getId() != 0) {
			atualizarUsuario(usuario);
		} else {
			cadastrarUsuario(usuario);
		}
		//if (usuario.getId() != null && usuario.getId() != 0){
			//atualizarUsuario(usuario);
		//} else {
		//	cadastrarUsuario(usuario);
		//}
	}
	
	public void cadastrarUsuario(Usuario usuario) {
		System.out.println("repositorio");
		
		String sql = "INSERT INTO usuario (nome, email, senha, cidade, sexo, telefone) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.setString(3, usuario.getSenha());
			ps.setString(4, usuario.getCidade());
			ps.setString(5, usuario.getSexo());
			ps.setString(6, usuario.getFone());
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizarUsuario(Usuario usuario) {
		
		
	}

	public boolean removerUsuario(int id) {
		
		return false;
	}

	public Usuario procurarUsuario(int id) {
		
		return null;
	}

	public ArrayList<Usuario> listarUsuario() {
		
		return null;
	}

}
