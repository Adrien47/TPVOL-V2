package sopra.promo404.vol;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.promo404.vol.dao.IDaoAeroport;
import sopra.promo404.vol.dao.IDaoAeroville;
import sopra.promo404.vol.dao.IDaoClient;
import sopra.promo404.vol.dao.IDaoCompagnieAerienne;
import sopra.promo404.vol.dao.IDaoCompagnieAerienneVol;
import sopra.promo404.vol.dao.IDaoLogin;
import sopra.promo404.vol.dao.IDaoPassager;
import sopra.promo404.vol.dao.IDaoReservation;
import sopra.promo404.vol.dao.IDaoVille;
import sopra.promo404.vol.dao.IDaoVol;
import sopra.promo404.vol.daoJpa.DaoAeroportJpa;
import sopra.promo404.vol.daoJpa.DaoAerovilleJpa;
import sopra.promo404.vol.daoJpa.DaoClientJpa;
import sopra.promo404.vol.daoJpa.DaoCompagnieAerienneJpa;
import sopra.promo404.vol.daoJpa.DaoCompagnieAerienneVolJpa;
import sopra.promo404.vol.daoJpa.DaoLoginJpa;
import sopra.promo404.vol.daoJpa.DaoPassagerJpa;
import sopra.promo404.vol.daoJpa.DaoReservationJpa;
import sopra.promo404.vol.daoJpa.DaoVilleJpa;
import sopra.promo404.vol.daoJpa.DaoVolJpa;

public class Application {
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("vol");

	private final IDaoVille daoVille = new DaoVilleJpa();
	private final IDaoAeroport daoAeroport = new DaoAeroportJpa();
	private final IDaoClient daoClient = new DaoClientJpa();
	private final IDaoCompagnieAerienne daoCompagnieAerienne = new DaoCompagnieAerienneJpa();
	private final IDaoCompagnieAerienneVol daoCompagnieAerienneVol = new DaoCompagnieAerienneVolJpa();
	private final IDaoPassager daoPassager = new DaoPassagerJpa();
	private final IDaoReservation daoReservation = new DaoReservationJpa();
	private final IDaoVol daoVol = new DaoVolJpa();
	private final IDaoAeroville daoAeroville = new DaoAerovilleJpa();
	private final IDaoLogin daoLogin = new DaoLoginJpa();

	private Application() {
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public IDaoAeroport getDaoAeroport() {
		return daoAeroport;
	}

	public IDaoClient getDaoClient() {
		return daoClient;
	}

	public IDaoCompagnieAerienne getDaoCompagnieAerienne() {
		return daoCompagnieAerienne;
	}

	public IDaoCompagnieAerienneVol getDaoCompagnieAerienneVol() {
		return daoCompagnieAerienneVol;
	}

	public IDaoPassager getDaoPassager() {
		return daoPassager;
	}

	public IDaoReservation getDaoReservation() {
		return daoReservation;
	}

	public IDaoVille getDaoVille() {
		return daoVille;
	}

	public IDaoVol getDaoVol() {
		return daoVol;
	}
	public IDaoLogin getDaoLogin() {
		return daoLogin;
	}

	public static void setInstance(Application instance) {
		Application.instance = instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IDaoAeroville getDaoAeroville() {
		return daoAeroville;
	}

}
