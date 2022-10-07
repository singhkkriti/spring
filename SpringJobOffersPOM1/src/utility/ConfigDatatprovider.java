package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDatatprovider {
Properties pro;
	public ConfigDatatprovider()
	{
		File src=new File("./configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("unabel to find file");
			
			
		}
		}
	
	

	public String BrowserfromConfig()
	{ 
		return pro.getProperty("Browser");
		
	}

	public String qaUrl()
	{
		return pro.getProperty("qaUrl");
	}


}
