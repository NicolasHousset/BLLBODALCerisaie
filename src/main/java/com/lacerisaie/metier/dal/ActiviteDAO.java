package com.lacerisaie.metier.dal;

import java.util.List;

import com.lacerisaie.metier.bo.Activite;

public interface ActiviteDAO {
	public void insert(Activite a);
	public void delete(Activite a);
	public List<Activite> getAll();

}
