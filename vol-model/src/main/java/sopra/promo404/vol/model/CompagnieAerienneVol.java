package sopra.promo404.vol.model;

public class CompagnieAerienneVol {

	private Long id;
	private String numero;
	private CompagnieAerienne compagnieAerienne;
	private Vol vol;

	public CompagnieAerienneVol() {
	}

	public CompagnieAerienneVol(String numero, CompagnieAerienne compagnieAerienne, Vol vol) {
		super();
		this.numero = numero;
		this.compagnieAerienne = compagnieAerienne;
		this.vol = vol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}

	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
