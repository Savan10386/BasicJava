package Javaconcept;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadFileUsingBufferInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File f2= new File("D:\\NewTextFile.txt");
		try {
			FileInputStream f2 = new FileInputStream("D:\\NewTextFile.txt");
			BufferedInputStream br= new BufferedInputStream(f2);
			//br.read();
			while(br.available()>0)
			System.out.print((char)br.read());
								
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
