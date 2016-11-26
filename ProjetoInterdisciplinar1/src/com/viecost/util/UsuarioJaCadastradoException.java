package com.viecost.util;

public class UsuarioJaCadastradoException extends Exception{

	public UsuarioJaCadastradoException(String msg){
		super(msg);
	}
	
	public UsuarioJaCadastradoException(){
		super("Usuario já cadastrado!");
	}
}
