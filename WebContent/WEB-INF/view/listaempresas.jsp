<%@page import="br.com.magna.gerenciador.models.Empresa"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar empresas</title>
</head>
<body>
Usuario logado: ${usuarioLogado.usuario}
<br>
<a href="/gerenciador/entrada?acao=Logout">Logout</a>
<h1>Lista das empresas</h1>
<br><br><br>

<ul>
	<c:forEach items="${empresas}" var="empresa">
		  <li>${empresa.nome} - ${empresa.cnpj}
		  <a href="/gerenciador/entrada?id=${empresa.id}&acao=RemoveEmpresa">remover</a>
		  <a href="/gerenciador/entrada?id=${empresa.id}&acao=MostraEmpresa">editar</a>
		  </li>
	</c:forEach>

</ul>
</body>
</html>