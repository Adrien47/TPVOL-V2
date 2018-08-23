package sopra.promo404.vol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.promo404.vol.model.Login;

public interface IRepositoryLogin extends JpaRepository<Login, String> {
	
}



