package bureauHeritage;
import  java.math.BigDecimal;
public class BureauErgo {
	
	private boolean branche;
	BigDecimal hauteur1EnCM;
    BigDecimal hauteur2EnCM;
    BigDecimal hauteur3EnCM;
	private BigDecimal hauteurEnCM;
	private BigDecimal hauteurMaxEnCM;
	private BigDecimal hauteurMinEnCM;
	
	
	public BureauErgo() {
		branche = false;
		hauteur1EnCM = BigDecimal(80);ss
		hauteur2EnCM = BigDecimal(120);
		hauteur3EnCM = BigDecimal(150);
		hauteurEnCM = BigDecimal(100);
		hauteurMaxEnCM = BigDecimal(160);
		hauteurMinEnCM = BigDecimal(60);
		}
	
	public BureauErgo(boolean _branche, BigDecimal _hauteur1EnCM, BigDecimal _hauteur2EnCM, BigDecimal _hauteur3EnCM, BigDecimal _hauteurEnCM, BigDecimal _hauteurMaxEnCM, BigDecimal _hauteurMinEnCM) {
		this.branche = _branche;
		this.hauteur1EnCM = _hauteur1EnCM;
		this.hauteur2EnCM = _hauteur2EnCM;
		this.hauteur3EnCM = _hauteur3EnCM;
		this.hauteurEnCM = _hauteurEnCM;
		this.hauteurMaxEnCM = _hauteurMaxEnCM;
		this.hauteurMinEnCM = _hauteurMinEnCM;
	}
	public BureauErgo(BureauErgo _bureauErgoARecopier) {
		this.branche = _bureauErgoARecopier.branche;
		this.hauteur1EnCM = _bureauErgoARecopier.hauteur1EnCM;
		this.hauteur2EnCM = _bureauErgoARecopier.hauteur2EnCM;
		this.hauteur3EnCM = _bureauErgoARecopier.hauteur3EnCM;
		this.hauteurEnCM = _bureauErgoARecopier.hauteurEnCM;
		this.hauteurMaxEnCM = _bureauErgoARecopier.hauteurMaxEnCM;
		this.hauteurMinEnCM = _bureauErgoARecopier.hauteurMinEnCM;
	}
	public boolean brancher() {
		boolean result;
		if(this.branche = false) {
			this.branche = true;
		}
		result = this.branche;
		return result;
	}
	
	public boolean debrancher() {
		boolean result;
		if(this.branche = true) {
			this.branche = false;
		}
		result = this.branche;
		return result;
	}
	
	//public boolean descendre(BigDecimal differenceHauteur) {
		//boolean result = false;
		//if(this.branche == true  this.hauteurEnCM.add(differenceHauteur).compareTo(hauteurMaxEnCM)) {
		//	this.hauteurEnCM.add(differenceHauteur);
		//}
		//return result;
	//}
	public boolean monter(BigDecimal defferenceHauteur) {
		boolean result = false;
		
		return result;
	}
	
	public boolean positionnerALaHauteur(BigDecimal hauteur) {
		boolean result = false;
		if(this.branche = true) {
			this.hauteurEnCM = hauteur;
			result = true;
		}
		return result;
	}

	private BigDecimal BigDecimal(int i) {
	
		return BigDecimal.valueOf(i);
	}
	
	
	
}

	