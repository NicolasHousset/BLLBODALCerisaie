package com.lacerisaie.metier.dal;

import java.util.ArrayList;
import java.util.List;

import com.lacerisaie.metier.bo.ActivitesSejour;
public class ActivitesSejourDAOMock implements ActivitesSejourDAO {
	
	private List<ActivitesSejour> listeActivitesSejour = new ArrayList<ActivitesSejour>();
	
	@Override
	public List<ActivitesSejour> getListeActivitesSejour(){
		return listeActivitesSejour;
	}

	@Override
	public ActivitesSejour addActivitesSejour(ActivitesSejour as) {
		listeActivitesSejour.add(as);
		return as;
	}

	@Override
	public void editActivitesSejour(ActivitesSejour as) {
		// TODO Auto-generated method stub
		// Méthode à implémenter
	}

}
