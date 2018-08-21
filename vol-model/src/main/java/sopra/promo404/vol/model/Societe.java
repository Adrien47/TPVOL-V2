package sopra.promo404.vol.model;

public class Societe extends Client {

	private FormeJuridique formeJuridique;
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
