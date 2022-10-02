

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class full_parttimeTickCheckboxes {

	@Test
	public void verifyemp()throws Exception
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkrit\\Desktop\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.springprofessional.lu/en-gb/candidates/job-offers");
		driver.manage().window().maximize();
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	
       // List<WebElement> links=driver.findElements(By.xpath("//li/div/label[@class='checkbox']/span[contains(text(),'Part-Time')]"));
        List<WebElement> links=driver.findElements(By.xpath("//input[@data-checked='/en-gb/candidates/job-offers?employmenttype=FULLTIME%7c']|//input[@data-checked='/en-gb/candidates/job-offers?employmenttype=PARTTIME%7c']"));

        
        for(int i=0;i<links.size();i++)
        {
        	List<WebElement> links1=driver.findElements(By.xpath("//input[@data-checked='/en-gb/candidates/job-offers?employmenttype=FULLTIME%7c']|//input[@data-checked='/en-gb/candidates/job-offers?employmenttype=PARTTIME%7c']"));
        	WebElement ele=links1.get(i);
        	ele.click();
        	//driver.navigate().back();
        //	WebElement btn=driver.findElement(By.xpath("//i[@class='fa fa-refresh']"));
        	driver.navigate().refresh();
       	((JavascriptExecutor)driver).executeScript("scroll(0,1100)");
    	WebElement btn=driver.findElement(By.xpath("//i[@class='fa fa-refresh']"));
        	if(btn.isDisplayed())
        	{
        		System.out.println("button is  showing");
        	//btn.click();


        JavascriptExecutor executor = (JavascriptExecutor)driver;
       executor.executeScript("arguments[0].click();", btn);
        	}
        	driver.navigate().refresh();
        	((JavascriptExecutor)driver).executeScript("scroll(0,1100)");
        }
        
	}}
