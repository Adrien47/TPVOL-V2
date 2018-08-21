package sopra.promo404.vol.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 

@Entity
@Table(name = "passager")
public class Passager {

	@Id
	private Long id;
	@Column(name = "nom", length = 10)
	private String nom;
	@Column(name = "prenom", length = 10)
	private String prenom;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_naissance")
	private Date dtNaissance;
	@Column(name = "piece_identite")
	private String pieceIdentite;
	@Embedded
	@JoinColumn(name = "adresse")
	private Adresse adresse;

	@OneToOne
	@JoinColumn(name = "resa_id")
	private Reservation reservation;

	public Passager() {
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDtNaissance() {
		return dtNaissance;
	}

	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}

	public String getPieceIdentite() {
		return pieceIdentite;
	}

	public void setPieceIdentite(String pieceIdentite) {
		this.pieceIdentite = pieceIdentite;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}
