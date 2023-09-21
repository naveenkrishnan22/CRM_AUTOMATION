package maven.brokenlink;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class medge_driver {
	public static WebDriver  driver;
	@SuppressWarnings("unused")
	public static void name() throws InterruptedException {
	
	{
	
			   //This line indicate the browser setup 
			   
			   WebDriver driver = new FirefoxDriver();
			   //enter the keyloack web portal
			   
//			   driver.get("https://qa-digiopsei-nlb-bdc8bb0ee2296a58.elb.ap-southeast-1.amazonaws.com/digiopsiam");
//			   driver.manage().window().maximize();
//			   driver.findElement(By.id("details-button")).click();
//			   Thread.sleep(2000);
//			   driver.findElement(By.id("proceed-link")).click();
//			   driver.navigate().back();
			   
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
			   Thread.sleep(500);
			   
			   //select optional code 
			   WebElement se = driver.findElement(By.xpath("//select"));
			   se.click();
			   Thread.sleep(1000);
			   
			   //this is the selecting optional code 
			   Select select = new Select(se);
			   select.selectByVisibleText("Email Address");
			   driver.findElement(By.xpath("(//input)[2]")).sendKeys("hercules@gmail.com");
			   Thread.sleep(1000);
			   driver.findElement(By.xpath("(//button)[3]")).click();
			   Thread.sleep(1000);
			   
			   //Do horizontal scroll bar 
			   JavascriptExecutor js = (JavascriptExecutor)driver;
			   js.executeScript("window.scrollBy(2000,0)"); 
			   Thread.sleep(2000);
			   
			   driver.findElement(By.xpath("//a[@class='action-icon']")).click();
			   Thread.sleep(2000);
			     
			   //Click the KYC Icon from Navbar 
			   driver.findElement(By.id("ngb-nav-4")).click();
			 	
	           //Vertical Scroll bar 
			   js.executeScript("window.scrollBy(0,3300)");
			   Thread.sleep(3000);
			   //Approved here 
			   // JavascriptExecutor js = (JavascriptExecutor)driver;
//			   
//			   driver.findElement(By.xpath("")).click();
//			   js.executeScript("window.scrollBy(0,2500)");
//			   Thread.sleep(2000);
		       //approved();	
			   driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
			   //these code used to give the permission for CDD maker approval 
			   driver.switchTo().defaultContent();
			   Thread.sleep(2000);
			//   driver.findElement(By.xpath("//textarea")).sendKeys("Approved");
			   Thread.sleep(2000);
			  // driver.findElement(By.xpath("//div//button[.='Save']")).click();
			   js.executeScript("window.scrollBy(0,2500)");
			   Thread.sleep(2000);
		     
			 //   driver.findElement(By.xpath("(//button)[4]")).click();
			  
			   
			   //This element used to User Epass front image 
			   WebElement EpassF = driver.findElement(By.xpath("(//div//a[@class='action-icon'])[1]"));
			   Thread.sleep(1000);
			   EpassF.click();
			   Thread.sleep(2000);
			   driver.switchTo().defaultContent();
			   boolean imh = driver.findElement(By.xpath("(//img)[7]")).isDisplayed();
			  
			   if (imh==true) {
				System.out.println("Epass front image is presented");
			} else {
	            System.out.println("Epass front image isn't presented");
			}
			   //This is the closed button 
			   driver.findElement(By.xpath("(//button)[4]")).click();
			   Thread.sleep(2000);
			   
			   //This element used to check User back image Enable or not
			   WebElement EpassB = driver.findElement(By.xpath("(//a[@class='action-icon'])[2]"));
			   EpassB.click();
			   Thread.sleep(2000);
			   driver.switchTo();
			   boolean EpassBe = driver.findElement(By.xpath("(//img)[7]")).isDisplayed();
			   if (EpassBe==true) {
				System.out.println("Epass back side image is presented ");
			} else {
				System.out.println("Epass back side image isn't presented ");
			}
			   //this is image close button 
			   driver.findElement(By.xpath("(//button)[4]")).click();
			   Thread.sleep(2000);
			   
			   //This code checking User selfie Image presented or not... 
			   WebElement Selfie = driver.findElement(By.xpath("(//a[@class='action-icon'])[3]"));
			   Selfie.click();
			   boolean selfie1 = driver.findElement(By.xpath("(//img)[7]")).isDisplayed();
			   Thread.sleep(2000);
			   driver.switchTo();
			  
			   if (selfie1==true) {
				System.out.println("User selfie image is presented ");
			} else {
				System.out.println("User selfie image isn't presented ");
			}
			   driver.findElement(By.xpath("(//button)[4]")).click();
			   Thread.sleep(1000);
			  
			   driver.close();
	 }
			       	  		   	
	
		// TODO Auto-generated method stub
		
	}
		       
		  

	}


