import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class onebuttonclick{
WebDriver driver;



		
		 onebuttonclick( WebDriver driver)
		 {
		 this.driver = driver;
		 
		
			
		}
		 public void click(String url2) {
		
		 {
				//driver.findElement(By.id(url)).click();
				
				driver.findElement(By.xpath(url2)).click();; 
				
		 }
		
		

}
}


