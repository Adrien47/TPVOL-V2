package sopra.promo404.vol.daoJpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import sopra.promo404.vol.Application;
import sopra.promo404.vol.dao.IDaoVille;
import sopra.promo404.vol.model.Ville;

public class DaoVilleJpa implements IDaoVille{

	@Override
	public List<Ville> findAll() {
		List<Ville> liste = new ArrayList<>();

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			Query query = em.createQuery("from Matiere", Ville.class);
			liste = query.getResultList();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}

		return liste;
	}

	@Override
	public Ville findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ville save(Ville entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Ville entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
