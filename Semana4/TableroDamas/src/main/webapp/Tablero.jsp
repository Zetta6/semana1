<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tablero de Damas</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
    <h1>Tablero de Damas</h1>
      <%
      String color = "white";
      String imagen = "red";
      
      String filaTab = request.getParameter("fila");
      int fila = Integer.parseInt(filaTab);
      
      String columnaTab = request.getParameter("columna");
      int columna = Integer.parseInt(columnaTab);
      
      for (int i = 0; i < fila; i++) {
    	  if ((i % 2) == 0) {
        	  out.print("<div class='cuadrado-2'></div>");
    	  } else {
    		  out.print("<div class='cuadrado-3'></div>");
    	  }
        for (int e = 0; e < columna-1; e++) {
          
          // Determina el color de la casilla
          if (((i % 2) + (e % 2)) % 2 == 0) {
        	  out.print("<div class= 'cuadrado-3'></div>");
          } else {
        	  out.print("<div class= 'cuadrado-2'></div>");
          }
          
        }
        out.print("<br>");
      }
      %>
  </body>
</html>