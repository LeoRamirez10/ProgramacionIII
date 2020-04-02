<html>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<body>
<h2>AGREGAR DATOS</h2>

<table align="center">
	<thead>
		
	</thead>
  <tbody>
   <tr>
	<td>
		<form action="ServeleteControler" method="post">
	<p>id</p><input type="text" name="Id">	 
	<p>Nombre producto</p><input type="text" name="Nproductos">
	<p>Precio producto</p><input type="text" name="Pproductos">		
	<p>Cantidad de producto</p><input type="text" name="Cproductos">		
	<p>Total de producto</p><input type="text" name="Tproductos">		
	<br>
	<br>
	<input type="submit" name="btn" value="Envio de datos" class="btn btn-info">
	<input type="submit" name="btn" value="Actualizacion de datos" class="btn btn-info">
	<input type="submit" name="btn" value="Eliminacion de datos" class="btn btn-info">
	


		</form>
	</td>	
   </tr>	
  </tbody>
</table>





</body>
</html>