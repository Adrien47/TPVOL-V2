<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="sopra.promo404.vol.model.Passager"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<title>Edition de la ville</title>
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

			<h1>Edition d'une ville</h1>

		</header>

		<section>
			<form action="ville/save" method="post">
				<input type="hidden" name="id" id="id" value="${maVille.id}"/>
				<input type="hidden" name="version" id="version" value="${maVille.version}"/>
				
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Nom</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="nom" id="nom"
							placeholder="Le nom" required value="${maVille.nom}"/>
					</div>
				</div>
				
				
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Code postal</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="codePostal"
							placeholder="Le code postal" value="${maVille.codePostal}"/>
					</div>
				</div>
				
				
				
<!-- 				<div class="form-group row"> -->
<!-- 					<label class="col-sm-2 col-form-label">Pays</label> -->
<!-- 					<div class="col-sm-10"> -->
<!-- 						<input type="text" class="form-control" name="adresse.pays" -->
<%-- 							placeholder="Le pays" value="${maVille.adresse.pays}"/> --%>
<!-- 					</div> -->
<!-- 				</div> -->
				
<!-- 				<div class="form-group row"> -->
<!-- 					<label class="col-sm-2 col-form-label">Pièce d'identité</label> -->
<!-- 					<div class="col-sm-10"> -->
<!-- 						<input type="text" class="form-control" name="pieceIdentite" id="pieceIdentite" -->
<%-- 							placeholder="La pièce d'identité" required value="${maVille.pieceIdentite}"/> --%>
<!-- 					</div> -->
<!-- 				</div> -->


				<div class="form-group row">
					<div class="col-sm-2"></div>
					<div class="col-sm-7">
						<button type="submit" class="btn btn-primary col-sm-12">Envoyer</button>
					</div>
					<div class="col-sm-3">
						<a href="ville/list" class="btn btn-warning col-sm-12">Annuler</a>
					</div>
				</div>
			</form>
		</section>
	</div>

</body>
</html>