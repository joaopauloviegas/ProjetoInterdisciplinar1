package com.viecost.util;

import java.sql.SQLException;

import com.viecost.entidades.Usuario;
import com.viecost.fachada.Fachada;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, SQLException {
		
		Fachada f = Fachada.getInstance();
		Usuario usuario = new Usuario("joao paulo", "joao_paulo_viegas11@hotmail.com","1234", "Caruaru", "masculino", "995212279"  );
		Usuario usuario2 = new Usuario("Natalia", "NATALIA@hotmail.com","4321", "Recife", "feminino", "00000000"  );
		f.cadastarUsuario(usuario);
		f.cadastarUsuario(usuario2);

	}

}
