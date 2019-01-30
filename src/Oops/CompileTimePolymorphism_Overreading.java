package Oops;

public class CompileTimePolymorphism_Overreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Method_Poly_Call mpc= new Method_Poly_Call();
		
		       mpc.add(5,4,3);
		

	}
}

	
	
	class Method_Poly_Call
	{
		
        int a=1,b=2,c=3;
		
		public void add(int a,int b)
		{
			
			System.out.println("The Value is"+a);
			
		}
		
		public void add(int a, int b, int c)
		{
			System.out.println("The Value is"+c);
		}
		


}
