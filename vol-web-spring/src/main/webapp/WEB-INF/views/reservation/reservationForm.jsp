<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="sopra.promo404.vol.model.Vol"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editez votre Réservation</title>
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

			<h1>Edition de la réservation</h1>

		</header>

		<section>
			<form action="reservation/save" method="post">
				<input type="hidden" name="id" id="id" value="${maReservation.id}"/>
				<input type="hidden" name="version" id="version" value="${maReservation.version}"/>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">	Code</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="code" id="code"
							placeholder="Le code" required value="${maReservation.code}"/>
					</div>
				</div>


				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Date de Reservation</label>
					<div class="col-sm-10">
						<input type="Date" step="1" class="form-control" name="dtResa"
							id="dtResa" placeholder="La date de résa" required value="${maReservation.dtResa}"/>
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Confirmation</label>
					<div class="col-sm-10">
						<select class="custom-select" name="confirmee" id="confirmee">
							<option value=""></option>
							<option value="TRUE" ${maReservation.confirmee eq 'TRUE'?'selected':''}>CONFIRMEE</option>
							<option value="FALSE" ${maReservation.confirmee eq 'FALSE'?'selected':''}>EN COURS</option>
						
						</select>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Annulation</label>
					<div class="col-sm-10">
						<select class="custom-select" name="annulee" id="annulee">
							<option value=""></option>
							<option value="TRUE" ${maReservation.annulee eq 'TRUE'?'selected':''}>ANNULEE</option>
							<option value="FALSE" ${maReservation.annulee eq 'FALSE'?'selected':''}>VALIDEE</option>
						
						</select>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Id Vol</label>
					<div class="col-sm-10">
					<select class="custom-select" name="vol.id" required>
							<option value=""></option>
						<c:forEach items="${vols}" var="vol">
								<option value="${vol.id}" ${reservation.vol.id eq arr.id?'selected':''}>${vol.id}</option>
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
						<a href="reservation/list" class="btn btn-warning col-sm-12">Annuler</a>
					</div>
				</div>
			</form>
		</section>
	</div>

</body>
</html>





