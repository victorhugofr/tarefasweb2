package br.ufrn.imd.aulaservlet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.aulaservlet.dominio.Usuario;


@WebServlet("/cadastrar")
public class CadastrarServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		Usuario u = new Usuario();
		u.setNome(login);
		u.setSenha(senha);
		req.getSession().setAttribute("usuario", u);
		resp.sendRedirect("/AulaServlet2019/login.jsp");
	}
}

