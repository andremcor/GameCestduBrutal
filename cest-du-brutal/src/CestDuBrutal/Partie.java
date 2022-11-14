package CestDuBrutal;

public class Partie {

	// Attributs
	private Joueur jouer;
	private Carte carte;
	private String gagnantPartie;

	// Construtuers
	private Partie() {

	}

	// Methodes

	public Joueur getJouer() {
		return jouer;
	}

	public void setJouer(Joueur jouer) {
		this.jouer = jouer;
	}

	public Carte getCarte() {
		return carte;
	}

	public void setCarte(Carte carte) {
		this.carte = carte;
	}

	public String getGagnant() {
		return gagnantPartie;
	}

	public void setGagnant(String gagnant) {
		this.gagnantPartie = gagnant;
	}

}
