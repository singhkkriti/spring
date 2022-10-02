import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mousehoverpage {
	WebDriver driver;
	
	mousehoverpage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	//public mousehoverpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		//this.driver=driver2;
		
	//}
	public void callingmousehover(String path)
	{
		
		WebElement ele=driver.findElement(By.xpath(path));
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(ele).perform();
	}

}
