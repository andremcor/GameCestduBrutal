package CestDuBrutal;

public class Joueur {

	// Attributs
	private String pseudonome;
	private int creditsECTDS;
	private String filiere;
	private Integrante equipe;
	private String combattant;
	private String reserviste;

	// Construtuers
	private Joueur() {

	}

	// Methodes
	public String getPseudonome() {
		return pseudonome;
	}

	public void setPseudonome(String pseudonome) {
		this.pseudonome = pseudonome;
	}

	public int getCreditsECTDS() {
		return creditsECTDS;
	}

	public void setCreditsECTDS(int creditsECTDS) {
		this.creditsECTDS = creditsECTDS;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public Integrante getEquipe() {
		return equipe;
	}

	public void setEquipe(Integrante equipe) {
		this.equipe = equipe;
	}

	public String getCombattant() {
		return combattant;
	}

	public void setCombattant(String combattant) {
		this.combattant = combattant;
	}

	public String getReserviste() {
		return reserviste;
	}

	public void setReserviste(String reserviste) {
		this.reserviste = reserviste;
	}

}
