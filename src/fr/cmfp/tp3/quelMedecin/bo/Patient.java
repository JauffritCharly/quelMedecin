package fr.cmfp.tp3.quelMedecin.bo;

import java.time.LocalDate;

public class Patient {

	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private char sexe; 
	private long numeroSecuriteSociale;
	private LocalDate dateDeNaissance;
	private String commentaire;
	private Adresse adressePatient;
	
	
	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroSecuriteSociale,
			LocalDate dateDeNaissance, String commentaire, Adresse adressePatient) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.sexe = sexe;
		this.numeroSecuriteSociale = numeroSecuriteSociale;
		this.dateDeNaissance = dateDeNaissance;
		this.commentaire = commentaire;
		this.adressePatient = adressePatient;
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
		return numeroDeTelephone;
	}
	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public long getNumeroSecuriteSociale() {
		return numeroSecuriteSociale;
	}
	public void setNumeroSecuriteSociale(long numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


	
	
	
	public void afficher() {
		System.out.println( "Patient [nom=" + nom + ", prenom=" + prenom + ", numeroDeTelephone=" + numeroDeTelephone + ", sexe="
				+ sexe + ", numeroSecuriteSociale=" + numeroSecuriteSociale + ", dateDeNaissance=" + dateDeNaissance
				+ ", commentaire=" + commentaire + ", adressePatient=" + adressePatient + "]");
	}
	
	
	
}
