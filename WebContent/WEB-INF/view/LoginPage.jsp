<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkentradaservlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkentradaservlet}" method="post">
		<p>User: <input type="text" name="user"></p>
		<!-- <p>Endereço: <input type="text" name="endereco"></p> -->
		<p>Password: <input type="password" name="password"></p>
		<input type="hidden" name="acao" value="AutenticaUsuario">
		
		<input type="submit">
	</form>
</body>
</html>