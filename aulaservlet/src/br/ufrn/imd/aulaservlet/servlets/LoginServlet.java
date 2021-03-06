package br.ufrn.imd.aulaservlet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.aulaservlet.dominio.Usuario;

@WebServlet("/logar")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		Usuario u = (Usuario)req.getSession().getAttribute("usuario");
		if(login.equals(u.getNome()) && senha.equals(u.getSenha()) ){
			resp.sendRedirect("/AulaServlet2019/paginas"+"/conteudo.jsp");
		}else {
			resp.sendRedirect("/AulaServlet2019/login.jsp");
		}
	}
}
