<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Liste des matières</title>
<meta name="description"
	content="Dépensez ici votre argent en toute impunité." />
<meta charset="UTF-8" />
<base href="/formation-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<header class="header">

			<h1>Les matières</h1>

		</header>

		<section>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Identifiant</th>
						<th>Version</th>
						<th>Nom</th>
						<th>Durée</th>
						<th>Difficulté</th>
						<th></th>
					</tr>
				</thead>

				<tbody>
				
					<c:forEach items="${mesMatieres}" var="mat">
						<tr>
						<td>${mat.id}</td>
						<td>${mat.version}</td>
						<td>${mat.nom}</td>
						<td>${mat.duree}</td>
						<td>${mat.difficulte}</td>
						<td><a href="matiere/edit/${mat.id}" class="btn btn-info btn-sm">Editer</a>
							<a href="matiere/delete/${mat.id}" class="btn btn-danger btn-sm">Supprimer</a></td>
					</tr>
					
					</c:forEach>
				

				</tbody>
			</table>
			<a href="matiere/add" class="btn btn-success">Ajouter</a>
		</section>
	</div>

</body>
</html>