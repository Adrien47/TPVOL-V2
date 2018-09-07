<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="sopra.promo404.vol.model.Passager"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<title>Edition du passager</title>
<meta charset="UTF-8" />
<base href="/vol-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<header class="header">

			<h1>Edition d'un passager</h1>

		</header>

		<section>
			<form action="passager/save" method="post">
				<input type="hidden" name="id" id="id" value="${monPassager.id}"/>
				<input type="hidden" name="version" id="version" value="${monPassager.version}"/>
				
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Nom</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="nom" id="nom"
							placeholder="Le nom" required value="${monPassager.nom}"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Prénom</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="prenom" id="prenom"
							placeholder="Le prénom" required value="${monPassager.prenom}"/>
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Date de naissance</label>
					<div class="col-sm-10">
						<input type="date" step="1" class="form-control" name="dtNaissance"
							id="dtNaissance" placeholder="La date de naissance" value="${monPassager.dtNaissance}"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Rue</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="adresse.rue"
							placeholder="La rue" value="${monPassager.adresse.rue}"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Code postal</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="adresse.codePostal"
							placeholder="Le code postal" value="${monPassager.adresse.codePostal}"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Ville</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="adresse.ville"
							placeholder="La ville" value="${monPassager.adresse.ville}"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Pays</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="adresse.pays"
							placeholder="Le pays" value="${monPassager.adresse.pays}"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Pièce d'identité</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="pieceIdentite" id="pieceIdentite"
							placeholder="La pièce d'identité" required value="${monPassager.pieceIdentite}"/>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Réservation</label>
					<div class="col-sm-10">
						<select class="custom-select" name="reservation.code" required>
							<option value=""></option> 
							<c:forEach items="${reservations}" var="resa">
								<option value="${resa.code}" ${monPassager.reservation.code eq resa.code?'selected':''}>${resa.code}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				
<!-- 				<div class="form-group row"> -->
<!-- 					<label class="col-sm-2 col-form-label">Formateur</label> -->
<!-- 					<div class="col-sm-10"> -->
<!-- 						<select class="custom-select" name="formateur.id" required> -->
<!-- 							<option value=""></option> -->
<%-- 							<c:forEach items="${formateurs}" var="forma"> --%>
<%-- 								<option value="${forma.id}" ${monEleve.formateur.id eq forma.id?'selected':''}>${forma.prenom} ${forma.nom}</option> --%>
<%-- 							</c:forEach> --%>
<!-- 						</select> -->
<!-- 					</div> -->
<!-- 				</div> -->
				
<!-- 				<div class="form-group row"> -->
<!-- 					<label class="col-sm-2 col-form-label">Ordinateur</label> -->
<!-- 					<div class="col-sm-10"> -->
<!-- 						<select class="custom-select" name="ordinateur.code" required> -->
<!-- 							<option value=""></option>  -->
<%-- 							<c:forEach items="${ordinateurs}" var="ordi"> --%>
<%-- 								<option value="${ordi.code}" ${monEleve.ordinateur.code eq ordi.code?'selected':''}>${ordi.code} - ${ordi.ram} (${ordi.ssd?'avec SSD':'sans SSD'})</option> --%>
<%-- 							</c:forEach> --%>
<!-- 						</select> -->
<!-- 					</div> -->
<!-- 				</div> -->

				<div class="form-group row">
					<div class="col-sm-2"></div>
					<div class="col-sm-7">
						<button type="submit" class="btn btn-primary col-sm-12">Envoyer</button>
					</div>
					<div class="col-sm-3">
						<a href="passager/list" class="btn btn-warning col-sm-12">Annuler</a>
					</div>
				</div>
			</form>
		</section>
	</div>

</body>
</html>