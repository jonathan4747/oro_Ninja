<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ninja Gold Game</title>
		<link rel="stylesheet" href="/css/index.css"/>
	</head>
<body>
	<div class="oro">
		<h3>your Gold: </h3>
		<div class="cantidad">
			<c:out value="${numero1}"/><!--<c:out value="${numero2}"/><c:out value="${numero3}"/><c:out value="${numero4}"/>--> 
		</div>
	</div>
	<div class= "opciones">
		<div>
			<h2>Farm</h2>
			<form method="POST" action="/gold/1">
				<div>
					<label for="numero1">
						(earn 10-20gold)
					</label>
					 <input type="hidden" id="numero1" name="numero1" >
				</div>
				<div class="boton">
					<button type="submit">
						<strong>Find Gold!</strong> 
					</button>
				</div>			
			</form>
		</div>
		<div>
			<h2>Cave</h2>
			<form method="POST" action="/gold/2">
				<div>
					<label for="numero2">
						(earn 5-10gold)
					</label>
					<input type="hidden" id="numero2" name="numero2"  >
				</div>
				<div class="boton">
					<button type="submit">
						<strong>Find Gold!</strong> 
					</button>
				</div>			
			</form>
		</div>
		<div>
			<h2>House</h2>
			<form method="POST" action="/gold/3">
				<div>
					<label for="numero3">
						(earn 2-5gold)
					</label>
					<input type="hidden" id="numero3" name="numero3" >
				</div>
				<div class="boton">
					<button type="submit">
						<strong>Find Gold!</strong> 
					</button>
				</div>			
			</form>
		</div>
		<div>
			<h2>Casino!</h2>
			<form method="POST" action="/gold/4">
				<div>
					<label for="numero4">
						(earn 0-50gold)
					</label>
					<input type="hidden" id="numero4" name="numero4" >
				</div>
				<div class="boton">
					<button type="submit">
						<strong>Find Gold!</strong> 
					</button>
				</div>			
			</form>
		</div>
	</div>
	<div>
		<h1>Activities!</h1>
		<div class="anuncio">
			<div class="gana">
				<c:out value="${anuncio1}"/>
			</div>
			<div class="gana">
				<c:out value="${anuncio2}"/>
			</div>
			<div class="gana">
				<c:out value="${anuncio3}"/>
			</div>
			<div class="gana">
				<c:out value="${anuncio4}"/>
			</div>
			<div class="pierde">
				<c:out value="${anuncio5}"/>
			</div>
		</div>
	</div>
</body>
</html>