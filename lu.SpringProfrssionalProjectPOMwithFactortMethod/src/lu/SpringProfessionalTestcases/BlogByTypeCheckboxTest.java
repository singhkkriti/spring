package lu.SpringProfessionalTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import lu.SpringProfessionalPages.BaseClass;
import lu.SpringProfessionalPages.BlogPage;

 public class BlogByTypeCheckboxTest extends BaseClass {
	

	
	@Test
	 public void loginApp() {
	     BlogPage blog = PageFactory.initElements(driver, BlogPage.class);
	   blog.clickByTypeCheckbox(driver);                                     

}}


