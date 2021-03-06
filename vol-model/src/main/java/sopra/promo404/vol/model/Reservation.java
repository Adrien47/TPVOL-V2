package sopra.promo404.vol.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.Version;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "resa")
public class Reservation {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column(name = "code", length = 10)
	private String code;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dtResa;

	@Type(type = "yes_no")
	private boolean annulee;

	@Type(type = "yes_no")
	private boolean confirmee;
	
	@OneToOne(mappedBy = "reservation", fetch = FetchType.EAGER)
	@JoinColumn(name="pass_id")
	private Passager passager;
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="vol_id")
    private Vol vol;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "client_id")
	private Client client;

	public Reservation() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDtResa() {
		return dtResa;
	}

	public void setDtResa(Date dtResa) {
		this.dtResa = dtResa;
	}

	public boolean isConfirmee() {
		return confirmee;
	}

	public void setConfirmee(boolean confirmee) {
		this.confirmee = confirmee;
	}
	
	public boolean isAnnulee() {
		return annulee;
	}

	public void setAnnulee(boolean annulee) {
		this.annulee = annulee;
	}
	

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	

}
