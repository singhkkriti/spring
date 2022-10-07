package JobOffersPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JobOffersPage {
	WebDriver driver;
	

	@FindAll(@FindBy(how=How.XPATH,using = "//input[@data-checked='/en-gb/candidates/job-offers?employmenttype=FULLTIME%7c']|//input[@data-checked='/en-gb/candidates/job-offers?employmenttype=PARTTIME%7c']"))
	 List<WebElement> Full_Part_Time_job;
	

	
	@FindAll(@FindBy(how=How.XPATH,using = "//div[@class='button-container']"))
	 List<WebElement> SeeDetails_Button;

	@FindAll(@FindBy(how=How.XPATH,using = "//span[@data-bind='init, text: JobTitle']"))
	 List<WebElement> Job_Title;

	@FindBy(how=How.XPATH,using = "//a[@id='hypRemoveAll']/i[@class='fa fa-refresh']")
	WebElement RemoveAllButton;
	
	@FindAll(@FindBy(how=How.XPATH,using = "//div[@class='panel-collapse collapse in']//span[contains(text(),'Time')]"))
	 List<WebElement> Employment_Type;
	
	@FindBy(how=How.ID,using="onetrust-accept-btn-handler")
	WebElement cookie_Button;
	
	
	@FindBy(how=How.XPATH,using="//i[@class='fa fa-refresh']")
	WebElement refresh_Button;
	
	@FindBy(how=How.ID,using="ddlpageList")
	WebElement dropDown;

	
	//method to verify results according to Full or Part Time Jobs
	public void verifyResultsCheckboxes(WebDriver driver)
	{
		
		this.driver=driver;
		
		cookie_Button.click();

	        
	        for(int i=0;i<Full_Part_Time_job.size();i++)
	        {
	        	
	        	WebElement ele=Full_Part_Time_job.get(i);
	           	
	        	ele.click();
	        	
	        	
	        	
	        	WebElement elefull=Employment_Type.get(i);
	        	String employmentdata=elefull.getText();
	        	System.out.println("employment type is  "+employmentdata);
	        	System.out.println("size of employment type is  "+Employment_Type.size());
	        	driver.navigate().refresh();
	        	switch(employmentdata)
	    		{
	        	
	    		
	    		case"Full Time":
	    			 
	    			
	    			System.out.println("size is  "+Employment_Type.size());
	    			for(int j=0;j<Employment_Type.size();j++)
	    			{
	    			
	    				WebElement fullemplomentele=Employment_Type.get(i);
	            	String fulldata=fullemplomentele.getText();
	            	System.out.println("this full time  eploymnet type is "+fulldata);
	            		System.out.println("size of full time job is "+ Employment_Type.size());
	            	
	    			}
	    			
	    		case"Part Time":
	    			
	    			
	    			System.out.println("size is  "+Employment_Type.size());
	    			
	    			for(int j=0;j<Employment_Type.size();j++)
	    			{
	    				
	    				
	    				WebElement Partemplomentele=Employment_Type.get(i);
	            	String Partdata=Partemplomentele.getText();
	            	System.out.println("this   part time  eploymnet type is "+Partdata);
	            		System.out.println("size of full time job is "+ Employment_Type.size());
	            	
	    			}
	    		}
	    			
	    				
	        	
	        	driver.navigate().refresh();
	       	((JavascriptExecutor)driver).executeScript("scroll(0,1100)");
	    	
	    	if(RemoveAllButton.isDisplayed())
	    	{
	    		System.out.println("button is  showing");
	    	

	


	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", RemoveAllButton);
	   
	    	driver.navigate().refresh();
	    	((JavascriptExecutor)driver).executeScript("scroll(0,1100)");
	    			
	        
	        	
	        
		}}
	}
	}

