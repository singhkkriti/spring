import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import onebuttonclick.java;

public class candidatepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String line="//a[contains(text(),'En savoir plus')]";
		//String line2="//body[1]/form[1]/div[4]/header[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkrit\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.springprofessional.lu/fr-lu/");
		driver.manage().window().maximize();
       driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	   onebuttonclick onebt=new onebuttonclick(driver);
		 onebt.click("//a[contains(text(),'En savoir plus')]");
		 


	}

}
