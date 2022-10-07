package ConsultingPages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utility.ExceldataProvider;

public class ConsultingPage {
	WebDriver driver;

	@FindAll(@FindBy(how=How.XPATH,using = "//main[@id='mainContent']//p|//main[@id='mainContent']//h1|//main[@id='mainContent']//h2"))
	 List<WebElement> paragraph;
	
	@FindAll(@FindBy(how=How.XPATH,using = "//div[@class='form-field']/input|//div[@class='form-field email-field']/input|//div[@class='form-field telephone-field']/input"))
	 List<WebElement> inputList;
	
	@FindBy(how=How.XPATH,using="//input[@value='Send']")
	WebElement send_Button;
	
	

	String parag="";
	String data;
	String exceldata;
	//WebTextMatch method
	public void matchParagraphtext(XSSFSheet sht) {
		
		
		
		 
		  for(int i=0;i<paragraph.size();i++)
		  {
			  WebElement ele=paragraph.get(i);


	          parag=parag+ele.getText();
		  }
		  
		  System.out.println(parag);
		
		 
		  
			 XSSFSheet sheet1 = sht;
			
			 int rowcount=sheet1.getLastRowNum();
			 
			
			 for(int j=0;j<=rowcount;j++)
			 {
				data=sheet1.getRow(j).getCell(0).getStringCellValue(); 
				boolean b=parag.contains(data);
				if(b)
				{
					System.out.println( "data is " +data);
				}else
				{
					System.out.println( "incorrect data " +data);
				}
			 
		}
			 
		
		
	
}
	//validateformsmethod
	public void validateforms(WebDriver driver,XSSFSheet shtexl) {
		
		 XSSFSheet sheet2 = shtexl;
	this.driver=driver;
			
		 int rowcount=sheet2.getLastRowNum();
		

	  List<WebElement>  links=driver.findElements(By.xpath("//div[@class='form-field']/input|//div[@class='form-field email-field']/input|//div[@class='form-field telephone-field']/input"));
	 int icount=links.size();
	 //intc=0;
	  for(int c=0;c<=4;c++)
	  {
		  driver.get("https://www.springprofessional.lu/en-gb/companies/permanent-recruitment");
		 // driver.navigate().refresh();
	 for(int i=0, j=0;i<icount&&j<rowcount;i++,j++)
	 {
		 
		  List<WebElement>  links1=driver.findElements(By.xpath("//div[@class='form-field']/input|//div[@class='form-field email-field']/input|//div[@class='form-field telephone-field']/input"));
       WebElement ele=links1.get(i);
       
		String dataexcel= sheet2.getRow(j).getCell(c).getStringCellValue(); 
		 
		 ele.sendKeys(dataexcel);
	 
	 
	 
			 }	
	 WebElement btn=driver.findElement(By.xpath("//input[@value='Send']"));
				btn.click(); 
	        // c++;
	}
}
	//verifybroeknlinks method
	 public void verifyallbrokenlinks(WebDriver driver)
	 {
		 this.driver=driver;
		 
		 List<WebElement>links=driver.findElements(By.xpath("//a"));
			System.out.println("Total links are"+links.size());
			for(int i = 0;i<links.size();i++)
			{
			
			    
				WebElement ele=links.get(i);
				 String url="";
				
				
			                             
			                             
			   
			                             
			     url=""+ele.getAttribute("href");
			    verifyLinkActive(url);
			}

		}
		public static void verifyLinkActive(String linkUrl)
				{
				    try
				    {
				                                                
				       URL url=new URL(linkUrl);
				       HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
				       httpURLConnect.setConnectTimeout(3000);
				       httpURLConnect.connect();
				                                                                              
				        
				       if(httpURLConnect.getResponseCode()== 200)
				       {
				           System.out.println(linkUrl+""+httpURLConnect.getResponseMessage());
				       }
				           if(httpURLConnect.getResponseCode()== HttpURLConnection.HTTP_NOT_FOUND)
				        		   {
				        		        System.out.println(linkUrl+""+httpURLConnect.getResponseMessage()+"-"+HttpURLConnection.HTTP_NOT_FOUND);
				        		    }}
				        		   catch(Exception e){
				        		   }
				        		   
				        		   
			
	 }
	 
	 
	
}



