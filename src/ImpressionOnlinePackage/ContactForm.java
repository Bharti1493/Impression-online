package ImpressionOnlinePackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContactForm extends OpenBrowser {
  @Test(priority=0)
  public void opencontactForm() throws InterruptedException{
	  driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[3]/ul/li[7]/a")).click();
	  Thread.sleep(3000);
  }
  
  @Test(priority=1)
  public void scrollingThePage() throws InterruptedException {
	  
	  WebElement Element=driver.findElement(By.xpath("//div[@class='col-md-8']"));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView();", Element);
	  Thread.sleep(3000);
	 }
  
  @Test(priority=2)
  public void fillTheForm() throws InterruptedException {
	
	  driver.findElement(By.xpath("//input[@id='cpmain_txtname']")).sendKeys("Bharti Thakur");
  }
  
  @Test(priority=3)
  public void fillPhoneNo()
  {
	  driver.findElement(By.id("cpmain_txtphn")).sendKeys("7018128917");
  }
  @Test(priority=4)
  public void fillemail()
  {
	  driver.findElement(By.xpath("//input[@name='ctl00$cpmain$txtemail']")).sendKeys("93thakurbharti@gmail.com");
  }
  @Test(priority=5)
  public void fillDescription()
  {
	  driver.findElement(By.xpath("//textarea[@id='cpmain_txtmsz']")).sendKeys("Hello my name is Bharti and Iam a software tester");
  }

@Test(priority=6)
public void sendMessageClick() {
	driver.findElement(By.id("cpmain_Button1")).click();
}
@Test(priority=7)
public void alertHandling() {
	Alert alert= driver.switchTo().alert();
	String ActualMessage=alert.getText();
	String ExpectedMessage="Email sent.";
	if(ActualMessage.equals(ExpectedMessage))
	{
		alert.accept();
	}
	else
	{
		System.out.print("Alert message is not same as Expected");
	}
	driver.navigate().back();
	driver.navigate().back();
}
@Test(priority=8)
public void HoverOnProducts() {
	WebElement product= driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/div[3]/ul/li[3]/a"));
	Actions builder= new Actions(driver);
	builder.moveToElement(product).build().perform();
	
}
}
