package sopra.promo404.vol.test;

import sopra.promo404.vol.Application;
import sopra.promo404.vol.dao.IDaoCompagnieAerienne;
import sopra.promo404.vol.dao.IDaoCompagnieAerienneVol;
import sopra.promo404.vol.dao.IDaoVol;
import sopra.promo404.vol.model.CompagnieAerienne;
import sopra.promo404.vol.model.CompagnieAerienneVol;
import sopra.promo404.vol.model.Vol;

public class TestAdrien {

	public static void main(String[] args) {
		IDaoCompagnieAerienne daoCompagnieAerienne = Application.getInstance().getDaoCompagnieAerienne();
		IDaoCompagnieAerienneVol daoCompagnieAerienneVol = Application.getInstance().getDaoCompagnieAerienneVol();
		IDaoVol daoVol = Application.getInstance().getDaoVol();
		
		
		CompagnieAerienne compAer1 = new CompagnieAerienne(666L, "Vol n°1");
		CompagnieAerienne compAer2 = new CompagnieAerienne(777L, "Vol n°2");
		CompagnieAerienne compAer3 = new CompagnieAerienne(888L, "Vol n°3");
		
		daoCompagnieAerienne.save(compAer1);
		daoCompagnieAerienne.save(compAer2);
		daoCompagnieAerienne.save(compAer3);
		
		CompagnieAerienneVol compAerVol1 = new CompagnieAerienneVol();
		CompagnieAerienneVol compAerVol2 = new CompagnieAerienneVol();
		CompagnieAerienneVol compAerVol3 = new CompagnieAerienneVol();
		
		daoCompagnieAerienneVol.save(compAerVol1);
		daoCompagnieAerienneVol.save(compAerVol2);
		daoCompagnieAerienneVol.save(compAerVol3);
		
		Vol vol1 = new Vol();
		Vol vol2 = new Vol();
		Vol vol3 = new Vol();
		
		daoVol.save(vol1);
		daoVol.save(vol2);
		daoVol.save(vol3);
		
		
		

	}
}