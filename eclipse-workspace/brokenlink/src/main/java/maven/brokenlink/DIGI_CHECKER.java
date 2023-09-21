package maven.brokenlink;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DIGI_CHECKER {
	
	
		 public static WebDriver driver;
		   public static void main(String[] args) throws InterruptedException {
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
			   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("QACDDChecker");
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
			   driver.findElement(By.xpath("(//input)[2]")).sendKeys("hercules@gmail.com"
			   		+ "");
			   Thread.sleep(1000);
			   driver.findElement(By.xpath("(//button)[3]")).click();
			   Thread.sleep(1000);
			   
			   //Do horizontal scroll bar 
			   JavascriptExecutor js = (JavascriptExecutor)driver;
			   js.executeScript("window.scrollBy(2500,0)"); 
			   Thread.sleep(2000);
			   
			   
			   //This script used to click a action icon 
			   driver.findElement(By.xpath("//a[@class='action-icon']")).click();
			   Thread.sleep(2000);
			   
			  //THIS CODE USED FOR FINDING USER NAME AND PRINT THE USER NAME ....
			  String username = driver.findElement(By.xpath("(//div[@class=\"mb-3\"])[1]")).getText();
			  if (username==null) {
				     System.out.println("User name not present");
			} else {
				 System.out.println("This is the User name:"+username);

			}
			  js.executeScript("window.scrollBy(0,3000)");
			  
			  //THIS CODE USED FOR FINDING  A EMAILID AND PRINT A EMAIL ID 
			  String emailid = driver.findElement(By.xpath("(//h4)[14]")).getText();
			  if (emailid==null) {
				System.out.println("User not given mobile number");
			} else {
                System.out.println("This is user mobile number:"+emailid);
			}
			  
			//this is the first name finder code 
			String firstnamer = driver.findElement(By.xpath("(//div[@class='mb-3'])[2]")).getText();
			if (firstnamer==null) {
				System.out.println("FIRST NAME IS NOT PRESENT");
			} else {
				System.out.println("FIRST NAME IS PRESENT : "+firstnamer);
			}
			
			//THIS CODE FIND FOR A PHONE NUMBER CODE 
			String mobilenumber = driver.findElement(By.xpath("//div//input[@id='mobile-number']")).getText();
		
			if (mobilenumber==null) {
				System.out.println("USER MOBILENUMBER NOT PRESENTED IN DIGIOPS PORTAL  : ");
			} else {
				
				System.out.println("THIS IS THE USER MOBILE NUMBER: "+mobilenumber);
			}
			
			//THIS CODE FINDED FOR A EXTERNAL ID 
			String EXTERNAL_ID = driver.findElement(By.xpath("(//div[@class='mb-3'])[4]")).getText();
			if (EXTERNAL_ID==null) {
				System.out.println("USER EXTERNAL ID NOT PRESENTED IN DIGIOPS PORTAL : ");
				
			} else {
				System.out.println("THIS IS USER EXTERNAL ID :"+EXTERNAL_ID);	
			}
			//THIS CODE FOR  FINDING A DATE OF BIRTH
			String DOB = driver.findElement(By.xpath("(//div//h4[@class='mb-1'])[5]")).getText();
			if (DOB==null) {
				System.out.println("USER DOB NOT PRESENTED IN DIGIPORTAL : ");
				
			} else {
				System.out.println("THIS IS USER DOB :"+DOB);	
			}
			
			//THIS CODE FIND OUT THE MARITAL STATUS 
			String MARITAL = driver.findElement(By.xpath("(//div//h4[@class='mb-1'])[5]")).getText();
			if (MARITAL==null) {
				System.out.println("USER MARITAL STATUS IS NOT PRESENT IN THE DIGI: ");
				
			} else {
				System.out.println("THIS IS USER MARITAL STATUS :"+MARITAL);	
			}
			
			// THIS CODE FIND OUT THE 
			String CREATEDATE = driver.findElement(By.xpath("(//div//h4[@class='mb-1'])[8]")).getText();
			if (CREATEDATE==null) {
				System.out.println("USER CREATE DATE  IS NOT PRESENT IN THE DIGI: ");
				
			} else {
				System.out.println("THIS IS USER CREATED DATE :"+CREATEDATE);	
			}
			
			//THIS CODE FINDOUT THE ONBOARDING TYPE 
			
			String ONBOARDING_TYPE = driver.findElement(By.xpath("(//div//h4[@class='mb-1'])[9]")).getText();
			if (ONBOARDING_TYPE==null) {
				System.out.println("USER ONBOARDING TYPE  IS NOT PRESENT IN THE DIGI: ");
				
			} else {
				System.out.println("THIS IS USER ONBOARDING TYPE  :"+ONBOARDING_TYPE);	
			}
//			   //Click the KYC Icon from Navbar 
//			   driver.findElement(By.id("ngb-nav-4")).click();
//			   
//			   //Vertical Scroll bar 
//			   js.executeScript("window.scrollBy(0,4000)");
//			   Thread.sleep(2000);
			   
			  
			   
	}

}
