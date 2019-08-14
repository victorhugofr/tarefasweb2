package br.ufrn.imd.aulaservlet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.aulaservlet.dominio.Usuario;

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		if(login.equals("victor") && senha.equals("victor")) {
			Usuario u = new Usuario();
			u.setNome("victor");
			req.getSession().setAttribute("usuario", u);
			resp.sendRedirect("/aulaservlet-1/paginas"+"/conteudo.jsp");
		}else {
			resp.sendRedirect("/aulaservlet-1/login.jsp");
		}
	}
}
