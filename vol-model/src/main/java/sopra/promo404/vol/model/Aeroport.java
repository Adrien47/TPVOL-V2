package sopra.promo404.vol.model;

import java.util.ArrayList;
import java.util.List;

public class Aeroport {

	private Long id;
	private String code;
	private List<Ville> villes = new ArrayList<>();

	public Aeroport() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

}
