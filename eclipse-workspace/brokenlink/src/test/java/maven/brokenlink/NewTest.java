package maven.brokenlink;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Test
public class NewTest {
	     //this is the webdriver manager provider to chrome driver 
	   public static WebDriver driver;
  
 //function first 
  public void f1() throws InterruptedException {
	  //This line indicate the browser setup 
	  
	   System.setProperty("webdriver.chrome.driver.", "./driver/C:\\Users\\NaveenKrishnamoorthy\\Downloads\\chromedriver_win32.exe");
	  
	   WebDriver driver = new EdgeDriver();
	   //enter the keyloack web portal
	   
	   driver.get("https://qa-digiopsei-nlb-bdc8bb0ee2296a58.elb.ap-southeast-1.amazonaws.com/digiopsiam");
	   driver.manage().window().maximize();
	   driver.findElement(By.id("details-button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("proceed-link")).click();
	   driver.navigate().back();
	   
	   //Enter the digiops portal 
	   driver.get("http://qa-digiopsei-nlb-bdc8bb0ee2296a58.elb.ap-southeast-1.amazonaws.com/digitalops/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//a)[3]")).click();
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("QACDDMaker");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//input)[2]")).sendKeys("Inypay@123");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//input)[4]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//span)[6]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//span)[8]")).click();
	  
	  
  }
      public void f2() throws InterruptedException {
	  //This line indicate the browser setup 
    	  
    	  System.setProperty("webdriver.gecko.driver.", "./driver/C:/Program Files/Mozilla Firefox.exe");
	   WebDriver driver = new FirefoxDriver();
	   //enter the keyloack web portal
//	   
//	   driver.get("https://qa-digiopsei-nlb-bdc8bb0ee2296a58.elb.ap-southeast-1.amazonaws.com/digiopsiam");
//	   driver.manage().window().maximize();
//	   driver.findElement(By.id("details-button")).click();
//	   Thread.sleep(2000);
//	   driver.findElement(By.id("proceed-link")).click();
//	   driver.navigate().back();
	   
	   //Enter the digiops portal 
	   driver.get("http://qa-digiopsei-nlb-bdc8bb0ee2296a58.elb.ap-southeast-1.amazonaws.com/digitalops/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//a)[3]")).click();
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("QACDDMaker");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//input)[2]")).sendKeys("Inypay@123");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//input)[4]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//span)[6]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//span)[8]")).click();
	  
	  
  }
      public void f3() throws InterruptedException {
	  //This line indicate the browser setup 
	  WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   //enter the keyloack web portal
	   
	   driver.get("https://qa-digiopsei-nlb-bdc8bb0ee2296a58.elb.ap-southeast-1.amazonaws.com/digiopsiam");
	   driver.manage().window().maximize();
	   driver.findElement(By.id("details-button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("proceed-link")).click();
	   driver.navigate().back();
	   
	   //Enter the digiops portal 
	   driver.get("http://qa-digiopsei-nlb-bdc8bb0ee2296a58.elb.ap-southeast-1.amazonaws.com/digitalops/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//a)[3]")).click();
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("QACDDMaker");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//input)[2]")).sendKeys("Inypay@123");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//input)[4]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//span)[6]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//span)[8]")).click();
	   Thread.sleep(2000);
	  
	  
  }
}
