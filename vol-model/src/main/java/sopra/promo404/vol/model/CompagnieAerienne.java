package sopra.promo404.vol.model;

import java.util.ArrayList;
import java.util.List;

public class CompagnieAerienne {

	private Long id;
	private String nom;
	private List<CompagnieAerienneVol> vols = new ArrayList<>();

	public CompagnieAerienne() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<CompagnieAerienneVol> getVols() {
		return vols;
	}

	public void setVols(List<CompagnieAerienneVol> vols) {
		this.vols = vols;
	}

}
