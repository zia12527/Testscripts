package cos;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demo {
public static WebDriver driver;
	
	@BeforeClass
	public <driver> void setUp() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/home/nadsoft34/Desktop/chromedriver");
		driver = new ChromeDriver();  
		driver.manage().window().maximize();
        driver.get("https://offers.tradingtips.com/coreg");
        driver.findElement(By.xpath("//*[@id=\"coreg-email\"]")).sendKeys("manoj@nadsoftdev.com");
    	 driver.findElement(By.xpath("//*[@id=\"user-password\"]")).sendKeys("nadsoft123");
    	 Thread.sleep(100);
   /* 	 WebDriverWait wait = new WebDriverWait(driver, 100);
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
   */	 
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[3]/div/button")).submit();
       
	}
	
	  @Test (priority = 0) 
  public void publisher() throws InterruptedException 
  {
	 System.out.println("Login successfull");
     
     WebDriverWait wait = new WebDriverWait(driver, 100);
 	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[3]/a/span[1]")));
     
 	 // Click on pub
 	 driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[3]/a/span[1]")).click();
     Thread.sleep(3000);
     //add new publisher
     driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[3]/ul/li[2]/a")).click();
     Thread.sleep(2000);
     //first name 
     driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/form/div[1]/input")).sendKeys("publisher new 01");
     //last name 
     driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/form/div[2]/input")).sendKeys("nadsoft");
     //email
     driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/form/div[3]/input")).sendKeys("nadsoft.tes55t01@gmail.com");
     //password
     driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("nadsoft123");
     //password
     driver.findElement(By.xpath("//*[@id=\"cpwd\"]")).sendKeys("nadsoft123");
     
     Thread.sleep(15000);
     //register
     driver.findElement(By.partialLinkText("Register")).submit();
                                     
  }
  
  @Test (priority = 1) 
  public void advertiser() throws InterruptedException 
  {
	  // Click on adv
	 	 driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[4]/a")).click();
	     Thread.sleep(3000);
	     //add new publisher
	     driver.findElement(By.xpath("/html/body/div[1]/aside[1]/section/ul/li[4]/ul/li[2]/a")).click();
	     Thread.sleep(2000);
	     //first name 
	     driver.findElement(By.xpath("//*[@id=\"offertitle\"]")).sendKeys("advertiser new 01");
	     //last name 
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[2]/input")).sendKeys("nadsoft");
	     //email
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[3]/input")).sendKeys("nadsoft.test01@gmail.com");
	  // mob
	     driver.findElement(By.xpath("//*[@id=\"phonenumber\"]")).sendKeys("7020903936");
	     //country
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[5]/input")).sendKeys("india");
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[6]/input")).sendKeys("pune");
	     driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/form/div[7]/input")).sendKeys("411001");
	     driver.findElement(By.xpath("//*[@id=\"Advertiser\"]")).submit();
  }
  
}
