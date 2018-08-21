package sopra.promo404.vol.model;

import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="ville")
public class Ville {

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String nom;
	@Column
	private String codePostal;
	@Version
	private int version;
	
	@OneToMany(mappedBy = "ville", fetch=FetchType.LAZY)
	private List<Aeroville> aerovilles = new ArrayList<>();
	@Transient
	private List<Aeroport> aeroports = new ArrayList<>();

	public Ville() {
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

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public List<Aeroport> getAeroports() {
		return aeroports;
	}

	public void setAeroports(List<Aeroport> aeroports) {
		this.aeroports = aeroports;
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	public List<Aeroville> getAerovilles() {
		return aerovilles;
	}

	public void setAerovilles(List<Aeroville> aerovilles) {
		this.aerovilles = aerovilles;
	}

}
