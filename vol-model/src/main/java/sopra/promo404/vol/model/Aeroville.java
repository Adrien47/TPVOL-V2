package sopra.promo404.vol.model;

import javax.persistence.Transient;
import javax.persistence.Version;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Aeroville {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="aeroport_id")
	private Aeroport aeroport;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ville_id")
	private Ville ville;
	
	public Aeroville() {
		
	}
	
	public Aeroville(Aeroport aeroport, Ville ville)
	{
		super();
		this.aeroport = aeroport;
		this.ville = ville;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
}
