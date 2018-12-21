package com.lacerisaie.metier.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Emplacement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer num_emplacement;
	
	private double prix_unitaire_ttc;
	private Integer surface;
	private Integer nb_pers_max;
	
	@ManyToOne()
	@JoinColumn(name = "num_camping", nullable = false)
	private Camping camping;
	
	@ManyToOne()
	@JoinColumn(name= "id", nullable = false)
	private TypeEmplacement typeEmplacement;
	
	public Emplacement(double prix_unitaire_ttc, Integer surface, Integer nb_pers_max) {
		super();
		this.prix_unitaire_ttc = prix_unitaire_ttc;
		this.surface = surface;
		this.nb_pers_max = nb_pers_max;
	}
	
	public Emplacement() {
		
	}
	
	public Integer getNum_emplacement() {
		return num_emplacement;
	}
	public void setNum_emplacement(Integer num_emplacement) {
		this.num_emplacement = num_emplacement;
	}
	public double getPrix_unitaire_ttc() {
		return prix_unitaire_ttc;
	}
	public void setPrix_unitaire_ttc(double prix_unitaire_ttc) {
		this.prix_unitaire_ttc = prix_unitaire_ttc;
	}
	public Integer getSurface() {
		return surface;
	}
	public void setSurface(Integer surface) {
		this.surface = surface;
	}
	public Integer getNb_pers_max() {
		return nb_pers_max;
	}
	public void setNb_pers_max(Integer nb_pers_max) {
		this.nb_pers_max = nb_pers_max;
	}
	public Camping getCamping() {
		return camping;
	}
	public void setCamping(Camping camping) {
		this.camping = camping;
	}
	public TypeEmplacement getTypeEmplacement() {
		return typeEmplacement;
	}
	public void setTypeEmplacement(TypeEmplacement typeEmplacement) {
		this.typeEmplacement = typeEmplacement;
	}
	
	

}
