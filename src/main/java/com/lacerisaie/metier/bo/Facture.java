package com.lacerisaie.metier.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Facture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer num_facture;
	
	private Date date_edition;
	
	@OneToOne()
	private Sejour sejour;

	public Facture(Date date_edition) {
		super();
		this.date_edition = date_edition;
	}
	
	public Facture() {
		
	}

	public Integer getNum_facture() {
		return num_facture;
	}

	public void setNum_facture(Integer num_facture) {
		this.num_facture = num_facture;
	}

	public Date getDate_edition() {
		return date_edition;
	}

	public void setDate_edition(Date date_edition) {
		this.date_edition = date_edition;
	}

	public Sejour getSejour() {
		return sejour;
	}

	public void setSejour(Sejour sejour) {
		this.sejour = sejour;
	}
	
	

}
