package Javaconcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Boolean IsPrime = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			 try {
				int number =Integer.parseInt(br.readLine());
				
				for(int i=2;i<number/2;i++)
				{
					if(number%i==0)
						
					{
					   IsPrime= true;	
					   
			break;
					}
					
					else {
						IsPrime=false;
					}
					
				}
				
				if(IsPrime==true)
					
				{
					System.out.println(number+" Is Prime Number");
				}
				
				else
				{
					System.out.println(number+" Not a Prime Number");
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	      

	}

}
