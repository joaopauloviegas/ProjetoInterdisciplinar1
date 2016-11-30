package com.viecost.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viecost.entidades.Animal;
import com.viecost.fachada.Fachada;
import com.viecost.repositorio.RepositorioAnimal;
import com.viecost.util.CampoObrigatorioException;
import com.viecost.util.UsuarioJaCadastradoException;

@WebServlet("/ServletAnimal")
public class ServletAnimal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletAnimal() {
        super();
       
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");
		RepositorioAnimal repositorioAnimal = new RepositorioAnimal();
		
		if ((acao != null) && (acao.equals("cadastrar"))) {
			Animal animal = new Animal();
			animal.setId(0);
			animal.setNome("");
			animal.setRaca("");
			animal.setIdade(0);
			animal.setSexo("");
			animal.setPelagem("");
			animal.setPorte("");
			animal.setEspecificacao("");
			
			request.setAttribute("animal", animal);
			RequestDispatcher saida = request.getRequestDispatcher("PerfilUsuario.jsp");
			saida.forward(request, response);
		} else if ((acao != null) && (acao.equals("alterar"))){
			String id = request.getParameter("id");
			Animal animal = repositorioAnimal.procurarAnimal(Integer.parseInt(id));
			request.setAttribute("animal", animal);
			RequestDispatcher saida = request.getRequestDispatcher("PerfilUsuario.jsp");
			saida.forward(request, response);
		} else if ((acao != null) && (acao.equals("listar"))){
			List<Animal> lista = repositorioAnimal.listarAnimal();
			request.setAttribute("lista", lista);
			RequestDispatcher saida = request.getRequestDispatcher("animal.jsp");
			saida.forward(request, response);
		} else if ((acao != null) && (acao.equals("excluir"))){
			String id = request.getParameter("id");
			Animal animal = new Animal();
			animal.setId(Integer.parseInt(id));
			repositorioAnimal.removerAnimal(animal);
			response.sendRedirect("usuarioControle?acao=listar");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nomeAnimal = request.getParameter("nome");
		String racaAnimal = request.getParameter("raca");
		String idadeAnimal = request.getParameter("idade");
		String sexoAnimal = request.getParameter("sexo");
		String pelagemAnimal = request.getParameter("pelagem");
		String porteAnimal = request.getParameter("porte");
		String especificacaoAnimal = request.getParameter("especificacao");
		//String imagemAnimal = request.getParameter("imagem");
		
		Animal animal = new Animal();
		animal.setNome(nomeAnimal);
		animal.setRaca(racaAnimal);
		animal.setIdade(Integer.parseInt(idadeAnimal));
		animal.setSexo(sexoAnimal);
		animal.setPelagem(pelagemAnimal);
		animal.setPorte(porteAnimal);
		animal.setEspecificacao(especificacaoAnimal);
		//animal.setImagem(imagemAnimal);
		
		//Fachada f = Fachada.getInstance();
		RepositorioAnimal r = new RepositorioAnimal();
		try {
			r.cadastrarAnimal(animal);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		PrintWriter saida = response.getWriter();
		saida.print("Salvo com sucesso!");
		RequestDispatcher saida2 = request.getRequestDispatcher("PerfilUsuario.jsp");
		saida2.forward(request, response);
	}


}
