package sopra.promo404.vol;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sopra.promo404.vol.dao.IDaoPassager;
import sopra.promo404.vol.dao.IDaoVille;
import sopra.promo404.vol.daoJpa.DaoPassagerJpa;
import sopra.promo404.vol.daoJpa.DaoVilleJpa;


public class Application {
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("vol");
	
	private final IDaoVille daoVille = new DaoVilleJpa();
	private final IDaoAeroport daoAeroport = new DaoAeroportJpa();
	private final IDaoClient daoClient = new DaoClientJpa();
	private final IDaoCompagnieAerienne daoCompagnieAerienne  = new DaoCompagnieAerienne Jpa();
	private final IDaoCompagnieAerienneVol daoCompagnieAerienneVol  = new DaoCompagnieAerienneVol Jpa();
	private final IDaoPassager daoPassager = new DaoPassagerJpa();
	private final IDaoReservation daoReservation= new DaoReservationJpa();
	private final IDaoVol daoVol= new DaoVolJpa();


	private Application() {
		public static Application getInstance() {
			if (instance == null) {
				instance = new Application();
			}

			return instance;
		}

		public IDaoVille getDaoFormation() {
			return daoFormation;
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
		public IDaoVol getDaoVol() {
			return daoVol;
		}
		public static void setInstance(Application instance) {
			Application.instance = instance;
		}
		public EntityManagerFactory getEmf() {
			return emf;
		}

	
	}
}
