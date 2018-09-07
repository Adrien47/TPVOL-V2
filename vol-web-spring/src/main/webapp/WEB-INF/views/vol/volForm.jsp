<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="sopra.promo404.vol.model.Vol"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<title>Edition du vol</title>
<meta charset="UTF-8" />
<base href="/formation-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<header class="header">

			<h1>Edition du vol</h1>

		</header>

		<section>
			<form action="eleve/save" method="post">
				<input type="hidden" name="id" id="id" value="${monVol.id}"/>
				<input type="hidden" name="version" id="version" value="${monVol.version}"/>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Date de Départ</label>
					<div class="col-sm-10">
						<input type="date" step="1" class="form-control" name="dtDepart"
							id="dtDepart" placeholder="La date de départ" value="${monVol.dtDepart}"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Date d'Arrivée</label>
					<div class="col-sm-10">
						<input type="date" step="1" class="form-control" name="dtArrivee"
							id="dtArrivee" placeholder="La date d'arrivée" value="${monVol.dtArrivee}"/>
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
					<label class="col-sm-2 col-form-label">Status : Ouvert ?</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="ouvert" id="ouvert"
							placeholder="TRUE ou FALSE" required value="${monVol.ouvert}"/>
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
					<div class="col-sm-2"></div>
					<div class="col-sm-7">
						<button type="submit" class="btn btn-primary col-sm-12">Envoyer</button>
					</div>
					<div class="col-sm-3">
						<a href="eleve/list" class="btn btn-warning col-sm-12">Annuler</a>
					</div>
				</div>
			</form>
		</section>
	</div>

</body>
</html>