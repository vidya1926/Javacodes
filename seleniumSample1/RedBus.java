package seleniumSample1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/ ");
		driver.findElement(By.id("src")).sendKeys("chenn",Keys.ARROW_DOWN,Keys.TAB);
		// driver.findElement(By.xpath("//li[@class='selected']")).click();
		 
		 
		driver.findElement(By.id("dest")).sendKeys("Pondicherry", Keys.ARROW_DOWN,Keys.TAB);
		//WebElement findElement = driver.findElement(By.xpath("(//td[@class='wd day'])[1]"));
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//td[@class='wd day']")).click();
		driver.findElement(By.id("search_btn")).click();
		
	}

}
