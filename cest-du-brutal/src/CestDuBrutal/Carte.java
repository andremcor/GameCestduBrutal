package CestDuBrutal;

public class Carte {

	// Attributs
	private String nomCarte;
	private Zone zone;

	// Construtuers
	private Carte() {

	}

	// Methodes
	public String getNomCarte() {
		return nomCarte;
	}

	public void setNomCarte(String nomCarte) {
		this.nomCarte = nomCarte;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

}
