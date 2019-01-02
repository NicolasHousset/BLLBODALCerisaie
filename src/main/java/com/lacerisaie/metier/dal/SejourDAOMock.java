package com.lacerisaie.metier.dal;

import java.util.ArrayList;
import java.util.List;

import com.lacerisaie.metier.bo.Sejour;

public class SejourDAOMock implements SejourDAO {
	
	private List<Sejour> listeSejour = new ArrayList<Sejour>();

	@Override
	public List<Sejour> getListeSejour() {
		return listeSejour;
	}

	@Override
	public void editSejour(Sejour s) {
		// TODO Auto-generated method stub

	}

}
