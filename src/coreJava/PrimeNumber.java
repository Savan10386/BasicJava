package coreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		boolean flag= true;
		
		System.out.println("Enter the number");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		  int num = Integer.parseInt(br.readLine());
		  
		   for(int i=2;i<num;i++)
		   {
		     if(num%i==0)
		     {
		    	 System.out.println(num+" is not prime number");
		    	 
		    	 flag=false;
		    	 
		    	  break;
		     }
		
	}
		   
		      
	         if(flag==true)
	         {
	        	 System.out.println(num+" is  prime number");
	         }	   
		   
	}			   

}
