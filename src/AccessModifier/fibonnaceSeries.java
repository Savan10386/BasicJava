package AccessModifier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonnaceSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,s;
		int temp=1,k=1;
		
		System.out.println("Enter the Number for Fibonnace Serioes ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 try {
		int j =Integer.parseInt(br.readLine()) ;
		System.out.println(temp);
		System.out.println(k);
		for(i=1;i<=j;i++) {
			
			
			s=temp+k;
			System.out.println(s);
			temp=k; 
			k=s;
				
			
		}
		
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
