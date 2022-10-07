package JobOffersTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import JobOffersPages.BaseClass;
import JobOffersPages.JobDomainPage;


public class JobDomainTypeTestCase extends BaseClass {




	@Test
	 public void loginApp()  {

		
	  JobDomainPage pg = PageFactory.initElements(driver, JobDomainPage.class);
	    
	   pg.verifyJobHeader(driver);
	   
}
}
