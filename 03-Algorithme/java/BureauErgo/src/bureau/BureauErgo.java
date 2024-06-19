package bureau;

public class BureauErgo {

	private  float bureauPos;
	private  float maxHeight;
	private  float maxDown;
	private boolean electricity;
	private final float param1;
	private final float param2;
	private final float param3;
	
	public BureauErgo() {
		bureauPos = 0.90f;
		maxHeight = 1.30f;
		maxDown = 0.60f;
		electricity = true;
		param1 = 0.80f;
		param2 = 1.00f;
		param3 = 1.20f;
	}
	
	public BureauErgo(float _bureauP, float _maxHght, float _maxDwn, boolean _elec, float _parm1, float _parm2, float _parm3) {
		this.bureauPos = _bureauP;
		this.maxHeight = _maxHght;
		this.maxDown = _maxDwn;
		this.electricity = _elec;
		this.param1 = _parm1;
		this.param2 = _parm2;
		this.param3 = _parm3;
	}
	public BureauErgo(BureauErgo _bureauErgoARecopier) {
		this.bureauPos = _bureauErgoARecopier.bureauPos;
		this.maxHeight = _bureauErgoARecopier.maxHeight;
		this.maxDown = _bureauErgoARecopier.maxDown;
		this.electricity = _bureauErgoARecopier.electricity;
		this.param1 = _bureauErgoARecopier.param1;
		this.param2 = _bureauErgoARecopier.param2;
		this.param3 = _bureauErgoARecopier.param3;
	}
	public boolean branchement() {
		if(this.electricity == false) {
			this.electricity = true;
		}
		return this.electricity;
	}
	public boolean debranchement() {
		if(this.electricity == true ) {
			this.electricity = false;
		}
		return this.electricity;
	}
	public float moreheight(double height) {
		if(this.electricity == true && this.maxHeight >= this.bureauPos + height) {
			this.bureauPos += height;
		}
		return this.bureauPos;
		
	}
	public float moredown() {
		if(this.electricity == true && this.maxDown <= this.bureauPos -0.20) {
			this.bureauPos -= (float)maxHeight;
		}
		return this.bureauPos;
	}
	public float goParam() { 
		this.bureauPos = param1;
		return this.bureauPos;
	}
	public float goParam2() {
		this.bureauPos = param2;
		return this.bureauPos;
	}
	public float goParam3() {
		this.bureauPos = param3;
		return this.bureauPos;
	}
	
}
