package com.viecost.controladores;

import java.util.List;

import com.viecost.entidades.Animal;
import com.viecost.repositorio.RepositorioAnimal;


public class ControladorAnimal {

private RepositorioAnimal repositorioAnimal;
	
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
	public void removerAnimal(Animal animal){
		this.repositorioAnimal.removerAnimal(animal);
	}
	
	//METODO PROCURAR 
	public Animal procurarAnimal(int id){
		return this.repositorioAnimal.procurarAnimal(id);
	}
	
	//METODO LISTAR
	public List<Animal> listarAnimal(){
		return this.repositorioAnimal.listarAnimal();
	}
}// fim da classe
