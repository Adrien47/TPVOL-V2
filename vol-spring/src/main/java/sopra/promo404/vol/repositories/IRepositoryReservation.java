package sopra.promo404.vol.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



import sopra.promo404.vol.model.Reservation;

public interface IRepositoryReservation extends JpaRepository<Reservation, Long> {

}