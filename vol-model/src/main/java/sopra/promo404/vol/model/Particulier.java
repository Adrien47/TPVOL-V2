package sopra.promo404.vol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;


@Entity

public class Particulier extends Client {
	
	@Enumerated
	@Column(name = "civilite", length = 3)
	private Civilite civilite;
	@Column(name = "prenom", length = 20)
	private String prenom;

	public Particulier() {
		}

	public Civilite getCivilite() {
		return civilite;
	}

	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	

}
