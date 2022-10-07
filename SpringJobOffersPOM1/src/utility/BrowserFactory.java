package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	  static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String appUrl)
	{
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			
			
		}else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
		}else {
			System.out.println("We do not support thid driver");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	public static void quitBrowse(WebDriver driver)
	{
		driver.quit();
	}
}
