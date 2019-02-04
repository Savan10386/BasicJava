package coreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int remainder,sum = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(sum);
		   int n= br.read();
		   int actual=n;
		   
		   while(n>0)
		   {
		      remainder  = n%10;
		  
		      sum =sum*10+remainder;
		   }

	}

}
