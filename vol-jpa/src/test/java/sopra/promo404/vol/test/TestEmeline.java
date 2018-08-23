package sopra.promo404.vol.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import sopra.promo404.vol.Application;
import sopra.promo404.vol.dao.IDaoClient;
import sopra.promo404.vol.dao.IDaoLogin;
import sopra.promo404.vol.dao.IDaoPassager;
import sopra.promo404.vol.dao.IDaoReservation;
import sopra.promo404.vol.model.Adresse;
import sopra.promo404.vol.model.Civilite;
import sopra.promo404.vol.model.Login;
import sopra.promo404.vol.model.Particulier;
import sopra.promo404.vol.model.Passager;
import sopra.promo404.vol.model.Reservation;
import sopra.promo404.vol.model.Societe;

public class TestEmeline {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IDaoClient daoClient = Application.getInstance().getDaoClient();
		IDaoPassager daoPassager = Application.getInstance().getDaoPassager();
		IDaoLogin daoLogin = Application.getInstance().getDaoLogin();
		IDaoReservation daoReservation = Application.getInstance().getDaoReservation();

		Adresse adresseJeanValjean = new Adresse();
		Reservation reservationJeanValJean = new Reservation();

		Passager jeanValJean = new Passager();
		Societe thenardierSarl = new Societe();
		Login loginThenardier = new Login();
		Particulier cosette = new Particulier(Civilite.MME, "Cosette");
		Adresse adresseJavert = new Adresse();

		Login loginCosette = new Login();
		Adresse adresseCosette = new Adresse();
		Reservation reservationJavert = new Reservation();
		Passager javert = new Passager();
		Societe fantineSarl = new Societe();
		Particulier gavroche = new Particulier(Civilite.MR, "Gavroche");

		daoPassager.save(javert);
		daoClient.save(fantineSarl);
		daoReservation.save(reservationJeanValJean);
		daoPassager.save(jeanValJean);
		daoClient.save(gavroche);
		daoClient.save(cosette);
		daoLogin.save(loginCosette);
		daoLogin.save(loginThenardier);
		daoClient.save(thenardierSarl);
		daoReservation.save(reservationJavert);
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("entityvol");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		adresseJavert.setVille("Paris");

		adresseJeanValjean.setRue("rue de la Chanvrerie ");
		adresseJeanValjean.setVille("Paris");
		adresseCosette.setRue("rue des filles du calvaire");
		adresseCosette.setVille("Paris");

		reservationJeanValJean.setPassager(jeanValJean);
		reservationJeanValJean.setClient(cosette);
		reservationJeanValJean.setCode("RF234534");
		reservationJeanValJean.setConfirmee(true);

		reservationJavert.setPassager(javert);
		reservationJavert.setClient(cosette);
		reservationJavert.setConfirmee(false);

		jeanValJean.setAdresse(adresseJeanValjean);
		jeanValJean.setNom("Valjean");
		jeanValJean.setPrenom("Jean");
		jeanValJean.setPieceIdentite("24601");
		jeanValJean.setReservation(reservationJeanValJean);

		javert.setAdresse(adresseJavert);
		javert.setNom("Javert");
		javert.setReservation(reservationJavert);

		loginCosette.setIdentifiant("Coco");
		loginCosette.setMotDePasse("balai");
		cosette.setAdresse(adresseCosette);
		// cosette.getCivilite();
		cosette.setEmail("cosette@vh.fr");
		cosette.setNom("Cosette");
		cosette.setNumeroTel("0123456789");
		
		cosette.setLogin(loginCosette);

		thenardierSarl.setEmail("thenard@vh.fr");
		thenardierSarl.setSiret("34578456700012");
		loginThenardier.setAdmin(true);
		loginThenardier.setClient(thenardierSarl);
		
		
		
		
		// thenardierSarl.setFormeJuridique(formeJuridique);

		/*
		 * reservationJeanValJean.setVol(x); reservationJavert.setVol(y);
		 */

	}
}