package seleniumSample1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keychords {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		
		driver.get("https://erail.in/");
		
		
           Thread.sleep(2000);
		  driver.findElement(By.xpath("//h1[text()='eRail.in - Indian Railways Train Enquiry']"))
				  .sendKeys(Keys.chord(Keys.CONTROL, "a"));
	      // enter text then ctrl+a with Keys.chord()
	     
		
	   
	      driver.navigate().to("https://www.google.co.in/");
	      
			/*
			 * WebElement open =driver.findElement(By.xpath("//*[@id=\"input\"]") );
			 * 
			 * open.sendKeys(copy,Keys.ENTER);
			 * 
			 */
		
		
		
		
		
	}

}
