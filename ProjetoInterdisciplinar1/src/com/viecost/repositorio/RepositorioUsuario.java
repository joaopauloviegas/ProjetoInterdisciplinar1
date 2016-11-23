package com.viecost.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.viecost.entidades.Usuario;

import com.viecost.util.Conexao;

public class RepositorioUsuario implements IRepositorioUsuario {

	Connection con = Conexao.getConnection();
	
	/*public void Salvar(Usuario usuario){
		if (usuario.getId() != null && usuario.getId() != 0){
			atualizarUsuario(usuario);
		} else {
			cadastrarUsuario(usuario);
		}
	}*/
	
	
	
	@Override
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

	@Override
	public void atualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean removerUsuario(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario procurarUsuario(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

}
