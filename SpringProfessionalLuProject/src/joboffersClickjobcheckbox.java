

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class joboffersClickjobcheckbox {
	@Test
	public void match()
	{


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkrit\\Desktop\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.springprofessional.lu/en-gb/candidates/job-offers");
	   driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='panel-collapse collapse in']/ul[@class='list-unstyled']/li/div/label[@class='checkbox']/span[@class='facet-loadspinner']//following-sibling::input"));
		  //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 for(int i=0;i<ele.size();i++)
		 {
			 List<WebElement> eleli=driver.findElements(By.xpath("//div[@class='panel-collapse collapse in']/ul[@class='list-unstyled']/li/div/label[@class='checkbox']/span[@class='facet-loadspinner']//following-sibling::input"));
			  //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
			 
			 ((JavascriptExecutor)driver).executeScript(" scroll ( 0,400)");
			
			  WebElement ele1=eleli.get(i);
			  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(ele1.getText());

           ele1.click();
       
               
           ((JavascriptExecutor)driver).executeScript ( " scroll ( 0,700 ) " );
          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            
           WebElement button=driver.findElement(By.xpath("//div[@class='tag--default']//i"));
          
         // WebElement btn=driver.findElement(By.xpath("//div[@class='form-group facetbox']/a[@id='headerAccordionLinkjobcategories']//following::i[@class='fa fa-refresh' ][1]"));
         
           
           button.click();
           driver.navigate().refresh();
           //((JavascriptExecutor)driver).executeScript(" scroll ( 0,600)");
           //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

   		switch (i)
   		
   		{
   		case 5	:
            WebElement showbutton=driver.findElement(By.xpath("//div[@class='panel-collapse collapse in']//a[@onclick='$(this).hide()']"));
           
      
            showbutton.click();
            List<WebElement> elelis=driver.findElements(By.xpath("//div[@class='panel-collapse collapse in']/ul[@class='list-unstyled']/li/div/label[@class='checkbox']/span[@class='facet-loadspinner']//following-sibling::input"));

			  WebElement ele2=elelis.get(i);
            
            ele2.click();}
		 }

        //  driver.navigate().back();
		
}}
