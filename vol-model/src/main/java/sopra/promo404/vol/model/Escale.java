package sopra.promo404.vol.model;

import java.util.Date;

public class Escale {

	private Long id;
	private Date hDepart;
	private Date hArrivee;
	private Aeroport aeroport;
	private Vol vol;

	public Escale() {
	}

	public Escale(Date hDepart, Date hArrivee, Aeroport aeroport, Vol vol) {
		this.hDepart = hDepart;
		this.hArrivee = hArrivee;
		this.aeroport = aeroport;
		this.vol = vol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date gethDepart() {
		return hDepart;
	}

	public void sethDepart(Date hDepart) {
		this.hDepart = hDepart;
	}

	public Date gethArrivee() {
		return hArrivee;
	}

	public void sethArrivee(Date hArrivee) {
		this.hArrivee = hArrivee;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

}
