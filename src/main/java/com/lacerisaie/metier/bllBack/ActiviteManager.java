package com.lacerisaie.metier.bllBack;

import java.util.List;

import com.lacerisaie.metier.bo.Activite;

public interface ActiviteManager {
	
	public Activite addActivite(Activite activite);
	public Activite modifyActivite(Activite activite);
	public void deleteActivite(Activite activite);
	public Activite getActiviteFromId(Integer id);
	public List<Activite> getAllActivites();

}
