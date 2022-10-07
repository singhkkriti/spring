package ConsultingTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ConsultingPages.BaseClass;
import ConsultingPages.ConsultingPage;
import utility.ExceldataProvider;

public class ConsultingBrokenLinks extends BaseClass {

	@Test
	 public void loginApp()  {
		
		ExceldataProvider ex =new ExceldataProvider();
		   driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
	    ConsultingPage pg = PageFactory.initElements(driver, ConsultingPage.class);
	    
	   pg.verifyallbrokenlinks(driver);

}

}
