

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class paragraphmatching2 {

	@Test
	public void matchparagrap() throws Exception
	{
		
		String parag="";
		 String data;
		 String exceldata;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkrit\\Desktop\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.springprofessional.lu/en-gb/companies/permanent-recruitment");
	   driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	  List<WebElement>  links=driver.findElements(By.xpath("//main[@id='mainContent']//p"));
	  for(int i=0;i<links.size();i++)
	  {
		  WebElement ele=links.get(i);

//JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
//jsExecutor.executeScript("arguments[0].innerText", ele);

 parag=parag+ele.getText();

}
	  System.out.println(parag);
	  
	  
	

		File src= new File("C:\\Users\\kkrit\\Desktop\\selenium excelfile.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet sheet1 = wb.getSheetAt(1);
		// String data0= sheet1.getRow(0).getCell(0).getStringCellValue();
		// System.out.println("data from excel sheet is "+ data0);
		 int rowcount=sheet1.getLastRowNum();
		 System.out.println("rowcount is "+ rowcount);
		 for(int i=0;i<=rowcount;i++)
		 {
			// System.out.println("data from excel sheet is "+ i);
			data=sheet1.getRow(i).getCell(0).getStringCellValue(); 
			boolean b=parag.contains(data);
			if(b)
			{
				System.out.println( "data is " +i +data);
			}else
			{
				System.out.println( "data is not correct " );
			}
	
	}
		 
	}}
