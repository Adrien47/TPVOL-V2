package sopra.promo404.vol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.vol.model.Client;

public interface IRepositoryClient extends JpaRepository<Client, Long> {

}
