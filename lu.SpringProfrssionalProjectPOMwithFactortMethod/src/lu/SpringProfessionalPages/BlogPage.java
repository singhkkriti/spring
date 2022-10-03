package lu.SpringProfessionalPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class BlogPage  {

	WebDriver driver;
	
	//@FindAll(@FindBy(how=How.XPATH,using = "//div[@class='type__list']//span"))
	 //List<WebElement> linkspan;

	@FindBys(@FindBy(how=How.XPATH,using = "//div[@class='type__list']//span"))
	 List<WebElement> linkspan;
	
	@FindAll(@FindBy(how=How.XPATH,using = "//div[@class='type__list']//input"))
	 List<WebElement> linkinput;
	
	@FindAll(@FindBy(how=How.XPATH,using="//div[@class='listing__result--footer']//span[@data-bind='text: TypeCategory.Title']"))
	 List<WebElement> webList;
	@FindBy( how=How.ID,using="onetrust-accept-btn-handler")
	WebElement btn;
	
	public void clickByTypeCheckbox(WebDriver driver)
	{   btn.click();
	( ( JavascriptExecutor ) driver ) .executeScript ( " scroll ( 0,300 ) " );
		System.out.println(webList.size());
		 
		for(int i=0;i<linkspan.size();i++)
		{
			WebElement ele=linkinput.get(i);
			WebElement elespan=linkspan.get(i);
		    String data=elespan.getText();
		    System.out.println("text from list is "+data);
		   ele.click();
		
		   
		   for(int j=0;j<5;j++)
		    {
		    	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    	//List<WebElement> weblist=driver.findElements(By.xpath("//div[@class='listing__result--footer']//span[@data-bind='text: TypeCategory.Title']"));
		    	   
		    	   
		    	   WebElement elelist=webList.get(j);
		    	System.out.println(elelist.getText());
		    	
		    	
	}
		    driver.navigate().back();
	}
		
		
	}
}
