package com.lacerisaie.metier.dal;

import java.util.List;

import com.lacerisaie.metier.bo.Emplacement;
public interface EmplacementDAO {
	
	public List<Emplacement> getListeEmplacement();
	public Emplacement addEmplacement(Emplacement e);
	public void delEmplacement(Emplacement e);
	

}
