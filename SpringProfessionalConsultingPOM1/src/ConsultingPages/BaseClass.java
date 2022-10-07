package ConsultingPages;
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
	
		 config =new ConfigDatatprovider();
			driver=BrowserFactory.startBrowser(config.BrowserfromConfig(), config.qaUrl());
			
		}
		
	
	//@AfterClass
	//public void tearDown()
	//{
		//BrowserFactory.quitBrowse(driver);
	//}
			
}

