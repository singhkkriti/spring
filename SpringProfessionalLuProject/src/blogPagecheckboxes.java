

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class blogPagecheckboxes {


@Test
public void checktextlinks()
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkrit\\Desktop\\chrome\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.springprofessional.lu/en-gb/blog/listing");
	driver.manage().window().maximize();
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	( ( JavascriptExecutor ) driver ) .executeScript ( " scroll ( 0,300 ) " );
	
	List<WebElement>linkspan=driver.findElements(By.xpath("//div[@class='type__list']//span"));
	List<WebElement>linkinput=driver.findElements(By.xpath("//div[@class='type__list']//input"));
	System.out.println("link size is  " +linkspan.size());
	

	for(int i=0;i<linkspan.size();i++)
	{
		WebElement ele=linkinput.get(i);
		WebElement elespan=linkspan.get(i);
	    String data=elespan.getText();
	    System.out.println("text from list is "+data);
	   ele.click();
	  // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  // driver.navigate().refresh();
	
	  //  List<WebElement> weblist=driver.findElements(By.xpath("//div[@class='listing__result--footer']//span[@data-bind='text: TypeCategory.Title']"));
	
	    for(int j=0;j<5;j++)
	    {
	    	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    	List<WebElement> weblist=driver.findElements(By.xpath("//div[@class='listing__result--footer']//span[@data-bind='text: TypeCategory.Title']"));
	    	WebElement elelist=weblist.get(j);
	    	System.out.println(elelist.getText());
	    	
	    	
}
	    driver.navigate().back();
	    }}}


