package sopra.promo404.vol.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity


public class Societe extends Client {
@Column(name = "forme_juridique", length = 10)
	private FormeJuridique formeJuridique;
@Column(name = "siret", length = 14)
	private String siret;

	public Societe() {
	}

	public FormeJuridique getFormeJuridique() {
		return formeJuridique;
	}

	public void setFormeJuridique(FormeJuridique formeJuridique) {
		this.formeJuridique = formeJuridique;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

}