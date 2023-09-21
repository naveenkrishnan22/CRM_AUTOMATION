package maven.brokenlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gogle {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abitha chuthukutty");
	  
	}

}
