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
	<div align="center">
		<h2>New Digimon</h2>
		<form:form action="save" method="post" modelAttribute="digimon">
			<table border="0" cellpadding="5">
				<tr>
					<td>Name: </td>
					<td><form:input path="name"/></td>
				</tr>
				<tr>
					<td>Attacco: </td>
					<td><form:input path="attacco" /></td>
				</tr>
				<tr>
					<td>Difesa: </td>
					<td><form:input path="difesa" /></td>
				</tr>	
					<tr>
					<td>Resistenza: </td>
					<td><form:input path="resistenza" /></td>
				</tr>
					<tr>
					<td>Evoluzione: </td>
					<td><form:input path="evoluzione" /></td>
				</tr>	
	
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>						
			</table>
		</form:form>
	</div>

</body>
</html>