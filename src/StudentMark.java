import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class StudentMark {

	public static void main (String args[]) {
		
		int tot=0; 
		int i =0;
		float percent=0;
		int mark[] = new int[5];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (i=0;i<5;i++) {
			System.out.println("Enter the no of Marks of Student");
			
			try {
				mark[i]=Integer.parseInt(br.readLine());
								
				tot=tot+mark[i];
				percent =(float)((tot/5));
								
			} 
			
			catch (Exception e) {
				
				e.printStackTrace();
			} 
		
			
		
		
	}
		System.out.println("Total of Student mark is "+tot);
		System.out.println("Percentage of Student mark is "+percent);
		
}
}
