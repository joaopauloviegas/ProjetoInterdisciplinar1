package com.viecost.fachada;

import java.sql.SQLException;

import com.viecost.controladores.ControladorUsuario;
import com.viecost.entidades.Usuario;

public class Fachada {
	
	public static Fachada instance;
	// aqui em baixo cria os controladores
	private ControladorUsuario controladorUsuario;
	
	public Fachada(){
		//instancia dos controladores 
		this.controladorUsuario = new ControladorUsuario();
	}
	
    public static Fachada getInstance(){
    	if(Fachada.instance == null){
    		Fachada.instance = new Fachada();
    	}
    	return Fachada.instance;
    }
    
  //METODO CADASTRAR PARA USUARIO
  	public void cadastarUsuario(Usuario usuario) throws IllegalArgumentException, SQLException{
  		System.out.println("Estou na fachada");
  		controladorUsuario.cadastrarUsuario(usuario);
  		
  	}

}// fim da classe fachada
