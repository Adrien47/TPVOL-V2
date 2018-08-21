package sopra.promo404.vol.model;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable 
public class Adresse implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rue;
	private String codePostal;
	private String ville;
	private String pays;


	public Adresse() {
	}


	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}



}
