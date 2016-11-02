package com.viecost.fachada;

public class Fachada {
	
	public static Fachada instance;
	// aqui em baixo cria os controladores
	
	public Fachada(){
		//instancia dos controladores 
	}
	
    public static Fachada getInstance(){
    	if(Fachada.instance == null){
    		Fachada.instance = new Fachada();
    	}
    	return Fachada.instance;
    }

}// fim da classe fachada
