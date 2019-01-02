package com.lacerisaie.metier.dal;

import java.util.ArrayList;
import java.util.List;

import com.lacerisaie.metier.bo.Camping;

public class CampingDAOMock implements CampingDAO {
	
	private List<Camping> listeCamping = new ArrayList<Camping>();
	@Override
	public List<Camping> getListeCamping() {
		return listeCamping;
	}

	@Override
	public Camping addCamping(Camping c) {
		listeCamping.add(c);
		return c;
	}

	@Override
	public void delCamping(Camping c) {
		listeCamping.remove(c);

	}

	@Override
	public void editCamping(Camping c) {
		// Méthode à implémenter
		listeCamping.get(c.getNumCamping());

	}

}
