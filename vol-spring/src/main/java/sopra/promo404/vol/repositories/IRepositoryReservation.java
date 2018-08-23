package sopra.promo404.vol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.vol.model.Reservation;

public interface IRepositoryReservation extends JpaRepository<Reservation, Long> {

}
