package com.viecost.fachada;

import java.sql.SQLException;
import java.util.List;

import com.viecost.controladores.ControladorAnimal;
import com.viecost.controladores.ControladorUsuario;
import com.viecost.entidades.Animal;
import com.viecost.entidades.Usuario;
import com.viecost.util.CampoObrigatorioException;
import com.viecost.util.UsuarioJaCadastradoException;

public class Fachada {
	
	public static Fachada instance;
	// aqui em baixo cria os controladores
	private ControladorUsuario controladorUsuario;
	private ControladorAnimal controladorAnimal;
	
	public Fachada(){
		//instancia dos controladores 
		this.controladorUsuario = new ControladorUsuario();
		this.controladorAnimal = new ControladorAnimal();
	}
	
    public static Fachada getInstance(){
    	if(Fachada.instance == null){
    		Fachada.instance = new Fachada();
    	}
    	return Fachada.instance;
    }
    
  //METODO CADASTRAR PARA USUARIO
  	public void cadastarUsuario(Usuario usuario) throws IllegalArgumentException, 
  														SQLException, 
  														UsuarioJaCadastradoException, 
  														CampoObrigatorioException{
  		controladorUsuario.cadastrarUsuario(usuario);
  	}// fim do metodo cadastrar usuario
  	
  	public void removerUsuario(Usuario usuario){
  		controladorUsuario.removerUsuario(usuario);
	}
  	
  	public Usuario procurarUsuario(int id) {
		return controladorUsuario.procurarUsuario(id);
	}

  //METODO LISTAR PARA CARRO
  	public List<Usuario> listarUsuario(){
  		return controladorUsuario.listarUsuario();
  	}
  	
  	public List<Animal> listarAnimal(){
  		return controladorAnimal.listarAnimal();
  	}
}// fim da classe fachada
