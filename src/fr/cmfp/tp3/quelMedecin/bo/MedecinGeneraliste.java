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
		
	}
	
	
	
	
}

