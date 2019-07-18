<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
	<h2>Hola mundo</h2>
	<form action="persona" method="get">
		<label>Ingrese su nombre</label> 
		<input type="text" name="nombre">
		<input type="submit" />
	</form>
	<label>Atributos de la session:</label>
	<br>
	<c:out value="${mensaje}" />
	<br>
	<br>
	<label>Atributos del modelo</label>
	<br>
	<c:out value="${modelo}" />
	<br />
	<a href="persona">A persona</a>
</body>
</html>