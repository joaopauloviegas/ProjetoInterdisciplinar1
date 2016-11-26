package com.viecost.repositorio;

import java.util.ArrayList;

import com.viecost.entidades.Animal;


public interface IRepositorioAnimal {

	public void cadastrarAnimal(Animal animal);
	public void atualizarAnimal(Animal animal);
	public boolean removerAnimal(int id);
	public Animal procurarAnimal(int id);
	public ArrayList<Animal> listarAnimal();
}
