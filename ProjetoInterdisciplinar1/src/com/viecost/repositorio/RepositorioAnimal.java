package com.viecost.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.viecost.entidades.Animal;
import com.viecost.util.Conexao;

public class RepositorioAnimal { //implements IRepositorioAnimal{

	Connection con = Conexao.getConnection();
	
	public void Salvar(Animal animal){
		if (animal.getId() != null && animal.getId() != 0) {
			atualizarAnimal(animal);
		} else {
			cadastrarAnimal(animal);
		}
	}

	public void cadastrarAnimal(Animal animal) {
		String sql = "INSERT INTO animal (nome, raca, idade, sexo, pelagem, porte, especificacao, imagem) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, animal.getNome());
			ps.setString(2, animal.getRaca());
			ps.setInt(3, animal.getIdade());
			ps.setString(4, animal.getSexo());
			ps.setString(5, animal.getPelagem());
			ps.setString(6, animal.getPorte());
			ps.setString(7, animal.getEspecificacao());
			ps.setString(8, animal.getImagem());
			ps.execute();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizarAnimal(Animal animal) {
		String sql = "UPDATE animal SET nome=?, raca=?, idade= ?, sexo=?, pelagem=?, porte=?, especificacao=?, imagem=? WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, animal.getNome());
			ps.setString(2, animal.getRaca());
			ps.setInt(3, animal.getIdade());
			ps.setString(4, animal.getSexo());
			ps.setString(5, animal.getPelagem());
			ps.setString(6, animal.getPorte());
			ps.setString(7, animal.getEspecificacao());
			ps.setString(8, animal.getImagem());
			ps.setInt(8, animal.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void removerAnimal(Animal animal) {
		String sql = "DELETE FROM animal WHERE id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, animal.getId());

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Animal procurarAnimal(int id) {
		String sql = "SELECT * FROM animal WHERE id=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		Animal animal = null;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();
			if (rs.next()) {
				animal = new Animal();

				animal.setId(rs.getInt("id"));
				animal.setNome(rs.getString("nome"));
				animal.setRaca(rs.getString("raca"));
				animal.setIdade(rs.getInt("idade"));
				animal.setSexo(rs.getString("sexo"));
				animal.setPelagem(rs.getString("pelagem"));
				animal.setPorte(rs.getString("porte"));
				animal.setEspecificacao(rs.getString("especificacao"));
				animal.setImagem(rs.getString("imagem"));
			}
			ps.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Erro ao executar consulta! " + e.getMessage());
		}
		return animal;
	}

	public List<Animal> listarAnimal() {
		List<Animal> listaAnimal = new ArrayList<Animal>();
		String sql = "SELECT * FROM animal";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Animal animal = new Animal();

				animal.setId(rs.getInt("id"));
				animal.setNome(rs.getString("nome"));
				animal.setRaca(rs.getString("raca"));
				animal.setIdade(rs.getInt("idade"));
				animal.setSexo(rs.getString("sexo"));
				animal.setPelagem(rs.getString("pelagem"));
				animal.setPorte(rs.getString("porte"));
				animal.setEspecificacao(rs.getString("especificacao"));
				animal.setImagem(rs.getString("imagem"));

				listaAnimal.add(animal);
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaAnimal;
	}
}// fim da classe

