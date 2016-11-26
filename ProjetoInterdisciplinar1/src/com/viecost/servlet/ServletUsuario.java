package com.viecost.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viecost.entidades.Usuario;
import com.viecost.fachada.Fachada;
import com.viecost.repositorio.RepositorioUsuario;
import com.viecost.util.CampoObrigatorioException;
import com.viecost.util.UsuarioJaCadastradoException;

@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletUsuario() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeUsuario = request.getParameter("nome");
		String emailUsuario = request.getParameter("email");
		String senhalUsuario = request.getParameter("senha");
		String cidadeUsuario = request.getParameter("cidade");
		String sexoUsuario = request.getParameter("sexo");
		String telefoneUsuario = request.getParameter("telefone");
		
		Usuario usuario = new Usuario();
		//RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
		usuario.setNome(nomeUsuario);
		usuario.setEmail(emailUsuario);
		usuario.setSenha(senhalUsuario);
		usuario.setCidade(cidadeUsuario);
		usuario.setSexo(sexoUsuario);
		usuario.setFone(telefoneUsuario);
		
		Fachada f = Fachada.getInstance();
		try {
			try {
				f.cadastarUsuario(usuario);
			} catch (UsuarioJaCadastradoException e) {
				e.printStackTrace();
			} catch (CampoObrigatorioException e) {
				e.printStackTrace();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//repositorioUsuario.Salvar(usuario);
		PrintWriter saida = response.getWriter();
		saida.print("Salvo com sucesso!");
		RequestDispatcher saida2 = request.getRequestDispatcher("index.jsp");
		saida2.forward(request, response);
	}

}
