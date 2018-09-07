<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Liste des élèves</title>
<meta name="description"
	content="Dépensez ici votre argent en toute impunité." />
<meta charset="UTF-8" />
<base href="/formation-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container-fluid">
		<header class="header">

			<h1>Les élèves</h1>

		</header>

		<section>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Identifiant</th>
						<th>Version</th>
						<th>Civilité</th>
						<th>Nom</th>
						<th>Prénom</th>
						<th>Date de naissance</th>
						<th>Rue</th>
						<th>Code postal</th>
						<th>Ville</th>
						<th>Pays</th>
<!-- 						<th>Formateur</th> -->
<!-- 						<th>Ordinateur</th> -->
						<th></th>
					</tr>
				</thead>

				<tbody>
				
					<c:forEach items="${eleves}" var="eleve">
						<tr>
							<td>${eleve.id}</td>
							<td>${eleve.version}</td>
							<td>${eleve.civilite}</td>
							<td>${eleve.nom}</td>
							<td>${eleve.prenom}</td>
							<td><fmt:formatDate value="${eleve.dtNaissance}" pattern="dd/MM/yyyy" />
							<td>${eleve.adresse.rue}</td>
							<td>${eleve.adresse.codePostal}</td>
							<td>${eleve.adresse.ville}</td>
							<td>${eleve.adresse.pays}</td>
<%-- 							<td>${eleve.formateur.nom}</td> --%>
<%-- 							<td>${eleve.ordinateur.code} (${eleve.ordinateur.ram})</td> --%>
							<td><a href="eleve/edit/${eleve.id}" class="btn btn-info btn-sm">Editer</a>
								<a href="eleve/delete/${eleve.id}" class="btn btn-danger btn-sm">Supprimer</a></td>
						</tr>
					
					</c:forEach>
				

				</tbody>
			</table>
			<a href="eleve/add" class="btn btn-success">Ajouter</a>
		</section>
	</div>

</body>
</html>