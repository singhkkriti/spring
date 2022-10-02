import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickablewebelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tct="https://www.springprofessional.lu/en-gb/about-us/who-is-spring-professional";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkrit\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.springprofessional.lu");
		driver.manage().window().maximize();
		 driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		   webelemts web = new webelemts(driver);
	web.verifyLinkActive(tct);
	}

}
