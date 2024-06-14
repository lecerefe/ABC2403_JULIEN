package Bouteille;

public class Bouteille {

	private float contenanceEnLitre;
	private float contenuEnLitre;
	private boolean ouvert;
	private String typeDeContenu;

	public Bouteille() {
		contenanceEnLitre = 1;
		contenuEnLitre = 1;
		ouvert = false;
		typeDeContenu = "H20";
	}

	public Bouteille(float _contencanceEnL, float _contenuEnL, boolean _ouvert, String _typeDeContenu) {
		this.contenanceEnLitre = _contencanceEnL;
		this.contenuEnLitre = _contenuEnL;
		this.ouvert = _ouvert;
		this.typeDeContenu = _typeDeContenu;
	}

	public Bouteille(Bouteille _bouteilleARecopier) {
		this.contenanceEnLitre = _bouteilleARecopier.contenanceEnLitre;
		this.contenuEnLitre = _bouteilleARecopier.contenuEnLitre;
		this.ouvert = _bouteilleARecopier.ouvert;
		this.typeDeContenu = _bouteilleARecopier.typeDeContenu;
	}

	public float donneContenanceEnCL() {
		float result;
		result = this.contenanceEnLitre * 100;
		return result;
	}

	public boolean estPlein() {
		boolean plein;
		if (this.contenuEnLitre == this.contenanceEnLitre) {
			plein = true;
		} else
			plein = false;
		return plein;
	}

	public boolean fermetur() {
		boolean fermerOn;
		if (this.ouvert == true) {
			fermerOn = true;
			this.ouvert = false;
		}
		return this.ouvert;
	}

	public boolean ouvertur() {
		boolean ouvertOn;
		if (this.ouvert == false) {
			ouvertOn = true;
			this.ouvert = true;
		}
		return this.ouvert;
	}

	public boolean remplissage(float remplCl) {

		boolean rempl = false;
		
		float dif = this.contenanceEnLitre - this.contenuEnLitre;
		if ( this.ouvert == true &&  dif >= remplCl) {
			rempl = true;
			this.contenuEnLitre += remplCl;
		}
		return rempl;
	}

	public boolean vidage(float videzCl) {
		boolean videz = false;
		if (this.ouvert == true && this.contenuEnLitre >= videzCl) {
			this.contenuEnLitre -= videzCl;
			videz = true;
		}
		return videz;
	}

	public boolean remplireComplet() {
		boolean rempliR = false;
		if (this.ouvert == true && this.contenuEnLitre != this.contenanceEnLitre) {
			rempliR = true;
			this.contenuEnLitre = this.contenanceEnLitre;
		}
		return rempliR;
	}

	public boolean videzComplet() {
		boolean viderR = false;
		if (this.ouvert == true && this.contenuEnLitre != 0) {
			this.contenuEnLitre = 0;
			viderR = true;
		}
		return viderR;
	}
}