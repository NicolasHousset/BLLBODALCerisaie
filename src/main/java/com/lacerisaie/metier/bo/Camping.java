package com.lacerisaie.metier.bo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Camping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer numCamping;
	
	private String nom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String telephone;
	private String email;
	
	@OneToMany(mappedBy="camping")
	private List<Emplacement> listeEmplacements;

	public Camping(String nom, String adresse, String codePostal, String ville, String telephone,
			String email) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.email = email;
	}
	
	public Camping() {
		
	}

	public Integer getNumCamping() {
		return numCamping;
	}

	public void setNumCamping(Integer numCamping) {
		this.numCamping = numCamping;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Emplacement> getListeEmplacements() {
		return listeEmplacements;
	}

	public void setListeEmplacements(List<Emplacement> listeEmplacements) {
		this.listeEmplacements = listeEmplacements;
	}
	
	

}
