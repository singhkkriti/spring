import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mouseoverpagecalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path2="//a[contains(text(),'About Us')]";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkrit\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.springprofessional.lu");
		driver.manage().window().maximize();
		 driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		 
		 //mousehoverpage pag  = new mousehoverpage(driver);
		 
	//	pag.callingmousehover(path2);
		 mousehoverpage pag = new mousehoverpage(driver);
		 pag.callingmousehover(path2);

	}

}
