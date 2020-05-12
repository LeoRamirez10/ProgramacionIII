<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script type="http://code.jquery.com/jquery-latest.js">
</script>
 <script src="http://code.jquery.com/jquery-latest.js"> </script>
  <script type="text/javascript">
     $(document).ready(function(){
       
          $.post('ServeletHistorialUsuario',{
          }, function(response){
          let datos = JSON.parse(response);
          //console.log(datos);
          var tabladatos = document.getElementById('tablaDatos');
           for(let item of datos){
            tabladatos.innerHTML += ` 
             
            `
           }
         
         });
     
     });

		
		
		
</script>
<body>

					<table class="table table-dark" id="tablaDatos">
						<thead>  
								<th>ID</th>
								<th>NOMBRE</th>
								<th>PRECIO</th>
								<th>CANTIDAD</th>
								<th>TOTAL</th>
								<th>OPCIONES</th>
								
						</thead>
							

					</table>


</body>
</html>