package Javaconcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReaderFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ReadN;
		System.out.println("Enter your name");
		InputStreamReader ip=new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(ip);
		try {
			ReadN=br.readLine();
			System.out.println(ReadN);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
