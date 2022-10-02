import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inputprogramfunction {
	WebDriver driver;
	
	// public inputprogramfunction(WebDriver driver )
	

	//{
		//this.driver=driver;
	//}
	public inputprogramfunction(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver=driver2;
	}
	public void entertext(String txt, String tct)
	{
	 	List<WebElement>links=driver.findElements(By.xpath(txt));
		System.out.println("Total links are"+links.size());
		for( int i=0;i<links.size();i++)
			
		{
			
		List<WebElement> ele =	driver.findElements(By.xpath(txt));

		ele.get(i).sendKeys(tct);
		
			
		}
		
	       
	}
}
