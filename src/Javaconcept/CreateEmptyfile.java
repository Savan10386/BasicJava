package Javaconcept;

import java.io.File;
import java.io.IOException;




public class CreateEmptyfile {

	public static void main(String[] args) throws SecurityException, IOException
	{
		// TODO Auto-generated method stub
		
		try {
		
		File fl = new File("C:\\text.csv");
		
		  	
		  fl.createNewFile();
		  
	
		}
		catch(IOException e)
		{
			System.out.println(e);
			
			e.printStackTrace();
		}

	}

}
