package coreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FibonnacieSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=0, j=1;
		int n = 0;
		int temp=0	;
		
		System.out.println("How many numbers are needed you");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		  try {
			n=  Integer.parseInt(br.readLine());
			System.out.println(n);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  System.out.println(i);
		  
		  for(int k=0; k<=n; k++)
		  {
			 	  
			  temp=j;
			  j=i+j;
			  i=temp;
			  
			  System.out.println(j);
		  }
		

	}

}
