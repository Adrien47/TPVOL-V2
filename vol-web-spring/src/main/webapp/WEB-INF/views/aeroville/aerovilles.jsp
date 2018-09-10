<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Liste des aerovilles</title>
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

			<h1>Les aerovilles</h1>

		</header>

		<section>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Identifiant</th>
						<th>Version</th>
						<th>Ville</th>
						<th>Aeroport</th>
						
						<th></th>
					</tr>
				</thead>

				<tbody>
				
					<c:forEach items="${aerovilles}" var="aeroville">
						<tr>
							<td>${aeroville.id}</td>
							<td>${aeroville.version}</td>
							<td>${aeroville.ville.nom}</td>
							<td>${aeroville.aeroport.code}</td>
							<td><a href="aeroville/delete/${aeroville.id}" class="btn btn-danger btn-sm">Supprimer</a></td>
						</tr>
					
					</c:forEach>
				

				</tbody>
			</table>
			<a href="aeroville/add" class="btn btn-success">Ajouter</a>
		</section>
	</div>

</body>
</html>