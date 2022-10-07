package JobOffersPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JobDomainPage {

	
	WebDriver driver;
	
	@FindAll(@FindBy(how=How.XPATH,using = "//div[@class='panel-collapse collapse in']/ul[@class='list-unstyled']/li/div/label[@class='checkbox']/span[@class='facet-loadspinner']//following-sibling::input"))
	 List<WebElement> Job_Domain_type;
	
	@FindAll(@FindBy(how=How.XPATH,using = "//div[@class='panel-collapse collapse in']/ul[@class='list-unstyled']/li/div/label[@class='checkbox']/span[@class='facet-loadspinner']//following-sibling::span"))
	 List<WebElement> Job_Domain_span;
	
	
	@FindBy(how=How.XPATH,using = "//div[@class='col-xs-6']/h1")
	 WebElement Job_Domain_header;
	
	
	@FindBy(how=How.XPATH,using = "//a[@id='hypRemoveAll']/i[@class='fa fa-refresh']")
	WebElement RemoveAllButton;

	@FindBy(how=How.ID,using="onetrust-accept-btn-handler")
	WebElement cookie_Button;
	
	public void verifyJobHeader(WebDriver driver)
	{
		cookie_Button.click();
		
		 for(int i=0;i<Job_Domain_type.size();i++)
		 {
			
		
			 
			 ((JavascriptExecutor)driver).executeScript(" scroll ( 0,400)");
			
			  WebElement ele1 = Job_Domain_span.get(i);

	        String listdata=ele1.getText();
           ele1.click();
           System.out.println(listdata);
           driver.navigate().refresh();
           System.out.println(listdata);
           
        
           String titletxt=  Job_Domain_header.getText();
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
    
         JavascriptExecutor executor = (JavascriptExecutor)driver;
         executor.executeScript("arguments[0].click();", RemoveAllButton);
                 // button.click();
                  driver.navigate().refresh();
                  //((JavascriptExecutor)driver).executeScript(" scroll ( 0,600)");
                  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                 
         		 }
	}
}
       
      
        
        
        
        
    


	
	
	



