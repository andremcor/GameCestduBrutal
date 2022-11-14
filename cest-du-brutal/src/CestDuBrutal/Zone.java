package CestDuBrutal;

public class Zone {

	// Attributs
	private String nomZone;
	private String gagnantZone;
	private int combattant;

	// Construtuers
	private Zone() {

	}

	// Methodes
	public String getNomZone() {
		return nomZone;
	}

	public void setNomZone(String nomZone) {
		this.nomZone = nomZone;
	}

	public String getGagnantZone() {
		return gagnantZone;
	}

	public void setGagnantZone(String gagnantZone) {
		this.gagnantZone = gagnantZone;
	}

	public int getCombattant() {
		return combattant;
	}

	public void setCombattant(int combattant) {
		this.combattant = combattant;
	}

}
