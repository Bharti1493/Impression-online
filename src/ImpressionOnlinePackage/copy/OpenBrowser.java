package ImpressionOnlinePackage.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
  @Test
  public void browser() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("http://www.impressionsonline.co.in/Quality.aspx");
	  
	  
  }
}
