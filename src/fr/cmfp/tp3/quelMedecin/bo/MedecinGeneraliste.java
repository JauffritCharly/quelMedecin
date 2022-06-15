package fr.cmfp.tp3.quelMedecin.bo;

import java.time.LocalTime;

public class MedecinGeneraliste {

	private String nom;
	private String prenom;
	private String NumeroDeTelephone;
	private Adresse adresseMedecin;
	private Creneau[] creneaux = new Creneau [15];
	
	
	public static int Tarif;

	
	
	
	
	public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresseMedecin) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.NumeroDeTelephone = numeroDeTelephone;
		this.adresseMedecin = adresseMedecin;
	}



	public String getNom() {
		return nom;
	}






	public void setNom(String nom) {
		this.nom = nom;
	}






	public String getPrenom() {
		return prenom;
	}






	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}






	public String getNumeroDeTelephone() {
		return NumeroDeTelephone;
	}






	public void setNumeroDeTelephone(String numeroDeTelephone) {
		NumeroDeTelephone = numeroDeTelephone;
	}






	public static int getTarif() {
		return Tarif;
	}






	public static void setTarif(int tarif) {
		Tarif = tarif;
	}



	
	public String afficher() {
		return "MedecinGeneraliste [nom=" + nom + ", prenom=" + prenom + ", NumeroDeTelephone=" + NumeroDeTelephone
				+ ", adresseMedecin=" + adresseMedecin + "]";
	}

	
	
	public void ajouterCreneau (LocalTime heuresDebut,int dureeMinute) {
		
		int position = 0;
		
		if(heuresDebut.getHour() == 9 && heuresDebut.getMinute() == 00) {
			position =0;
		 } 
		if (heuresDebut.getHour() == 9 && heuresDebut.getMinute() == 15) {
			position = 1;
		}
		if (heuresDebut.getHour() == 9 && heuresDebut.getMinute() == 30) {
			position = 2;
		}
		if (heuresDebut.getHour() == 9 && heuresDebut.getMinute() == 45) {
			position = 3;
		}
		if (heuresDebut.getHour() == 10 && heuresDebut.getMinute() == 00) {
			position = 4;
		}
		if (heuresDebut.getHour() == 10 && heuresDebut.getMinute() == 15) {
			position = 5;
		}
		if (heuresDebut.getHour() == 10 && heuresDebut.getMinute() == 30) {
			position = 6;
		}
		if (heuresDebut.getHour() == 10 && heuresDebut.getMinute() == 45) {
			position = 7;
		}
		if (heuresDebut.getHour() == 11 && heuresDebut.getMinute() == 15) {
			position = 8;
		}
		if (heuresDebut.getHour() == 11 && heuresDebut.getMinute() == 30) {
			position = 9;
		}
		if (heuresDebut.getHour() == 11 && heuresDebut.getMinute() == 45) {
			position = 10;
		}
		if (heuresDebut.getHour() == 14 && heuresDebut.getMinute() == 00) {
			position = 11;
		}
		if (heuresDebut.getHour() == 14 && heuresDebut.getMinute() == 30) {
			position = 12;
		}
		if (heuresDebut.getHour() == 15 && heuresDebut.getMinute() == 00) {
			position = 13;
		}
		if (heuresDebut.getHour() == 15 && heuresDebut.getMinute() == 30) {
			position = 14;
		}
		if (heuresDebut.getHour() == 16 && heuresDebut.getMinute() == 00) {
			position = 15;
		}
		if (heuresDebut.getHour() == 16 && heuresDebut.getMinute() == 30) {
			position = 16;
		}
		
		
		if( creneaux [position] != null) {
		
		this.creneaux[position] = new Creneau (heuresDebut, dureeMinute, this);
		}else {
			System.out.println("Plus de place");
		}
		
		
		
		
	}
	
	
	
	
}

