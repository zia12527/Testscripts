package wmb;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class applynow {

	public static WebDriver driver;

	@BeforeClass
	  public void beforeClass() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "/home/nadsoft34/Desktop/chromedriver");
//		  System.setProperty("webdriver.firefox.driver","/home/nadsoft34/Desktop/chromedriver");
		  driver = new ChromeDriver();  
		  driver.manage().window().maximize();
		  driver.get("https://worldmicroblading.com/");
	  }
	@BeforeMethod
	  public void beforeMethod() throws InterruptedException
	  {
			Thread.sleep(1000);
	  }

	  @AfterMethod
	  public void afterMethod() throws InterruptedException 
	  {
			Thread.sleep(1000);
	  }
	@Test
  public void aplynow() throws InterruptedException {
		 System.out.println("Hi test");   
		 Thread.sleep(1000);
		 WebElement element = driver.findElement(By.linkText("GET TRAINED"));
		 Actions action = new Actions(driver);
		 action.moveToElement(element).build().perform();
		 Thread.sleep(100);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/div/div[2]/nav/ul/li[1]/ul/li[2]/a")).click();

		 Thread.sleep(1000);
		 JavascriptExecutor jse2 = (JavascriptExecutor) driver;
         jse2.executeScript("window.scrollBy(0,4500)", "");
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[2]/div/button")).click();
         Thread.sleep(3000);
         JavascriptExecutor jse3 = (JavascriptExecutor) driver;
         jse3.executeScript("window.scrollBy(0,4500)", "");
         Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/section/div/div[14]/div/div/div[3]/div/div[1]/div[4]/div[3]/div/a/img")).click();

  }

}
