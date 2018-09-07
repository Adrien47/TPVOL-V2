<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Liste des passagers</title>
<meta charset="UTF-8" />
<base href="/vol-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container-fluid">
		<header class="header">

			<h1>Les passagers</h1>

		</header>

		<section>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Identifiant</th>
						<th>Version</th>
						<th>Nom</th>
						<th>Prénom</th>
						<th>Date de naissance</th>
						<th>Rue</th>
						<th>Code postal</th>
						<th>Ville</th>
						<th>Pays</th>
						<th>Pièce d'identité</th>
						<th>Réservation</th>
<!-- 						<th>Formateur</th> -->
<!-- 						<th>Ordinateur</th> -->
						<th></th>
					</tr>
				</thead>

				<tbody>
				
					<c:forEach items="${passagers}" var="passager">
						<tr>
							<td>${passager.id}</td>
							<td>${passager.version}</td>
							<td>${passager.nom}</td>
							<td>${passager.prenom}</td>
							<td><fmt:formatDate value="${passager.dtNaissance}" pattern="dd/MM/yyyy" />
							<td>${passager.adresse.rue}</td>
							<td>${passager.adresse.codePostal}</td>
							<td>${passager.adresse.ville}</td>
							<td>${passager.adresse.pays}</td>
							<td>${passager.pieceIdentite}</td>
							<td>${passager.reservation.code}</td>
<%-- 							<td>${eleve.formateur.nom}</td> --%>
<%-- 							<td>${eleve.ordinateur.code} (${eleve.ordinateur.ram})</td> --%>
							<td><a href="passager/edit/${passager.id}" class="btn btn-info btn-sm">Editer</a>
								<a href="passager/delete/${passager.id}" class="btn btn-danger btn-sm">Supprimer</a></td>
						</tr>
					
					</c:forEach>
				

				</tbody>
			</table>
			<a href="passager/add" class="btn btn-success">Ajouter</a>
		</section>
	</div>

</body>
</html>