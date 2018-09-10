<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>Edition du vol</title>
<meta charset="UTF-8" />
<base href="/vol-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="../nav.jsp"></jsp:include>
	<div class="container">
		<header class="header">

			<h1>Edition du vol</h1>

		</header>

		<section>
			<form action="vol/save" method="post">
				<input type="hidden" name="id" id="id" value="${monVol.id}"/>
				<input type="hidden" name="version" id="version" value="${monVol.version}"/>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Date de Départ</label>
					<div class="col-sm-10">
						<input type="date" step="1" class="form-control" name="dtDepart"
							id="dtDepart" placeholder="La date de départ" value="<fmt:formatDate value="${monVol.dtDepart}" pattern="yyyy-MM-dd" />"/>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Date d'Arrivée</label>
					<div class="col-sm-10">
						<input type="date" step="1" class="form-control" name="dtArrivee"
							id="dtArrivee" placeholder="La date d'arrivée" value="<fmt:formatDate value="${monVol.dtArrivee}" pattern="yyyy-MM-dd" />"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Aeroport de Départ</label>
					<div class="col-sm-10">
						<select class="custom-select" name="depart.id" required>
							<option value=""></option>
							<c:forEach items="${aeroports}" var="dep">
								<option value="${dep.id}" ${monVol.depart.id eq dep.id?'selected':''}>${dep.code}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Aeroport d'Arrivée</label>
					<div class="col-sm-10">
						<select class="custom-select" name="arrivee.id" required>
							<option value=""></option>
							<c:forEach items="${aeroports}" var="arr">
								<option value="${arr.id}" ${monVol.arrivee.id eq arr.id?'selected':''}>${arr.code}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Nombre de Places</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="nbPlace" id="nbPlace"
							placeholder="Le nombre de places" required value="${monVol.nbPlace}"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Statut des réservations</label>
					<div class="col-sm-10">
						<select class="custom-select" name="ouvert" id="ouvert">
							<option value=""></option>
							<option value="TRUE" ${monVol.ouvert eq 'TRUE'?'selected':''}>Ouvertes</option>
							<option value="FALSE" ${monVol.ouvert eq 'FALSE'?'selected':''}>Fermées</option>
						
						</select>
					</div>
				</div>
				
				
				

				<div class="form-group row">
					<div class="col-sm-2"></div>
					<div class="col-sm-7">
						<button type="submit" class="btn btn-primary col-sm-12">Envoyer</button>
					</div>
					<div class="col-sm-3">
						<a href="vol/list" class="btn btn-warning col-sm-12">Annuler</a>
					</div>
				</div>
			</form>
		</section>
	</div>

</body>
</html>