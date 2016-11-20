package com.viecost.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.viecost.entidades.Usuario;

public class RepositorioUsuario implements IRepositorioUsuario {

	private Connection con = null;
	private int id = 0;
	
	public void conecta(){
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try{
			 con = DriverManager.getConnection(url,"system","joao123123");
			 
		}catch(SQLException sql){
			System.out.println("Erro na conexão" + sql);
		}//fim do catch
	}//fim do conecta
	
	public void desconecta(){
		try{
			con.close();
		}catch(SQLException sql){
			System.out.println("erro ao desconectar" +sql);
		}//fim do catch
	}//fim do desconecta
	
	
	@Override
	public void cadastrarUsuario(Usuario usuario) {
		System.out.println("estou no repositorio BD");
		
		
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
