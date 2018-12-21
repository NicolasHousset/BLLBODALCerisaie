package com.lacerisaie.metier.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer num_client;
	
	private String nom;
	private String prenom;
	private Date date_naissance;
	private String num_telephone;
	private String email;
	
	public Client(String nom, String prenom, Date date_naissance, String num_telephone,
			String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.num_telephone = num_telephone;
		this.email = email;
	}
	
	public Client() {
		
	}
	public Integer getNum_client() {
		return num_client;
	}
	public void setNum_client(Integer num_client) {
		this.num_client = num_client;
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
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getNum_telephone() {
		return num_telephone;
	}
	public void setNum_telephone(String num_telephone) {
		this.num_telephone = num_telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Client [num_client=" + num_client + ", nom=" + nom + ", prenom=" + prenom + ", date_naissance="
				+ date_naissance + ", num_telephone=" + num_telephone + ", email=" + email + "]";
	}
	
	

}
