package com.lacerisaie.metier.bllBack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lacerisaie.metier.bo.Activite;
import com.lacerisaie.metier.dal.ActiviteRepository;

@Service
public class ActiviteManagerImpl implements ActiviteManager {
	
	@Autowired
	ActiviteRepository dao;

	@Override
	public Activite addActivite(Activite activite) {
		return dao.save(activite);

	}

	@Override
	public Activite modifyActivite(Activite activite) {
		return dao.save(activite);
	}

	@Override
	public void deleteActivite(Activite activite) {
		dao.delete(activite);

	}

	@Override
	public Activite getActiviteFromId(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Activite> getAllActivites() {
		return (List<Activite>) dao.findAll();
	}

}
