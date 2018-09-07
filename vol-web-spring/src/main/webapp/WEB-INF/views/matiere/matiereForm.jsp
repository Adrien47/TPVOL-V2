<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="sopra.promo404.formation.model.Matiere"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<title>Edition de la matière</title>
<meta charset="UTF-8" />
<base href="/formation-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<header class="header">

			<h1>Edition de la matière</h1>

		</header>

		<section>
			<form action="matiere/save" method="post">
				<input type="hidden" name="id" id="id" value="${maMatiere.id}"/>
				<input type="hidden" name="version" id="version" value="${maMatiere.version}"/>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Nom</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="nom" id="nom"
							placeholder="Le nom" required value="${maMatiere.nom}"/>
					</div>
				</div>


				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Durée</label>
					<div class="col-sm-10">
						<input type="number" step="1" class="form-control" name="duree"
							id="duree" placeholder="La durée" required value="${maMatiere.duree}"/>
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Difficulté</label>
					<div class="col-sm-10">
						<select class="custom-select" name="difficulte" id="difficulte">
							<option value=""></option>
							<option value="FACILE" ${maMatiere.difficulte eq 'FACILE'?'selected':''}>FACILE</option>
							<option value="MOYEN" ${maMatiere.difficulte eq 'MOYEN'?'selected':''}>MOYEN</option>
							<option value="DIFFICILE" ${maMatiere.difficulte eq 'DIFFICILE'?'selected':''}>DIFFICILE</option>
							<option value="IMPOSSIBLE" ${maMatiere.difficulte eq 'IMPOSSIBLE'?'selected':''}>IMPOSSIBLE</option>
						</select>
					</div>
				</div>

				<div class="form-group row">
					<div class="col-sm-2"></div>
					<div class="col-sm-7">
						<button type="submit" class="btn btn-primary col-sm-12">Envoyer</button>
					</div>
					<div class="col-sm-3">
						<a href="matiere/list" class="btn btn-warning col-sm-12">Annuler</a>
					</div>
				</div>
			</form>
		</section>
	</div>

</body>
</html>