

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class permanentpageFormsValidation {

	@Test
	public void fileinput() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkrit\\Desktop\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.springprofessional.lu/en-gb/companies/permanent-recruitment");
	   driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	   File src= new File("C:\\Users\\kkrit\\Desktop\\selenium excelfile.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet sheet1 = wb.getSheetAt(0);
		
		 int rowcount=sheet1.getLastRowNum();
		

	  List<WebElement>  links=driver.findElements(By.xpath("//div[@class='form-field']/input|//div[@class='form-field email-field']/input|//div[@class='form-field telephone-field']/input"));
	 int icount=links.size();
	 // int c=0;
	  for(int c=0;c<=4;c++)
	  {
		  driver.get("https://www.springprofessional.lu/en-gb/companies/permanent-recruitment");
		 // driver.navigate().refresh();
	 for(int i=0, j=0;i<icount&&j<rowcount;i++,j++)
	 {
		 
		  List<WebElement>  links1=driver.findElements(By.xpath("//div[@class='form-field']/input|//div[@class='form-field email-field']/input|//div[@class='form-field telephone-field']/input"));
       WebElement ele=links1.get(i);
       
		String dataexcel= sheet1.getRow(j).getCell(c).getStringCellValue(); 
		 
		 ele.sendKeys(dataexcel);
	 
	 
	 
			 }	
	 WebElement btn=driver.findElement(By.xpath("//input[@value='Send']"));
				btn.click(); 
	        // c++;
	}
	  //driver.navigate().
	
}}

