<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des reservations</title>

<meta name="description"
	content="" />
<meta charset="UTF-8" />
<base href="/vol-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

</head>
<body>
<header class="header">
	<h1>Les Reservations</h1>

		</header>
		<div>
		<section>
			<table id="tableau-reservations" class="table table-striped">
				<thead>
					<tr>
						<th>Identifiant</th>
						<th>Version</th>
						<th>Code</th>
						<th>Date de Réservation</th>
						<th>Confirmée</th>
						<th>Annulée</th>
						
					
						<th></th>					</tr>
				</thead>

				<tbody>

					<c:forEach items="${mesReservations}" var="reservation">
						<tr>
							<td>${reservation.id}</td>
							<td>${reservation.version}</td>
							<td>${reservation.code}</td>
							<td><fmt:formatDate value="${reservation.dtResa}"
									pattern="dd/MM/yyyy" /></td>
							<td>${reservation.confirmee}</td>
							<td>${reservation.annulee}</td>
							
							

							<td><a href="reservation?action=edit&id=${reservation.id}"
								class="btn btn-info btn-sm">Editer</a> <a
								href="reservation?action=delete&id=${reservation.id}"
								class="btn btn-danger btn-sm">Supprimer</a></td>


						</tr>

					</c:forEach>

				</tbody>
			</table>
			<a href="reservation/add" class="btn btn-success">Ajouter</a>

		</section>
	</div>


</body>
</html>