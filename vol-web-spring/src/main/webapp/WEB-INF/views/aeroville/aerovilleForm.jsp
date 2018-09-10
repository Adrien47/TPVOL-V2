<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="sopra.promo404.vol.model.Passager"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<title>Edition du aeroville</title>
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

			<h1>Edition d'un aeroville</h1>

		</header>

		<section>
			<form action="aeroville/save" method="post">
				<input type="hidden" name="id" id="id" value="${monAeroville.id}"/>
				<input type="hidden" name="version" id="version" value="${monAeroville.version}"/>
								
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Aeroport</label>
					<div class="col-sm-10">
						<select class="custom-select" name="aeroport.id" required>
							<option value=""></option> 
							<c:forEach items="${aeroports}" var="aero">
								<option value="${aero.id}" ${monAeroville.aeroport.id eq aero.id?'selected':''}>${aero.code}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Ville</label>
					<div class="col-sm-10">
						<select class="custom-select" name="ville.id" required>
							<option value=""></option> 
							<c:forEach items="${villes}" var="vil">
								<option value="${vil.id}" ${monAeroville.ville.id eq vil.id?'selected':''}>${vil.nom}</option>
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
						<a href="aeroville/list" class="btn btn-warning col-sm-12">Annuler</a>
					</div>
				</div>
			</form>
		</section>
	</div>

</body>
</html>