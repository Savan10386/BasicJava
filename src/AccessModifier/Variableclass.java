package AccessModifier;

public class Variableclass {
	
	public int a=10;
	private int b=11;
	protected int c=12;
	int d=13;
	

	
	public static void main (String args[])
	{
		
		
		
		calldefault CE = new calldefault() ;
		
		char q=CE.Char();
		System.out.println(q);
		
		CE.setString();
		String de =CE.getString();
		System.out.println(de);
		
		
		CE.setFloat();
		Float fe=CE.getFloat();
		System.out.println(fe);
		
		System.out.println(q+de+fe);
		
		CE.setI(10);
		System.out.println(CE.getI());
		
		
		float g=CE.add();
		System.out.println(g);
		
	}
	
	


}
