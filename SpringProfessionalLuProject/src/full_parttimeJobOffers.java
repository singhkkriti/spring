

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class full_parttimeJobOffers {

	@Test
	public void verifyemp()throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkrit\\Desktop\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.springprofessional.lu/en-gb/candidates/job-offers");
		driver.manage().window().maximize();
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	
        List<WebElement> links=driver.findElements(By.xpath("//input[@data-checked='/en-gb/candidates/job-offers?employmenttype=FULLTIME%7c']|//input[@data-checked='/en-gb/candidates/job-offers?employmenttype=PARTTIME%7c']"));

        
        for(int i=0;i<links.size();i++)
        {
        	List<WebElement> links1=driver.findElements(By.xpath("//input[@data-checked='/en-gb/candidates/job-offers?employmenttype=FULLTIME%7c']|//input[@data-checked='/en-gb/candidates/job-offers?employmenttype=PARTTIME%7c']"));
        	WebElement ele=links1.get(i);
           	
        	ele.click();
        	//driver.navigate().refresh();
        	
        	List<WebElement> linkschecked=driver.findElements(By.xpath("//div[@class='panel-collapse collapse in']//span[contains(text(),'Time')]"));
        	WebElement elefull=linkschecked.get(i);
        	String employmentdata=elefull.getText();
        	System.out.println("employment type is  "+employmentdata);
        	System.out.println("size of employment type is  "+linkschecked.size());
        	driver.navigate().refresh();
        	switch(employmentdata)
    		{
        	
    		
    		case"Full Time":
    			 
    		
       List<WebElement>jobdetailslinksfull=driver.findElements(By.xpath("//li[@class='job--meta-contract-type']/span[contains(text(),'Time')]"));
    			
    			System.out.println("size is  "+jobdetailslinksfull.size());
    			for(int j=0;j<jobdetailslinksfull.size();j++)
    			{
    				List<WebElement>jobdetailslinksfull1 =driver.findElements(By.xpath("//li[@class='job--meta-contract-type']/span[contains(text(),'Time')]"));
    				WebElement fullemplomentele=jobdetailslinksfull1.get(i);
            	String fulldata=fullemplomentele.getText();
            	System.out.println("this full time  eploymnet type is "+fulldata);
            		System.out.println("size of full time job is "+ jobdetailslinksfull.size());
            	
    			}
    			
    		case"Part Time":
    			//driver.navigate().refresh();
    			List<WebElement>jobdetailslinksPart =driver.findElements(By.xpath("//li[@class='job--meta-contract-type']/span[contains(text(),'Time')]"));	
    			
    			
    			System.out.println("size is  "+jobdetailslinksPart.size());
    			
    			for(int j=0;j<jobdetailslinksPart.size();j++)
    			{List<WebElement>jobdetailslinksPart1 =driver.findElements(By.xpath("//li[@class='job--meta-contract-type']/span[contains(text(),'Time')]"));
    				
    				WebElement Partemplomentele=jobdetailslinksPart1.get(i);
            	String Partdata=Partemplomentele.getText();
            	System.out.println("this   part time  eploymnet type is "+Partdata);
            		System.out.println("size of full time job is "+ jobdetailslinksPart.size());
            	
    			}
    		}
    			
    				
        	
        	driver.navigate().refresh();
       	((JavascriptExecutor)driver).executeScript("scroll(0,1100)");
    	WebElement btn=driver.findElement(By.xpath("//i[@class='fa fa-refresh']"));
    	if(btn.isDisplayed())
    	{
    		System.out.println("button is  showing");
    	

     // btn.click();


JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", btn);
   
    	driver.navigate().refresh();
    	((JavascriptExecutor)driver).executeScript("scroll(0,1100)");
    			
        
        	
        
	}}}}
