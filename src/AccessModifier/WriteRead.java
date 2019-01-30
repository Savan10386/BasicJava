package AccessModifier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.google.common.collect.Table.Cell;

public class WriteRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	String	Filepath="C:\\Users\\savan\\Desktop\\";
	String FileName="Test.xlsx";
	String SheetName="Test";
		
	WriteRead wr = new WriteRead();
	
	 wr.readExcel(Filepath, FileName, SheetName);
	
			
	}

	
	public  void readExcel(String Filepath,String FileName,String SheetName) throws IOException
	
	
	{
	
		Workbook wb=null;
		
		File file = new File(Filepath+FileName);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		String FileAfterExtension= FileName.substring(FileName.indexOf("."));
		
		   if(FileAfterExtension.equals(".xlsx"))
		   {
			  wb =  new XSSFWorkbook(inputStream);
		   }
		   
		   else if(FileAfterExtension.equals(".xls"))
		   {
			   wb = new  HSSFWorkbook(inputStream);
		   }
		   
		     org.apache.poi.ss.usermodel.Sheet st  =  wb.getSheet(SheetName);
		     
		   int n=  st.getLastRowNum()-st.getFirstRowNum();
		   
		   System.out.println(n);
		   
		 
	
	     for(int i=0; i<n+1;i++)
	 {
	    	Row row= st.getRow(i);
	    	
	      	
	    	//Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
	            
	           
	        }
	        
	       

		 
	 }
	     
	     Row row=st.getRow(0);
	     
	    Row newrow=st.createRow(n+1);
	    
	    System.out.println(row.getLastCellNum());
	    
	    
	    
	    for(int j = 0; j <row.getLastCellNum(); j++)
	    {

	        //Fill data in row

	        org.apache.poi.ss.usermodel.Cell cell = newrow.createCell(j);

	        cell.setCellValue(row.getCell(j).getStringCellValue());

	    }
	    
	    //Close input stream

	    inputStream.close();

	    //Create an object of FileOutputStream class to create write data in excel file

	    FileOutputStream outputStream = new FileOutputStream(file);

	    //write data in the excel file

	    wb.write(outputStream);
	    

	    //close output stream

	    outputStream.close();
	
	             
	}
	
	
		
	}

