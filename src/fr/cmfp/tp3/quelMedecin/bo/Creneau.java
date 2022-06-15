package fr.cmfp.tp3.quelMedecin.bo;

import java.time.LocalTime;

public class Creneau {

	private LocalTime heuresDebut;
	private int dureeMinute;
	private MedecinGeneraliste medecinGeneraliste;
	
	
	
	
	public Creneau(LocalTime heuresDebut, int dureeMinute, MedecinGeneraliste medecinGeneraliste) {
		super();
		this.heuresDebut = heuresDebut;
		this.dureeMinute = dureeMinute;
		this.medecinGeneraliste = medecinGeneraliste;
	}
	public LocalTime getHeuresDebut() {
		return heuresDebut;
	}
	public void setHeuresDebut(LocalTime heuresDebut) {
		this.heuresDebut = heuresDebut;
	}
	public int getDureeMinute() {
		return dureeMinute;
	}
	public void setDureeMinute(int dureeMinute) {
		this.dureeMinute = dureeMinute;
	}
	public MedecinGeneraliste getMedecinGeneraliste() {
		return medecinGeneraliste;
	}
	public void setMedecinGeneraliste(MedecinGeneraliste medecinGeneraliste) {
		this.medecinGeneraliste = medecinGeneraliste;
	}

	
	
	
	public void afficher() {
		System.out.println("Creneau [heuresDebut=" + heuresDebut + ", dureeMinute=" + dureeMinute + "]"); 
	}
	
	
	
	

	
	
	
	
	
}
