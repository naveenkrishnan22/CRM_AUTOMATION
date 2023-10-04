package maven.brokenlink;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMDIGI {
	public WebDriver driver;
	
  @SuppressWarnings("deprecation")
@Test
  public void f() throws InterruptedException {

	   //This line indicate the browser setup 
	  
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   //enter the keyloack web portal
	   
	   driver.get("https://qa-digiopsei-nlb-bdc8bb0ee2296a58.elb.ap-southeast-1.amazonaws.com/digiopsiam");
	   driver.manage().window().maximize();
	   driver.findElement(By.id("details-button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("proceed-link")).click();
	   long starTime = System.currentTimeMillis();
	   driver.navigate().to("http://qa-digiopsei-nlb-bdc8bb0ee2296a58.elb.ap-southeast-1.amazonaws.com/digitalops/");
	   long endTime = System.currentTimeMillis();
	    long pageLoadtime = starTime-endTime;
	    System.out.println(" THIS IS THE LOADING TIME : "+pageLoadtime);
	   //Enter the digiops portal 
	  // driver.get("http://qa-digiopsei-nlb-bdc8bb0ee2296a58.elb.ap-southeast-1.amazonaws.com/digitalops/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//a)[3]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("QACDDMaker");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//input)[2]")).sendKeys("Inypay@123");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//input)[4]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//span)[6]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//span)[8]")).click();
	  
	   
	   //select optional code 
	   Thread.sleep(1500);
	   WebElement se = driver.findElement(By.xpath("//select"));
	   se.click();
	   Thread.sleep(1000);
	   
	   //this is the selecting optional code 
	   Select select = new Select(se);
	   select.selectByVisibleText("Email Address");
	   driver.findElement(By.xpath("(//input)[2]")).sendKeys("suldha@gmail.com");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//button)[3]")).click();
	   Thread.sleep(1000);
	   
	   //Do horizontal scroll bar 
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(2000,0)"); 
	   Thread.sleep(2000);
	   
	   //this code CLICK  ON "search button"
	   driver.findElement(By.xpath("//a[@class='action-icon']")).click();
	   Thread.sleep(2000);
	     
	   //Click the KYC Icon from Navbar 
	   driver.findElement(By.id("ngb-nav-4")).click();
	 	
      //Vertical Scroll bar 
//	   js.executeScript("window.scrollBy(0,3300)");
//	   Thread.sleep(3000);

	   
 
	   js.executeScript("window.scrollBy(0,2500)");
	 
       //This element used to User Epass FRONT image 
	   Thread.sleep(2000);
	   WebElement EpassF = driver.findElement(By.xpath("(//div//a[@class='action-icon'])[1]"));
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
	   //This code checking User selfie Image presented or not... 
	   Thread.sleep(2000);
	   WebElement Selfie = driver.findElement(By.xpath("(//*[@id=\"view\"])[3]"));
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
	   
	   	   
 //THESE CODE USED TO GIVE THE PERMISSION OF CDD MAKER 
   driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
   driver.switchTo().defaultContent();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//textarea")).sendKeys("Approved");
   Thread.sleep(2000);
   driver.findElement(By.xpath("//div//button[.='Save']")).click();
   
	               
	   System.out.println(" ***** CHEERS CDD MAKER IS COMPLETED ***** ");
	   
	   
	   
	   //THIS CODE TO USE LOGOUT AFTER ENTER THE ANOTHER ROLE WISH  OUR SELF
	   Thread.sleep(2000);
	   //click a myaccount logout button is clicked 
	   driver.findElement(By.xpath("(//span[@class='account-position'])[1]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.cssSelector(".dropdown-item.notify-item[href='javascript:void(0)']")).click();
	   Thread.sleep(2000);
	   //click a login button....
	   driver.findElement(By.xpath("//b[normalize-space()='Log In']")).click();
	   Thread.sleep(2000);
	   //return login into the CRM portal in digiops ...
	   driver.findElement(By.xpath("//*[@id=\"homenav\"]/div/div/div/div[4]/a")).click();
	   Thread.sleep(2000);
	   
	   
	   //THESE CODE ARE USED TO ENTER THE CDD CHECKER LOGIN PORTAL ...IN CRM 
	   
	   Thread.sleep(2000);
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
	   Thread.sleep(2000);
	   WebElement se1 = driver.findElement(By.xpath("//select"));
	   se1.click();
	   Thread.sleep(1000);
	   
	   //this is the selecting optional code 
	   Select select1 = new Select(se1);
	   select1.selectByVisibleText("Email Address");
	   driver.findElement(By.xpath("(//input)[2]")).sendKeys("suldha@gmail.com");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//button)[3]")).click();
	   Thread.sleep(1000);
	   
	   //Do horizontal scroll bar 
	   JavascriptExecutor js1 = (JavascriptExecutor)driver;
	   js1.executeScript("window.scrollBy(2500,0)"); 
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
	 // js.executeScript("window.scrollBy(0,3000)");
	  Thread.sleep(2000);
	  
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
	   Thread.sleep(2000);
	
	   driver.findElement(By.xpath("//*[@id=\"ngb-nav-4\"]")).click();
	   Thread.sleep(2000);																				
	   js.executeScript("window.scrollBy(0,200)");																																																																																																																																																																												
	   																																	
	   
	   //THESE CODE USED TO CDD CHECKER  APPROVED A NEW USER IN CRM PORTAL .....																																																																										
	   																																											
	   																						
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//textarea")).sendKeys("Approved");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div//button[.='Save']")).click();
	   
	   
	   
	   System.out.println(" ***** CHEERS CDD CHECKER IS COMPLETED *****");
	   Thread.sleep(2000);
	   
	   
	   //THIS CODE TO USE LOGOUT AND LOGIN THE NEXT ROLE  .....
	   Thread.sleep(2000);
	   //click a myaccount logout button is clicked 
	   driver.findElement(By.xpath("(//span[@class='account-position'])[1]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.cssSelector(".dropdown-item.notify-item[href='javascript:void(0)']")).click();
	   Thread.sleep(2000);
	   //click a login button....
	   driver.findElement(By.xpath("//b[normalize-space()='Log In']")).click();
	   Thread.sleep(2000);
	   //return login into the CRM portal in digiops ...
	   driver.findElement(By.xpath("//*[@id=\"homenav\"]/div/div/div/div[4]/a")).click();
	   Thread.sleep(2000);
	   
	   
	   
	   //THIS IS A UNDERWRITING MAKER AUTOMATED CODE 
	    
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("QAUWMaker");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//input)[2]")).sendKeys("Inypay@123");
	   
	   //this code find out the signin button 
	   driver.findElement(By.xpath("//div//input[@name='login']")).click();
	   
	   //this code findout the "underwriting" button 
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//li//a//span)[3]")).click();
	   Thread.sleep(2000);
	   //this line find out the facility underwriting button 
	   driver.findElement(By.xpath("(//li//a)[3]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	   
	   //select option  for verifypending this xpath sometime is not working we will retify the data also 
	             driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	              WebElement verify = driver.findElement(By.xpath("(//select[@id='search-select'])[1]"));
	              Thread.sleep(2000);
	              Select select3 = new Select(verify);
	              select3.selectByVisibleText("VERIFICATIONPENDING");
	              Thread.sleep(2000);
        //this code filter the user UW status 
	              Thread.sleep(2000);
                  driver.findElement(By.xpath("/html/body/app-root/app-private-layout/app-vertical-layout/div/div/div/div/app-loanunderwriting/div/div/div/div/div[2]/div/div[3]/button")).click();
                  Thread.sleep(2000);
        //this code select        
                  driver.switchTo().defaultContent();
                 WebElement selec = driver.findElement(By.xpath("(//div//select[@name='searchcombo'])[2]"));
                 selec.click();
         //select the option from 
                 Select selt= new Select(selec);
                 selt.selectByVisibleText("Email Address");
                 Thread.sleep(2000);
         //enter the value in search box ..
                WebElement vale = driver.findElement(By.xpath("//input[@name='searchTerm']"));
                 vale.click();
                 vale.sendKeys("suldha@gmail.com");
                 Thread.sleep(1000);
         //click a "Search button"        
                 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
                 
               //click under writing action button 
                 Thread.sleep(2000);
                 driver.findElement(By.xpath("//a[@class=\"action-icon\"]")).click();
                 Thread.sleep(1000);
                 driver.switchTo().defaultContent();
               //Do horizontal scroll bar 
                 Thread.sleep(2000);
                 JavascriptExecutor js2 = (JavascriptExecutor)driver;
    			   js2.executeScript("window.scrollBy(200,document.body.scrollWidth)"); 
    			   Thread.sleep(2000);
                 driver.findElement(By.xpath("(//div[@class='row'])[5]")).click();
//                 //CLICK A KYC DETAILS  .....
//                 Thread.sleep(2000);
//                 driver.findElement(By.xpath("//*[@id=\"ngb-nav-7\"]")).click();
//                 Thread.sleep(2000);
//                 
//                 JavascriptExecutor js = (JavascriptExecutor)driver;
//                 js.executeScript("window.scrollBy(0,1000)");
//                 Thread.sleep(2000);
                 
//          
                 
                  //THIS LINE CODE USED TO CLICK A ACTION ICON...
                 
                  Thread.sleep(2000);
                  WebElement fac = driver.findElement(By.xpath("(//span[@id='next-icon'])[1]"));
                  Thread.sleep(2000);
                  fac.click();
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//*[@id=\"ngb-nav-2\"]")).click();
                  Thread.sleep(2000);
                  WebElement sel = driver.findElement(By.xpath("//*[@id=\"uw-status\"]"));
                  Thread.sleep(2000);
                  Select s= new Select(sel);
                  s.selectByVisibleText("MUWAPPROVED");
                  Thread.sleep(2000);
//                  WebElement hey = driver.findElement(By.xpath(" (//input[@name='user-file'])[1]"));
//                  driver.switchTo();
//                  hey.click();
//                  Thread.sleep(2000);
                  WebElement uplo = driver.findElement(By.xpath("(//input[@name='user-file'])[1]"));
                  uplo.sendKeys("C:\\Users\\NaveenKrishnamoorthy\\OneDrive - INY FINANCIAL PTE LTD\\Documents\\Notes\\Notepad\\pgadmin.txt");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("(//textarea[@name='uw-remark'])[1]")).sendKeys(" *** I LIKE TO MOVE A NEXT LEVEL SO I AM GET THE LOAN FROM INYPAY *** ");
                  Thread.sleep(2000);
                  JavascriptExecutor js3 = (JavascriptExecutor)driver;
                  js3.executeScript("window.scrollBy(0,200)");
                  Thread.sleep(2000);
                  WebElement sem = driver.findElement(By.xpath("(//*[@id=\"customCheckcolor2\"])[1]"));
                  sem.click();
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
                  
                  
                  //THIS CODE TO USE LOGOUT AND LOGIN THE NEXT ROLE  .....
           	   //click a myaccount logout button is clicked 
               Thread.sleep(2000);
           	   driver.findElement(By.xpath("(//span[@class='account-position'])[1]")).click();
           	   Thread.sleep(2000);
           	   driver.findElement(By.cssSelector(".dropdown-item.notify-item[href='javascript:void(0)']")).click();
           	   Thread.sleep(2000);
           	   //click a login button....
           	   driver.findElement(By.xpath("//b[normalize-space()='Log In']")).click();
           	   Thread.sleep(2000);
           	   //return login into the CRM portal in digiops ...
           	   driver.findElement(By.xpath("//*[@id=\"homenav\"]/div/div/div/div[4]/a")).click();
           	   Thread.sleep(2000);
                  
                  
                  
                  
                  //THESE CODE USED TO APPROVED THE UNDER WRITING CHECKER APPROVED 
//                  
//                  WebElement se3 = driver.findElement(By.xpath("//*[@id=\"uw-status\"]"));
//                  Thread.sleep(2000);
//                  Select s1= new Select(se3);
//                  s1.selectByVisibleText("MUWAPPROVED");
//                  Thread.sleep(2000);
////                  WebElement hey = driver.findElement(By.xpath(" (//input[@name='user-file'])[1]"));
////                  driver.switchTo();
////                  hey.click();
////                  Thread.sleep(2000);
//                  WebElement uplo1 = driver.findElement(By.xpath("(//input[@name='user-file'])[1]"));
//                  uplo1.sendKeys("C:\\Users\\NaveenKrishnamoorthy\\OneDrive - INY FINANCIAL PTE LTD\\Documents\\Notes\\Notepad\\pgadmin.txt");
//                  Thread.sleep(2000);
//                  driver.findElement(By.xpath("(//textarea[@name='uw-remark'])[1]")).sendKeys(" *** I LIKE TO MOVE A NEXT LEVEL SO I AM GET THE LOAN FROM INYPAY   *** ");
//                  Thread.sleep(2000);
//                  js.executeScript("window.scrollBy(0,200)");
//                  Thread.sleep(2000);
//                  WebElement sem1 = driver.findElement(By.xpath("(//*[@id=\"customCheckcolor2\"])[1]"));
//                  sem1.click();
//                  Thread.sleep(2000);
//                  driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
//                  Thread.sleep(2000);
//                  
                  

       		   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("QAUWChecker");
       		   Thread.sleep(2000);
       		   driver.findElement(By.xpath("(//input)[2]")).sendKeys("Inypay@123");
       		   
       		   //this code find out the signin button 
       		   driver.findElement(By.xpath("//div//input[@name='login']")).click();
       		   
       		   //this code findout the "underwriting" button 
       		   Thread.sleep(2000);
       		   driver.findElement(By.xpath("(//li//a//span)[3]")).click();
       		   Thread.sleep(2000);
       		   //this line find out the facility underwriting button 
       		   driver.findElement(By.xpath("(//li//a)[3]")).click();
       			driver.switchTo().defaultContent();
       			Thread.sleep(2000);
       		   
       		   //select option  for verifypending this xpath sometime is not working we will retify the data also 
       		              Thread.sleep(2000);
       		              WebElement verifyI = driver.findElement(By.xpath("(//select[@id='search-select'])[1]"))   ;
       		              Thread.sleep(2000);
       		              Select selectI = new Select(verifyI);
       		              selectI.selectByVisibleText("MUWAPPROVED");
       		              Thread.sleep(2000);
       	        //this code filter the user UW status 
       		              Thread.sleep(2000);
       	                  driver.findElement(By.xpath("/html/body/app-root/app-private-layout/app-vertical-layout/div/div/div/div/app-loanunderwriting/div/div/div/div/div[2]/div/div[3]/button")).click();
       	                  Thread.sleep(2000);
       	        //this code select        
       	                  driver.switchTo().defaultContent();
       	                 WebElement selec2 = driver.findElement(By.xpath("(//div//select[@name='searchcombo'])[2]"));
       	                 selec2.click();
       	         //select the option from 
       	                 Select selt2= new Select(selec2);
       	                 selt2.selectByVisibleText("Email Address");
       	                 Thread.sleep(2000);
       	         //enter the value in search box ..
       	                WebElement vale2 = driver.findElement(By.xpath("//input[@name='searchTerm']"));
       	                 vale2.click();
       	                 vale2.sendKeys("suldha@gmail.com");
       	                 Thread.sleep(1000);
       	         //click a "Search button"        
       	                 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
       	                 
       	               //click under writing action button 
       	                 Thread.sleep(2000);
       	                 driver.findElement(By.xpath("//a[@class=\"action-icon\"]")).click();
       	                 Thread.sleep(1000);
       	                 driver.switchTo().defaultContent();
       	               //Do horizontal scroll bar 
       	                 Thread.sleep(2000);
       	               
       	    			   js.executeScript("window.scrollBy(200,document.body.scrollWidth)"); 
       	    			   Thread.sleep(2000);
       	                 driver.findElement(By.xpath("(//div[@class='row'])[5]")).click();
//       	                 //CLICK A KYC DETAILS  .....
//       	                 Thread.sleep(2000);
//       	                 driver.findElement(By.xpath("//*[@id=\"ngb-nav-7\"]")).click();
//       	                 Thread.sleep(2000);
//       	                 
//       	                 JavascriptExecutor js = (JavascriptExecutor)driver;
//       	                 js.executeScript("window.scrollBy(0,1000)");
//       	                 Thread.sleep(2000);
//       	                 //this code execute scroll down the java execution....
       	                  Thread.sleep(2000);
       	                  driver.findElement(By.xpath("//*[@id=\"ngb-nav-8\"]")).click();
       	                  Thread.sleep(2000);
       	                   WebElement fac1 = driver.findElement(By.xpath("//*[@id=\"next-icon\"]"));
       	                  Thread.sleep(2000);
       	                  fac1.click();
       	                  Thread.sleep(2000);
       	                  driver.findElement(By.xpath("//*[@id=\"ngb-nav-2\"]")).click();
       	                  Thread.sleep(2000);
       	                  WebElement sel1 = driver.findElement(By.xpath("//*[@id=\"uw-status\"]"));
       	                  Thread.sleep(2000);
       	                  Select s11= new Select(sel1);
       	                  s11.selectByVisibleText("APPROVED");
       	                  Thread.sleep(2000);
//       	                  WebElement hey = driver.findElement(By.xpath(" (//input[@name='user-file'])[1]"));
//       	                  driver.switchTo();
//       	                  hey.click();
//       	                  Thread.sleep(2000);
       	                  WebElement uploE = driver.findElement(By.xpath("(//input[@name='user-file'])[1]"));
       	                  uploE.sendKeys("C:\\Users\\NaveenKrishnamoorthy\\OneDrive - INY FINANCIAL PTE LTD\\Documents\\Notes\\Notepad\\pgadmin.txt");
       	                  Thread.sleep(2000);
       	                  driver.findElement(By.xpath("(//textarea[@name='uw-remark'])[1]")).sendKeys(" *** THANKS TO INYPAY FOR GIVE A LOAN FOR MY HIGHIER STUDIES  *** ");
       	                  Thread.sleep(2000);
       	                  
       	                  js.executeScript("window.scrollBy(0,200)");
       	                  Thread.sleep(2000);
//       	                  WebElement sem = driver.findElement(By.xpath("(//*[@id=\"customCheckcolor2\"])[1]"));
//       	                  sem.click();
//       	                  Thread.sleep(2000);
       	                  driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
       	                  Thread.sleep(2000);
       	                  System.out.println(" ***** HEY YOUR GET THE LOAN IN INYPAY ***** ");
	                      Thread.sleep(2000);
	                      driver.quit();
	                      

  }
	   	   	  	   	   
}
  
  //this method to calling a cdd checker operation .......... 
 


