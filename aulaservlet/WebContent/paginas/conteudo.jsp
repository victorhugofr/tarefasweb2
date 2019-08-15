<%@page import="br.ufrn.imd.aulaservlet.dominio.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bem-vindo</title>
</head>
<body>
<p>
 Eai condenado <b> <%= ((Usuario) 
			session.getAttribute("usuario")).getNome() %> </b>
</p> 

<form action = "sair" method="POST">
<input type ="submit" value="Sair">
</form>
</body>
</html>