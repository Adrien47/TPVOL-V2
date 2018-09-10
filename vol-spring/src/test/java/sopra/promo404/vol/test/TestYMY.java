package sopra.promo404.vol.test;

import java.text.ParseException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sopra.promo404.vol.model.Reservation;
import sopra.promo404.vol.repositories.IRepositoryReservation;

public class TestYMY {
	public static void main(String[] args) throws ParseException {
		
		
		
//		IDaoVille idaoVille = Application.getInstance().getDaoVille();
//		IDaoAeroport idaoAeroport = Application.getInstance().getDaoAeroport();
//		IDaoAeroville idaoAeroville = Application.getInstance().getDaoAeroville();
//
//		Ville ville00 = new Ville("MERIGNAC","33700");		
//		Ville ville01 = new Ville("TALENCE","33700");
//		Ville ville02 = new Ville("LE MOULE","97160");
//		
//	
//		Aeroport aeroport= new Aeroport("PTP");
//		Aeroport aeroport2= new Aeroport("LOL");	
//		Aeroport aeroport3= new Aeroport("BDX");
//		
//		
//		Aeroville aeroville00 = new Aeroville();
//		aeroville00.setAeroport(aeroport3);
//		aeroville00.setVille(ville00);
//		
//		Aeroville aeroville01 = new Aeroville();
//		aeroville01.setAeroport(aeroport);
//		aeroville01.setVille(ville02);
//		
//		List<Aeroville> aerovilles = new ArrayList<Aeroville>();
//		
//		ville00.setAerovilles(aerovilles);
//		ville02.setAerovilles(aerovilles);
//		
//		aeroport3.setAerovilles(aerovilles);
//		aeroport.setAerovilles(aerovilles);
//		
//		ville00.getAerovilles().add(aeroville00);
//		
//		
//		idaoVille.save(ville00);
//		idaoVille.save(ville01);
//		idaoVille.save(ville02);
//		
//		idaoAeroport.save(aeroport);
//		idaoAeroport.save(aeroport2);
//		idaoAeroport.save(aeroport3);
//		
//		idaoAeroville.save(aeroville00);
//		idaoAeroville.save(aeroville01);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:application-context.xml");

		// Démarrer spring
		IRepositoryReservation repoReservation = context.getBean(IRepositoryReservation.class); // Demander le DAO à Spring

		Reservation laresa = new Reservation(); // new ou transient

		repoReservation.save(laresa); // managed

		context.close();

		
		
	}

}
