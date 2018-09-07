package sopra.promo404.vol.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Vol {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dtDepart;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dtArrivee;
	private Integer nbPlace;
	private Boolean ouvert;
	@OneToMany(mappedBy = "vol", fetch=FetchType.LAZY)
	private List<Escale> escales = new ArrayList<>();
	@OneToMany(mappedBy= "vol", fetch=FetchType.LAZY)
	private List<Reservation> reservations = new ArrayList<>();
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "depart_vol_aero")
	private Aeroport depart;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "arrivee_vol_aero")
	private Aeroport arrivee;
	@OneToMany(mappedBy = "compagnieAerienne", fetch=FetchType.LAZY)
	private List<CompagnieAerienneVol> compagnieAeriennes = new ArrayList<>();

	public Vol() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDtDepart() {
		return dtDepart;
	}

	public void setDtDepart(Date dtDepart) {
		this.dtDepart = dtDepart;
	}

	public Date getDtArrivee() {
		return dtArrivee;
	}

	public void setDtArrivee(Date dtArrivee) {
		this.dtArrivee = dtArrivee;
	}

	public Integer getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(Integer nbPlace) {
		this.nbPlace = nbPlace;
	}

	public Boolean getOuvert() {
		return ouvert;
	}

	public void setOuvert(Boolean ouvert) {
		this.ouvert = ouvert;
	}

	public List<CompagnieAerienneVol> getCompagnieAeriennes() {
		return compagnieAeriennes;
	}

	public void setCompagnieAeriennes(List<CompagnieAerienneVol> compagnieAeriennes) {
		this.compagnieAeriennes = compagnieAeriennes;
	}

	public List<Escale> getEscales() {
		return escales;
	}

	public void setEscales(List<Escale> escales) {
		this.escales = escales;
	}

	public Aeroport getDepart() {
		return depart;
	}

	public void setDepart(Aeroport depart) {
		this.depart = depart;
	}

	public Aeroport getArrivee() {
		return arrivee;
	}

	public void setArrivee(Aeroport arrivee) {
		this.arrivee = arrivee;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
