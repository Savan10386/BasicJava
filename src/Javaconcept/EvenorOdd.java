package Javaconcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
			 try {
				int number =Integer.parseInt(br.readLine());
				
				 if(number%2==0)
				 {
					 System.out.println(number +"is even number");
				 }
				 
				 else {
					 System.out.println(number +"is odd number");
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
