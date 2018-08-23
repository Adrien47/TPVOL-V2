package sopra.promo404.vol.test;

import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import sopra.promo404.vol.model.Ville;
import sopra.promo404.vol.repositories.IRepositoryVille;

public class TestRepositoryVille {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:application-context.xml");

		// Démarrer spring
		IRepositoryVille repoVille = context.getBean(IRepositoryVille.class); // Demander le DAO à Spring

		Ville laville = new Ville("Blalala", "3548"); // new ou transient

		repoVille.save(laville); // managed

		context.close();

	}

}
