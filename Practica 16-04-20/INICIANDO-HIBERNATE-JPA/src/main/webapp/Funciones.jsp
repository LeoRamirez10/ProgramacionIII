<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String idBus = request.getParameter("idBus");
String nombrePr = request.getParameter("Npr");
String cantidadPr = request.getParameter("CantidadPr");
String precioPr = request.getParameter("PrecioPr");
String totalPr = request.getParameter("TotalPr");

if(idBus==null){
	
	idBus="";
	nombrePr="";
	cantidadPr="";
	precioPr="";
	totalPr="";
	
}

%>
<body>


<form action="ServeleteControler">
<table align="center">
	<thead>
		
	</thead>
  <tbody>
   <tr>
	<td>
		
	<p>Id</p><input type="text" name="Id" id="idcarga" value="<%=idBus%>">	 
	<p>Nombre producto</p><input type="text" name="Nproductos" id="Npro" value="<%=nombrePr%>">
	<p>Precio producto</p><input type="text" name="Pproductos" id="PPro" value="<%=precioPr%>">		
	<p>Cantidad de producto</p><input type="text" name="Cproductos" id="Cpro" value="<%=cantidadPr%>">		
	<p>Total de producto</p><input type="text" name="Tproductos" id="TPro" value="<%=totalPr%>">		
	<br>
	<br>

	</td>	
   </tr>	
  </tbody>
  
</table>

<input type="submit" class="btn btn-info" value="Guardar" name="btn">
<input type="submit" class="btn btn-info" value="Actualizar" name="btn">

</form>
</body>
</html>