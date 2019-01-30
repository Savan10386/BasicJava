package Javaconcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacieseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a =1,b=2,Temp=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		      try {
				 int length =Integer.parseInt(br.readLine());
				 
				 System.out.print(a);
				 System.out.print(b+',');
				 
				  for ( int i=0; i< length;i++)
					  
				  {
      					  Temp=a+b;
      					     a=b;
      					     b=Temp;
					  				  
					  System.out.print(','+Temp);
					  
				  }
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
