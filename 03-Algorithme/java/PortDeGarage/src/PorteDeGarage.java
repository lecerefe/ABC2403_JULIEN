
public class PorteDeGarage {

	private boolean estVerouiler;
	private float pourcentageDOuverture;
	private final float pourcentageDOuvertureMax;
	private final float pourcentageDOuvertureMin;

	public PorteDeGarage() {
		estVerouiler = true;
		pourcentageDOuverture = 0;
		pourcentageDOuvertureMax = 100;
		pourcentageDOuvertureMin = 0;
	}

	public PorteDeGarage(boolean _estVerouiler, float _pourcentageDOuverture, float _pourcentageDOuvertureMax,
			float _pourcentageDOuvertureMin) {
		this.estVerouiler = _estVerouiler;
		this.pourcentageDOuverture = _pourcentageDOuverture;
		this.pourcentageDOuvertureMax = _pourcentageDOuvertureMax;
		this.pourcentageDOuvertureMin = _pourcentageDOuvertureMin;
	}

	public boolean deverouiler() {
		boolean result = false;
		if (this.estVerouiler == true && this.pourcentageDOuverture == 0 || this.pourcentageDOuverture == 100) {
			this.estVerouiler = false;
			result = true;
		}
		return result;
	}

	public boolean verouiller() {
		boolean result = false; 
		if (this.estVerouiler == false && this.pourcentageDOuverture == 0 || this.pourcentageDOuverture == 100) {
			this.estVerouiler = true;
			result = true;
		}
		return result;
	}

	public float ouvrireEnPourcentage(float pourcent) {
		if (this.estVerouiler == false && this.pourcentageDOuverture + pourcent <= this.pourcentageDOuvertureMax) {
			this.pourcentageDOuverture += pourcent;
		}
		return this.pourcentageDOuverture;
	}

	public float fermetureEnPourcentage(float pourcents) {
		if (this.estVerouiler == false && this.pourcentageDOuverture - pourcents >= this.pourcentageDOuvertureMin) {
			this.pourcentageDOuverture -= pourcents;
		}
		return this.pourcentageDOuverture;
	}

}
