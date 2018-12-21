package com.lacerisaie.metier.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Sejour {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer numSejour;
	
	private Date dateDebut;
	private Date dateFin;
	private Integer nbPersonne;
	
	@ManyToOne()
	@JoinColumn(name = "num_camping", nullable = false)
	private Camping camping;
	@ManyToOne()
	@JoinColumn(name = "num_emplacement", nullable = false)
	private Emplacement emplacement;
	@OneToOne()
	private Facture facture;
	@ManyToOne()
	@JoinColumn(name = "num_client", nullable = false)
	private Client client;
	
	public Sejour(Date dateDebut, Date dateFin, Integer nbPersonne) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.nbPersonne = nbPersonne;
	}

	public Sejour() {
		super();
	}

	public Integer getNumSejour() {
		return numSejour;
	}

	public void setNumSejour(Integer numSejour) {
		this.numSejour = numSejour;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Integer getNbPersonne() {
		return nbPersonne;
	}

	public void setNbPersonne(Integer nbPersonne) {
		this.nbPersonne = nbPersonne;
	}

	public Camping getCamping() {
		return camping;
	}

	public void setCamping(Camping camping) {
		this.camping = camping;
	}

	public Emplacement getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(Emplacement emplacement) {
		this.emplacement = emplacement;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
