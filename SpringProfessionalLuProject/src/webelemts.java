import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class webelemts {
	  WebDriver driver;
	
	
	 webelemts (WebDriver driver1)
	 {
		 driver=driver1;
		 
	 }
	 public void verifyallbrokenlinks(String txt)
	 {
		 
		 List<WebElement>links=driver.findElements(By.xpath(txt));
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
	
