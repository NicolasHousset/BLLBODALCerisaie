package com.lacerisaie.metier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.lacerisaie.metier.bllBack.ActiviteManager;
import com.lacerisaie.metier.bo.Activite;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	
	@Autowired
	ActiviteManager activiteManager;
	
	@Test
	@Transactional
	public void main() {
		// ajout d'activités
		Activite a1 = new Activite("Tennis", 15);
		activiteManager.addActivite(a1);
		Activite a2 = new Activite("Squash", 12);
		activiteManager.addActivite(a2);
		Activite a3 = new Activite("Pedalo", 10);
		activiteManager.addActivite(a3);
		
		for(Activite a : activiteManager.getAllActivites()) {
			System.out.println(a);
		}
		
		// Modification du prix d'une activité
		a2.setPrix_unitaire_ttc(13);
		for(Activite a : activiteManager.getAllActivites()) {
			System.out.println(a);
		}
		activiteManager.modifyActivite(a2);
		for(Activite a : activiteManager.getAllActivites()) {
			System.out.println(a);
		}
		
		// Suppression d'une activité
		activiteManager.deleteActivite(a2);
		for(Activite a : activiteManager.getAllActivites()) {
			System.out.println(a);
		}
	}

}
