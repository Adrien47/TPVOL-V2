<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Liste des villes</title>
<meta charset="UTF-8" />
<base href="/vol-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="../nav.jsp"></jsp:include>
	<div class="container-fluid">
		<header class="header">

			<h1>Les villes</h1>

		</header>

		<section>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Identifiant</th>
						<th>Version</th>
						<th>Nom</th>
						<th>Code Postal</th>
						<th>Aeroports</th>
						<th></th>
					</tr>
				</thead>

				<tbody>
				
					<c:forEach items="${villes}" var="ville">
						<tr>
							<td>${ville.id}</td>
							<td>${ville.version}</td>
							<td>${ville.nom}</td>
							<td>${ville.codePostal}</td>
							<td>BOUTON</td>
							<td><a href="ville/edit/${ville.id}" class="btn btn-info btn-sm">Editer</a>
								<a href="ville/delete/${ville.id}" class="btn btn-danger btn-sm">Supprimer</a></td>
						</tr>
					
					</c:forEach>
				

				</tbody>
			</table>
			<a href="ville/add" class="btn btn-success">Ajouter</a>
		</section>
	</div>

</body>
</html>