<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editez votre Réservation</title>
<meta charset="UTF-8" />
<base href="/formation-web-spring/" />
<meta name="viewport" content="width=devide-width, initial-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

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
						<input type="Date" step="1" class="form-control" name="date"
							id="duree" placeholder="La date de résa" required value="${maMatiere.dtResa}"/>
					</div>
				</div>

				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Confirmation</label>
					<div class="col-sm-10">
						<select class="custom-select" name="confirmee" id="confirmee">
							<option value=""></option>
							<option value="TRUE" ${maReservation.confirmee eq 'FACILE'?'selected':''}>TRUE</option>
							<option value="FALSE" ${maReservation.confirmee eq 'MOYEN'?'selected':''}>FALSE</option>
						
						</select>
					</div>
				</div>
				
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Annulation</label>
					<div class="col-sm-10">
						<select class="custom-select" name="confirmee" id="confirmee">
							<option value=""></option>
							<option value="TRUE" ${maReservation.annulee eq 'FACILE'?'selected':''}>TRUE</option>
							<option value="FALSE" ${maReservation.annulee eq 'MOYEN'?'selected':''}>FALSE</option>
						
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









</body>
</html>