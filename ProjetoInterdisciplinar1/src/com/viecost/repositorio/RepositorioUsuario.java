package com.viecost.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.viecost.entidades.Usuario;

import com.viecost.util.Conexao;

public class RepositorioUsuario{

Connection con = Conexao.getConnection();
	
	public void Salvar(Usuario usuario){
		if (usuario.getId() != null && usuario.getId() != 0) {
			atualizarUsuario(usuario);
		} else {
			cadastrarUsuario(usuario);
		}
	}
	
	public void cadastrarUsuario(Usuario usuario) {
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
		String sql = "UPDATE usuario SET nome=?, email=?, senha= ?, cidade=?, sexo=?, telefone=? WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.setString(3, usuario.getSenha());
			ps.setString(4, usuario.getCidade());
			ps.setString(5, usuario.getSexo());
			ps.setString(6, usuario.getFone());
			ps.setInt(7, usuario.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void removerUsuario(Usuario usuario) {
		String sql = "DELETE FROM usuario WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, usuario.getId());

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Usuario procurarUsuario(int id) {
		String sql = "SELECT * FROM usuario WHERE id=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		Usuario usuario = null;

		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();
			if (rs.next()) {
				usuario = new Usuario();

				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setFone(rs.getString("telefone"));
			}
			ps.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Erro ao executar consulta! " + e.getMessage());
		}
		return usuario;
	}

	public List<Usuario> listarUsuario() {
		List<Usuario> listaUsuario = new ArrayList<Usuario>();
		String sql = "SELECT * FROM usuario";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Usuario usuario = new Usuario();

				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setFone(rs.getString("telefone"));

				listaUsuario.add(usuario);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaUsuario;
	}

}
