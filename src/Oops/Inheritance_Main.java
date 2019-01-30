package Oops;

 class Inheritance_Super 
{

	public Inheritance_Super() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void RWorld()
	{
		System.out.println("Super class");
	}

}


class Inheritance_sub extends Inheritance_Super
{
	
	public void Nworld()
	{
		System.out.println("Sub class");
	}
}


class Inheritance_Main
{
	
	public static void main(String args[])
	{
	Inheritance_Super IHS = new Inheritance_Super();
	
	     IHS.RWorld();
	}

		    
}
