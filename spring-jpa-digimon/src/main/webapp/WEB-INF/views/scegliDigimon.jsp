<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="left">
		<h2>Aggiungi digimon</h2>
		
			<table border="1" cellpadding="5">
			<tr>
				<!-- <th>ID</th> -->
				<th>Nome</th>
				<th>Attacco</th>
				<th>Difesa</th>
				<th>Evoluzione</th>
				<th>Resistenza</th>
				<th>Scegli Digimon</th>
			</tr>
			<c:forEach items="${listaDigimon}" var="digimon">
		<tr>
			<td>${digimon.name}</td>
			<td>${digimon.attacco}</td>
			<td>${digimon.difesa}</td>
			<td>${digimon.evoluzione}</td>
			<td>${digimon.resistenza}</td>
			<td><a href="aggiungi?id=${digimon.id}&idAllenatore=${idAllenatore}">Aggiungi</a></td>
			
		</tr>
		</c:forEach>
     
			</table>
			
	</div>


</body>
</html>