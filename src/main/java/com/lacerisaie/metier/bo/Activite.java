package com.lacerisaie.metier.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nom;
	private double prix_unitaire_ttc;
	
	
	public Activite() {
		super();
	}
	public Activite(String nom, double prix_unitaire_ttc) {
		super();
		this.nom = nom;
		this.prix_unitaire_ttc = prix_unitaire_ttc;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix_unitaire_ttc() {
		return prix_unitaire_ttc;
	}
	public void setPrix_unitaire_ttc(double prix_unitaire_ttc) {
		this.prix_unitaire_ttc = prix_unitaire_ttc;
	}
	@Override
	public String toString() {
		return "Activite [id=" + id + ", nom=" + nom + ", prix_unitaire_ttc=" + prix_unitaire_ttc + "]";
	}
	
	

}
