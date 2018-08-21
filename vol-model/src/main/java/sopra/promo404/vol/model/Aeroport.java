package sopra.promo404.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "aeroport")
public class Aeroport {
	@Id
	private Long id;
	@Column
	private String code;
	@Version
	private int version;

	// private List<Ville> villes = new ArrayList<>();
	@OneToMany(mappedBy = "aeroport", fetch = FetchType.LAZY)
	private List<Aeroville> aerovilles = new ArrayList<>();

	@OneToMany(mappedBy = "vol", fetch = FetchType.LAZY)
	private List<Escale> escales = new ArrayList<>();
	
	public Aeroport() {
	}

	public Long getId() {
		return id;
	}

	public List<Aeroville> getAerovilles() {
		return aerovilles;
	}

	public void setAerovilles(List<Aeroville> aerovilles) {
		this.aerovilles = aerovilles;
	}

	public List<Escale> getEscales() {
		return escales;
	}

	public void setEscales(List<Escale> escales) {
		this.escales = escales;
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	// public List<Ville> getVilles() {
	// return villes;
	// }
	//
	// public void setVilles(List<Ville> villes) {
	// this.villes = villes;
	// }

}
