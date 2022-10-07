package TestBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestingCrossBrowser {
	
   WebDriver driver;
	@Test
	@Parameters("browser")
	public void verifyTitle(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}

		else if(browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkrit\\Desktop\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
			driver.get("https://www.springprofessional.lu");
	}
}
