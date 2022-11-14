package CestDuBrutal;

public class Integrante {

	// Attributs
	private int desterite;
	private int creditsECTDS;
	private int force;
	private int resistance;
	private int constituition;
	private Strategie strategie;

	// Construtuers
	private Integrante() {

	}

	// Methodes
	public int getDesterite() {
		return desterite;
	}

	public void setDesterite(int desterite) {
		this.desterite = desterite;
	}

	public int getCreditsECTDS() {
		return creditsECTDS;
	}

	public void setCreditsECTDS(int creditsECTDS) {
		this.creditsECTDS = creditsECTDS;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getResistance() {
		return resistance;
	}

	public void setResistance(int resistance) {
		this.resistance = resistance;
	}

	public int getConstituition() {
		return constituition;
	}

	public void setConstituition(int constituition) {
		this.constituition = constituition;
	}

	public Strategie getStrategie() {
		return strategie;
	}

	public void setStrategie(Strategie strategie) {
		this.strategie = strategie;
	}

}
