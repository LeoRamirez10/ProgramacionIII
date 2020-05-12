<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% 
HttpSession seccion = (HttpSession) request.getSession();
String usuariovariabledeseccion = (String)seccion.getAttribute("Usuario");

if(usuariovariabledeseccion==null){
	
	response.sendRedirect("index.jsp");
}

%>

<body>
<form action="ServeletUser" method="post">
<input type="submit" value="CERRAR" name="btnCerrar">
</form>

<a href="historialUsuarios.jsp">Ver Historial Usuarios</a>
<h1>Hola desde Principal</h1>
</body>
</html>