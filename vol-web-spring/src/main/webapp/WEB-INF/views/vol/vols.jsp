<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Liste des vols</title>
<meta name="description"
	content="Dépensez ici votre argent en toute impunité." />
<meta charset="UTF-8" />
<base href="/vol-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container-fluid">
		<header class="header">

			<h1>Les vols</h1>

		</header>

		<section>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Identifiant</th>
						<th>Version</th>
						<th>Date de départ</th>
						<th>Date d'arrivée</th>
						<th>Nombre de places</th>
						<th>Status : Ouvert ?</th>
						<th>Aeroport de départ</th>
						<th>Aeroport d'arrivée</th>
						<th></th>
					</tr>
				</thead>

				<tbody>
				
					<c:forEach items="${vols}" var="vol">
						<tr>
							<td>${vol.id}</td>
							<td>${vol.version}</td>
							<td><fmt:formatDate value="${vol.dtDepart}" pattern="dd/MM/yyyy" />
							<td><fmt:formatDate value="${vol.dtArrivee}" pattern="dd/MM/yyyy" />
							<td>${vol.nbPlace}</td>
							<td>${vol.ouvert}</td>
							<td>${vol.depart.code}</td>
							<td>${vol.arrivee.code}</td>
							<td><a href="vol/edit/${vol.id}" class="btn btn-info btn-sm">Editer</a>
								<a href="vol/delete/${vol.id}" class="btn btn-danger btn-sm">Supprimer</a></td>
						</tr>
					
					</c:forEach>
				

				</tbody>
			</table>
			<a href="vol/add" class="btn btn-success">Ajouter</a>
		</section>
	</div>

</body>
</html>