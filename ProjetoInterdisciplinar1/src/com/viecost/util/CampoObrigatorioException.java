package com.viecost.util;

public class CampoObrigatorioException extends Exception{

	 public CampoObrigatorioException(String msg){
		 super("O campo " + msg + " é nulo ou invalido");
	 }
	 
	 public CampoObrigatorioException(){
		 super("Campo invalido");
	 }
}
