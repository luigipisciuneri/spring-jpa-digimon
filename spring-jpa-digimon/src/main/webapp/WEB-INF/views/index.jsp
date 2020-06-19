<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestione Digimonr</title>
</head>
<body>
<div align="center">
	<h2>Gestione Digimon</h2>
	<h3><a href="new">Inserisci Digimon</a></h3>
	<table border="1" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Attacco</th>
			<th>Difesa</th>
			<th>resistenza</th>
			<th>evoluzione</th>
			<th>Allenatore</th>
		</tr>
		<c:forEach items="${listDigimon}" var="digimon">
		<tr>
			<td>${digimon.id}</td>
			<td>${digimon.name}</td>
			<td>${digimon.attacco}</td>
			<td>${digimon.difesa }</td>
			<td>${digimon.resistenza }</td>
			<td>${digimon.evoluzione }</td>
			<td>${digimon.allenatore } <td>
			<td>
				<a href="edit?id=${digimon.id}">Edit</a>
				&nbsp;&nbsp;&nbsp;
				<a href="delete?id=${digimon.id}">Delete</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	
	<br><br>
	
</div>	
<br><br>
<div align="center">
	<h2>Gestione Allenatori</h2>
	<h3><a href="newAllenatore">Inserisci Allenatori</a></h3>
	<table border="1" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>nomeAllenatore</th>
			<th>nomeDigimon</th>
		</tr>
		<c:forEach items="${listallenatori}" var="allenatori">
		<tr>
			<td>${allenatori.id}</td>
			<td>${allenatori.nomeAllenatore}</td>
			<td>${allenatori.nomeDigimon}</td>
			
			<td>
				<a href="edit?id=${allenatori.id}">Edit</a>
				&nbsp;&nbsp;&nbsp;
				<a href="delete?id=${allenatori.id}">Delete</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	
	
	
</div>	

</body>
</html>