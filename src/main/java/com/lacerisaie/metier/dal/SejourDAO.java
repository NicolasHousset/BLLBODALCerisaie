package com.lacerisaie.metier.dal;

import java.util.List;

import com.lacerisaie.metier.bo.Sejour;

public interface SejourDAO {
	
	public List<Sejour> getListeSejour();
	public void editSejour(Sejour s);
	

}
