<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Trillow</title>
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (necesario para los plugins Javascript de Bootstrap) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- Incluir todos los plugins compilados (abajo), o incluir archivos individuales
según sea necesario -->
<script src="js/bootstrap.min.js"></script>
<title>Trillow</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li><a href="./index.jsp">Inicio</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="./registrarse.jsp">Registrarse</a></li>
    </ul>
  </div>
</nav>
<h1>Iniciar Sesion</h1>
<div class="row">
    <div class="col-sm-5"></div>
    <div class="col-sm-4">
    <form action="" method="POST" >

        <label>Usuario:</label>
        <div class="form-group">
            <input name="user" pattern="[a-zA-Z]{4,15}$" placeholder="Ingrese el usuario" data-error="Ingresar usuario valido."
        type="text" required> 
        </div>
        <label>Contraseña:</label>
        <div class="form-group">
            <input name="pass" placeholder="Ingrese la contraseña" pattern="[a-z0-9A-Z]{6,12}$" data-error="Ingresar contraseña valida." type="password" required>
        </div>
        <input name="submit" type="submit" value="Aceptar"><br>
    </form>
    </div>
</div>
</body>
</html>