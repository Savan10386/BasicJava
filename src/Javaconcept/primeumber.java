package Javaconcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class primeumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		boolean flag=false;
		
		System.out.println("enter the number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
		int num=Integer.parseInt(br.readLine());
		
		for(i=2;i<num;i++) {
			if(num%i==0) {
				flag=true;
				break;
				
			} else
			{
				flag=false;
			}
		} 
			if(flag==false) {
				System.out.println(num+"Is Prime");
			}else {
				System.out.println(num+"not prime");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
