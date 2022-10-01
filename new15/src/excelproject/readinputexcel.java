package excelproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readinputexcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src= new File("C:\\Users\\kkrit\\Desktop\\selenium excelfile.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet sheet1 = wb.getSheetAt(0);
		// String data0= sheet1.getRow(0).getCell(0).getStringCellValue();
		// System.out.println("data from excel sheet is "+ data0);
		 int rowcount=sheet1.getLastRowNum();
		 System.out.println("rowcount is "+ rowcount);
		 for(int i=0;i<=rowcount;i++)
		 {
			// System.out.println("data from excel sheet is "+ i);
			 String data= sheet1.getRow(i).getCell(0).getStringCellValue(); 
			 System.out.println("data from excel sheet is "+ data);
			 
		 }
	}
}
			 
			 
			 
			 
			 
			 
			 
			 
			
		 
		 
		 
		




