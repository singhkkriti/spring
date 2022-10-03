

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class joboffersDropdownmatchwithjobs {
	@Test
	  public void click()
	  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkrit\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.springprofessional.lu/en-gb/candidates/job-offers");
		driver.manage().window().maximize();
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		
		
		WebElement valuedrop=driver.findElement(By.id("ddlpageList"));
		Select sel=new Select(valuedrop);
	    sel.selectByVisibleText("10");
	   
	    
	    List<WebElement>links1=sel.getOptions();
	    System.out.println("links are"+  links1.size());
	    
	    
	   
	    WebElement dropelement = sel.getFirstSelectedOption();
		int count=Integer.parseInt(dropelement.getText());
		
		
		//verify whether results are displayed according to dropdown
		//List<WebElement>links=driver.findElements(By.xpath("//a[@class='btn btn-sm btn-success pull-right']"));
		//List<WebElement>links=driver.findElements(By.xpath("//div[@class='row']/div[@class='button-container']/a[@class='btn btn-sm btn-success pull-right']"));
	
		//List<WebElement>links=driver.findElements(By.xpath("//div/a/span[text()='JobTitle']"));
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement>links=driver.findElements(By.xpath("//div[@class='button-container']"));
		
		
		
		//int i= links.size();
		
			
		System.out.println("dropdown value is matching with number of jobs"  + links.size());
		for(int i = 0;i<links.size();i++)
			
		{
		
		    
			WebElement ele=links.get(i);
			
			
			System.out.println("dropdown value is matching with number of jobs " + ele.getText());}
		
		//if(count.equals(Integer.parseInt(links.get(i)).toInteger)))
		//{
			//System.out.println("dropdown value is matching with number of jobs"  + links);
		//}
		
		System.out.println("dropdown value is matching with number of jobs"  + count);
		//assert.assertEquals(count,i,"result is  fine")
			
		    
			
			
			
		                             
	driver.close();	             
		
	}
	}





