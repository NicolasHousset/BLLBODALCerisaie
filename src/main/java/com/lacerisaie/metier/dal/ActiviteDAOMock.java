package com.lacerisaie.metier.dal;

import java.util.ArrayList;
import java.util.List;

import com.lacerisaie.metier.bo.Activite;


public class ActiviteDAOMock implements ActiviteDAO {
	
	List<Activite> lst = new ArrayList<Activite>();

	@Override
	public void insert(Activite a) {
		lst.add(a);

	}

	@Override
	public void delete(Activite a) {
		lst.remove(a);

	}

	@Override
	public List<Activite> getAll() {
		// TODO Auto-generated method stub
		return lst;
	}

}
