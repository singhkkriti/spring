package lu.SpringProfessionalPages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import utility.BrowserFactory;
import utility.ConfigDatatprovider;
import utility.ExceldataProvider;

public class BaseClass {
  public WebDriver driver;
 ExceldataProvider excel;
 ConfigDatatprovider config;
 
	@BeforeClass
	public void setup()
		{
			driver=BrowserFactory.startBrowser("chrome", "https://www.springprofessional.lu/en-gb/blog/listing");
			
		}
		
	
	//@AfterClass
	//public void tearDown()
	//{
		//BrowserFactory.quitBrowse(driver);
	//}
			
}

