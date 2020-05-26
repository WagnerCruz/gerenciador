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
	<p>Nome: <input type="text" name="nome"></p>
	<!-- <p>Endereço: <input type="text" name="endereco"></p> -->
	<p>CNPJ: <input type="text" name="cnpj"></p>
	<p><input type="hidden" name="acao" value="NovaEmpresa"></p>
	
	<input type="submit">
</form>
</body>
</html>