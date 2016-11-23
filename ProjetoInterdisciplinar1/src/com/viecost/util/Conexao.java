package com.viecost.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection getConnection(){
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/pi";
		String user = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado com sucesso.");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver não encontrado " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Não pode conectar: " + e.getMessage());
		}
		return con;
	}

}
