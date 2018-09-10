<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des aéroports</title>

<meta name="description"
	content="" />
<meta charset="UTF-8" />
<base href="/vol-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

</head>
<body>
<jsp:include page="../nav.jsp"></jsp:include>

<header class="header">
	<h1>Les Aéroports</h1>

		</header>
		<div>
		<section>
			<table id="tableau-aeroports" class="table table-striped">
				<thead>
					<tr>
						<th>Identifiant</th>
						<th>Version</th>
						<th>Code</th>
						
						
					
						<th></th>					</tr>
				</thead>

				<tbody>

					<c:forEach items="${mesAeroports}" var="aeroport">
						<tr>
							<td>${aeroport.id}</td>
							<td>${aeroport.version}</td>
							<td>${aeroport.code}</td>
							
							
							

							<td><a href="aeroport/edit/${aeroport.id}"
								class="btn btn-info btn-sm">Editer</a> <a
								href="aeroport/delete/${aeroport.id}"
								class="btn btn-danger btn-sm">Supprimer</a></td>


						</tr>

					</c:forEach>

				</tbody>
			</table>
			<a href="aeroport/add" class="btn btn-success">Ajouter</a>

		</section>
	</div>


</body>
</html>