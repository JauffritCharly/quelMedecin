package fr.cmfp.tp3.quelMedecin.bo;

public class Adresse {

	
	private String mentionsComplementaires;
	private int numeroDeRue;
	private String complementDeNumero;
	private String nomRue;
	private int codePostal;
	private String commune;
	
	
	
	public Adresse(String mentionsComplementaires, int numeroDeRue, String complementDeNumero, String nomRue,
			int codePostale, String commune) {
		super();
		this.mentionsComplementaires = mentionsComplementaires;
		this.numeroDeRue = numeroDeRue;
		this.complementDeNumero = complementDeNumero;
		this.nomRue = nomRue;
		this.codePostal = codePostale;
		this.commune = commune;
	}


	public Adresse(int numeroDeRue, String complementDeNumero, String nomRue, int codePostale, String commune) {
		super();
		this.numeroDeRue = numeroDeRue;
		this.complementDeNumero = complementDeNumero;
		this.nomRue = nomRue;
		this.codePostal = codePostale;
		this.commune = commune;
	}

	
	
	
	
	public String getMentionsComplementaires() {
		return mentionsComplementaires;
	}


	public void setMentionsComplementaires(String mentionsComplementaires) {
		this.mentionsComplementaires = mentionsComplementaires;
	}


	public int getNumeroDeRue() {
		return numeroDeRue;
	}


	public void setNumeroDeRue(int numeroDeRue) {
		this.numeroDeRue = numeroDeRue;
	}


	public String getComplementDeNumero() {
		return complementDeNumero;
	}


	public void setComplementDeNumero(String complementDeNumero) {
		this.complementDeNumero = complementDeNumero;
	}


	public String getNomRue() {
		return nomRue;
	}


	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}


	public int getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}


	public String getCommune() {
		return commune;
	}


	public void setCommune(String commune) {
		this.commune = commune;
	}


	public void afficher () {
		
		String mc;
		
		if (this.mentionsComplementaires != null) {
			mc = "mentionsComplementaires=" + mentionsComplementaires + ",";
		} else {
			mc = "";
		}
		
		System.out.printf( "Adresse : [ "+ mc + "numeroDeRue=" + numeroDeRue
				+ ", complementDeNumero=" + complementDeNumero + ", nomRue=" + nomRue + ", codePostale=%05d" + " , commune=" + commune + "]",this.codePostal);
		
	}
	
	
	
	
	
	
}
