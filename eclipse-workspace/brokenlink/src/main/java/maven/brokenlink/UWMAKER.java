package maven.brokenlink;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UWMAKER {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
	//this line used to set the all version of the chrome used to enter the browseer 
	WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    long starTime = System.currentTimeMillis();
    driver.get("https://qa-digiopsei-nlb-bdc8bb0ee2296a58.elb.ap-southeast-1.amazonaws.com/digiopsiam");
    long endTime = System.currentTimeMillis();
    long pageLoadtime = starTime-endTime;
    System.out.println("THIS IS THE LOADING TIME : "+pageLoadtime);
    
    
    driver.manage().window().maximize();
    driver.findElement(By.id("details-button")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("proceed-link")).click();
	driver.navigate().back();
	
	
	
	
	   //Enter the digiops portal 
	   long starTime1 = System.currentTimeMillis();
	   driver.get("http://qa-digiopsei-nlb-bdc8bb0ee2296a58.elb.ap-southeast-1.amazonaws.com/digitalops/");
	   Thread.sleep(2000);
	   long endTime1 = System.currentTimeMillis();
	   long pageLoadtime1 = starTime1-endTime1;
	   System.out.println("THIS IS THE  PAGE LOADING TIME :"+pageLoadtime1);
	   
	   
	   driver.findElement(By.xpath("(//a)[3]")).click();
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
	   
	   
	   //select option  for verifypending this xpath sometime is not working we will retify the data also 
	  
	              Thread.sleep(3000);
                  WebElement verify = driver.findElement(By.xpath("//*[@id=\"search-select\"]"));
        // select the option in UW maker 
                  Select selc = new Select(verify);
                  selc.selectByVisibleText("VERIFICATIONPENDING");
                  Thread.sleep(2000);
        //this code filter the user UW status 
                  driver.findElement(By.xpath("(//div//button)[3]")).click();
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
                 vale.sendKeys("hercules@gmail.com");
                 Thread.sleep(1000);
         //click a "Search button"        
                 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
                 Thread.sleep(2000);
         //click under writing action button 
                 driver.findElement(By.xpath("//a[@class=\"action-icon\"]")).click();
                 Thread.sleep(1000);
                 driver.switchTo().defaultContent();
         //Do horizontal scroll bar 
                 JavascriptExecutor js2 = (JavascriptExecutor)driver;
    			   js2.executeScript("window.scrollBy(200,document.body.scrollWidth)"); 
    			   Thread.sleep(2000);
                 driver.findElement(By.xpath("(//div[@class='row'])[5]")).click();
                 
                  
	}

}
