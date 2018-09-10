package sopra.promo404.vol.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.promo404.vol.model.Reservation;

public interface IRepositoryReservation extends JpaRepository<Reservation, Long> {
	@Query("select r from Reservation r left join r.passager p where p is null")
	List<Reservation> findAllAvailable();

	@Query("select r from Reservation r left join r.passager p where p is null or p.id = :id")
	List<Reservation> findAllAvailableByPassager(@Param("id") Long id);
}