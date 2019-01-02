package com.lacerisaie.metier.dal;

import java.util.List;

import com.lacerisaie.metier.bo.ActivitesSejour;

public interface ActivitesSejourDAO {
	
	public List<ActivitesSejour> getListeActivitesSejour();
	
	public ActivitesSejour addActivitesSejour(ActivitesSejour as);
	
	public void editActivitesSejour(ActivitesSejour as);
	

}
