package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataProvider {

	XSSFWorkbook wb;
	public ExceldataProvider()
	{
		File src=new File("./TestData/Consulting.xlsx");
		try {
			FileInputStream fis= new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("unable to read excel file");
		}}
	
		public XSSFSheet getSheetdata(int i)
		{
			return wb.getSheetAt(i);
			
		}
		
	}

