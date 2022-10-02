

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

public class jobofferstitleMatchedwithcheckedboxText {
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
			 List<WebElement> eleli=driver.findElements(By.xpath("//div[@class='panel-collapse collapse in']/ul[@class='list-unstyled']/li/div/label[@class='checkbox']/span[@class='facet-loadspinner']//following-sibling::span"));
			  //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
			 
			 ((JavascriptExecutor)driver).executeScript(" scroll ( 0,400)");
			
			  WebElement ele1=eleli .get(i);

	             String listdata=ele1.getText();
             ele1.click();
             driver.navigate().refresh();
             System.out.println(listdata);
             
             WebElement eletitl =driver.findElement(By.xpath("//div[@class='col-xs-6']/h1"));
             String titletxt=eletitl.getText();
             System.out.println(titletxt);
           
             
             

             String [ ] toolname = titletxt.split ( "\\| " ) ;
             
                 System.out.println(toolname[1]);
                 String titletxtsplit=toolname[1];
                 if(listdata.equals(titletxtsplit))
                {
               	  System.out.print("data from title is  "+titletxtsplit);
                }
driver.navigate().refresh();
           ((JavascriptExecutor)driver).executeScript ( " scroll ( 0,500 ) " );
         // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         
        
          
          
          
          
           WebElement button=driver.findElement(By.xpath("//a[@id='hypRemoveAll']/i[@class='fa fa-refresh']"));
          
          

JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", button);
          // button.click();
           driver.navigate().refresh();
           //((JavascriptExecutor)driver).executeScript(" scroll ( 0,600)");
           //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
          
		 }

        //  driver.navigate().back();
		
}}
