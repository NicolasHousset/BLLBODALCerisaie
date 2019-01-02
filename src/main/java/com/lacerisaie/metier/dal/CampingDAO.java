package com.lacerisaie.metier.dal;

import java.util.List;

import com.lacerisaie.metier.bo.Camping;

public interface CampingDAO {
	
	public List<Camping> getListeCamping();
	public Camping addCamping(Camping c);
	public void delCamping(Camping c);
	public void editCamping(Camping c);

}
