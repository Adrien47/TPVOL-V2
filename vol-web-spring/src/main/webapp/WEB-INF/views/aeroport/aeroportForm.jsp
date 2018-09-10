<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="sopra.promo404.vol.model.Vol"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editez votre Aéroport</title>
<meta charset="UTF-8" />
<base href="/vol-web-spring/"  />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
<jsp:include page="../nav.jsp"></jsp:include>

<div class="container">
		<header class="header">

			<h1>Edition de l'aéroport</h1>

		</header>

		<section>
			<form action="aeroport/save" method="post">
				<input type="hidden" name="id" id="id" value="${monAeroport.id}"/>
				<input type="hidden" name="version" id="version" value="${monAeroport.version}"/>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">	Code</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="code" id="code"
							placeholder="Le code" required value="${monAeroport.code}"/>
					</div>
				</div>


							

				<div class="form-group row">
					<div class="col-sm-2"></div>
					<div class="col-sm-7">
						<button type="submit" class="btn btn-primary col-sm-12">Envoyer</button>
					</div>
					<div class="col-sm-3">
						<a href="aeroport/list" class="btn btn-warning col-sm-12">Annuler</a>
					</div>
				</div>
			</form>
		</section>
	</div>

</body>
</html>





