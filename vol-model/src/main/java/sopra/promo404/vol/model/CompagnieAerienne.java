package sopra.promo404.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class CompagnieAerienne {
	@Id
//	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column(name = "nom")
	private String nom;
	@OneToMany(mappedBy = "compagnieAerienne", fetch = FetchType.LAZY)
	private List<CompagnieAerienneVol> vols = new ArrayList<>();

	public CompagnieAerienne() {
	}

	public CompagnieAerienne(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public CompagnieAerienne(Long id, int version, String nom, List<CompagnieAerienneVol> vols) {
		super();
		this.id = id;
		this.version = version;
		this.nom = nom;
		this.vols = vols;
	}

	public Long getId() {
		return id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
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
