package generic_scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements Framework {
     
	   public WebDriver driver;
	   @BeforeMethod
	   public void open()
	   {
		   System.setProperty(key, value);
		   driver=n
				   
				   
				   ew FirefoxDriver();
		   driver.get(url);
		   
	   }
	   @AfterMethod
	   public void close(ITestResult result) throws IOException
	   {
		   if(ITestResult.FAILURE==result.getStatus())
		   {
			   photo.pic(driver);
		   }
		  
			   driver.close();
		   
	   }
}
