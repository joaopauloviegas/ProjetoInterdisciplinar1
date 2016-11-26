package com.viecost.controladores;

import java.util.ArrayList;

import com.viecost.entidades.Animal;
import com.viecost.repositorio.IRepositorioAnimal;
import com.viecost.repositorio.RepositorioAnimal;


public class ControladorAnimal {

	private IRepositorioAnimal repositorioAnimal;
	
	//CONTROLADOR
	public ControladorAnimal(){
		this.repositorioAnimal = new RepositorioAnimal();
	}
	
	//METODO CADASTRAR Animal
	public void cadastrarAnimal(Animal animal){
		this.repositorioAnimal.cadastrarAnimal(animal);
	}
	
	//METODO ATUALIZAR
	public void atualizarAnimal(Animal Animal){
		this.repositorioAnimal.atualizarAnimal(Animal);
	}
	
	//METODO REMOVER 
	public boolean removerAnimal(int id){
		return this.repositorioAnimal.removerAnimal(id);
	}
	
	//METODO PROCURAR 
	public Animal procurarAnimal(int id){
		return this.repositorioAnimal.procurarAnimal(id);
	}
	
	//METODO LISTAR
	public ArrayList<Animal> listarAnimal(){
		return this.repositorioAnimal.listarAnimal();
	}
}// fim da classe
