package JobOffersTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import JobOffersPages.BaseClass;
import JobOffersPages.JobOffersPage;

import utility.ExceldataProvider;

public class ResultsFullPartTimeTickCheckboxes extends BaseClass  {

	@Test
	 public void loginApp()  {
		
		ExceldataProvider ex =new ExceldataProvider();
		
	  JobOffersPage pg = PageFactory.initElements(driver, JobOffersPage.class);
	    
	   pg.verifyResultsCheckboxes(driver);
	   
}}

