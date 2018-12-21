package com.lacerisaie.metier.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ActivitesSejour {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Date date_activite;
	private Integer nb_unite;
	
	@OneToOne
	private Activite activite;
	@OneToOne
	private Sejour sejour;
	
	public ActivitesSejour(Date date_activite, Integer nb_unite) {
		super();
		this.date_activite = date_activite;
		this.nb_unite = nb_unite;
	}
	public Activite getActivite() {
		return activite;
	}
	public void setActivite(Activite activite) {
		this.activite = activite;
	}
	public Sejour getSejour() {
		return sejour;
	}
	public void setSejour(Sejour sejour) {
		this.sejour = sejour;
	}
	public Date getDate_activite() {
		return date_activite;
	}
	public void setDate_activite(Date date_activite) {
		this.date_activite = date_activite;
	}
	public Integer getNb_unite() {
		return nb_unite;
	}
	public void setNb_unite(Integer nb_unite) {
		this.nb_unite = nb_unite;
	}
	
	

}
