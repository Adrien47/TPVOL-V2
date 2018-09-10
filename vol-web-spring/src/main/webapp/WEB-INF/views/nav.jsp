<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="nav nav-pills">
	<ul class="nav justify-content-center">
		<li class="nav-item"><a class="nav-link" href="vol" id="navvol">Vol</a></li>
		<li class="nav-item"><a class="nav-link" href="reservation" id="navreservation">Réservation</a></li>
		<li class="nav-item"><a class="nav-link" href="passager" id="navpassager">Passager</a></li>
		<li class="nav-item"><a class="nav-link" href="aeroport" id="navaeroport">Aeroport</a></li>
		<li class="nav-item"><a class="nav-link" href="ville" id="navville">Ville</a></li>
		<li class="nav-item"><a class="nav-link" href="client" id="navclient">Client</a></li>
	</ul>
</nav>

<script type="text/javascript">
	var idNav = location.pathname.split("/")[2];
 	var nav = document.getElementById("nav"+idNav);
	nav.classList.add('active');
</script>