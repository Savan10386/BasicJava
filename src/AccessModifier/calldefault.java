package AccessModifier;

public class calldefault {
	
	private char c='m';
	private String a;
	private float fl;
	private int i;
	
	public char Char() {
		return c;
	}
	
	public void setString() {
		a="SetText";
		
	}
	
	public String getString () {
		return a;
	}
	
	public void setFloat() {
		fl=10.5f;
	}
	public float getFloat() {
		return fl;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	public float add() {
		
		return fl+i;
		
	}
	
	
	

}
