package seleniumSample1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce{

	public static void main(String[] args) throws InterruptedException {
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeOptions options = new
		 * ChromeOptions(); options.addArguments("--disable-notifications");
		 * ChromeDriver driver = new ChromeDriver(options);
		 * 
		 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 * driver.get("https://login.salesforce.com/");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.id("username")).sendKeys("nupela@testleaf.com");
		 * driver.findElement(By.id("password")).sendKeys("India@123");
		 * driver.findElement(By.id("Login")).click();
		 */
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
// Enter Url
		driver.get("https://login.salesforce.com/");
		
// Enter Username		
		WebElement uName = driver.findElement(By.id("username"));
		uName.clear();
		uName.sendKeys("nupela@testleaf.com");
		
// Enter Password		
		WebElement pWord = driver.findElement(By.id("password"));
		pWord.clear();
		pWord.sendKeys("India@123");
		
// Click LoginButton
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//p[text()='Service Console']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Show Navigation Menu']")).click();
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		driver.findElement(By.xpath("//button[@data-aura-class='homeGoalSetting']//lightning-primitive-icon[1]")).click();
		//String text = driver.findElement(By.xpath("//input[contains(@class,'input uiInputSmartNumber')]")).getText();
	 
		
	    
		driver.findElement(By.xpath("//input[contains(@class,'input uiInputSmartNumber')]")).sendKeys("10,000");
		driver.findElement(By.xpath("(//button[contains(@class,'slds-button slds-button--neutral')])[3]")).click();
		
		driver.findElement(By.xpath("//button[@title='Show Navigation Menu']")).click();
		driver.findElement(By.xpath("//span[text()='Dashboards']")).click();
		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.switchTo().frame(1);
		driver.findElement(By.id("dashboardNameInput")).sendKeys("Vidya_workout");
		driver.findElement(By.id("dashboardDescriptionInput")).sendKeys("creating new dashboard");
		driver.findElement(By.id("submitBtn")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("vidya")).click();
		
		
		
		
		
	
	}

}/*
	 * 1. Login to https://login.salesforce.com 2. Click on toggle menu button from
	 * the left corner 3. Click view All 4. Click Service Console from App Launcher
	 * 5. Select Home from the DropDown 6. Add CLOSED + OPEN values and result
	 * should set as the GOAL (If the result is less than 10000 then set the goal as
	 * 10000) 7. Select Dashboards from DropDown 8. Click on New Dashboard 9. Enter
	 * the Dashboard name as "YourName_Workout" 10. Enter Description as Testing and
	 * Click on Create 11. Click on Done 12. Verify the Dashboard is Created 13.
	 * Click on Subscribe 14. Select Frequency as "Daily" 15. Time as 10:00 AM 16.
	 * Click on Save 17. Verify "You started Dashboard Subscription" message
	 * displayed or not 18. Close the "YourName_Workout" tab 19. Click on Private
	 * Dashboards 20. Verify the newly created Dashboard available 21. Click on
	 * dropdown for the item 22. Select Delete 23. Confirm the Delete 24. Verify the
	 * item is not available under Private Dashboard folder
	 */
