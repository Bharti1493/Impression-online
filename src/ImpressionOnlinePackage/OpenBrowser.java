package ImpressionOnlinePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.PathWatcher.Config;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenBrowser {
	 public WebDriver driver;
	
  @BeforeSuite
  public void browser() {
	 
	  System.setProperty("webdriver.chrome.driver","E:\\yashDoc\\Data\\WebDrivers\\Chrome\\chromedriver.exe");
driver= new ChromeDriver();
	  driver.get("http://www.impressionsonline.co.in/Quality.aspx");
	   driver.manage().window().maximize(); 
  }
  
  @Test(priority=9)
  public void verifyTitle() {
	  String ExpectedTitle="Impression Online";
	  String ActualTitle=driver.getTitle();
	 if(ExpectedTitle.equals(ActualTitle))
	 {
		 System.out.println("pass");
	 }
	 else
	 {
		 System.out.println("Fail");
	 }
  }
  
  
 /*@AfterSuite
  public void quit() {
	  driver.quit();
  }*/
 
}
