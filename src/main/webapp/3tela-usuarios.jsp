<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%@ page import="Model.JavaBeans"%>
<%@ page import = "Model.DAO"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<%
@ SuppressWarnings ("unchecked")
ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("contatos");

%>


<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>eita</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
  <link rel="stylesheet" href="Tela-login.css">
  </head>
</head>
<body>


<table class="table">
		<thead>
			<tr>
				<th>Id</th>
				<th>Email</th>
				<th>Senha</th>

			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>

				<td><%=lista.get(i).getIdcon()%></td>
				<td><%=lista.get(i).getEmail()%></td>
				<td><%=lista.get(i).getSenha()%></td>
				<td>
					<a href="select?idcon=<%=lista.get(i).getIdcon()%>"
					class="Botao1">Editar</a>
					<a href="javascript: confirmar(<%=lista.get(i).getIdcon()%>)"
					class="Botao2">Excluir</a>
				</td>
			</tr>
			<%
				}
			%>
</tbody>
	</table>
</body>
</html>