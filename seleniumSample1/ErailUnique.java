package seleniumSample1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
				
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		driver.findElement(By.id("txtStationFrom")).clear();
		
		driver.findElement(By.id("txtStationFrom")).sendKeys("Chennai Beach jn",Keys.TAB);
		
        driver.findElement(By.id("txtStationTo")).clear();
		
		driver.findElement(By.id("txtStationTo")).sendKeys("Bangalore Cant",Keys.TAB);
		
		Thread.sleep(2000);
		
		List<WebElement> trainName=driver.findElements(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//td[2]"));
		ArrayList <String> trainList=new ArrayList<String>();
		
		System.out.println("Size :" +trainName.size());
		
		for(WebElement list:trainName)
		{
			trainList.add(list.getText());
		}
		System.out.println(trainList);
		Set<String> trainSet=new HashSet<String>();
		
		for(WebElement listofTrains:trainName)
		{
			trainSet.add(listofTrains.getText());
		}
		System.out.println(trainSet.size());
		
		/*
		 * 1.Launch the URL - https://erail.in/
		 * 
		 * 2.Click the 'sort on date' checkbox
		 * 
		 * 3.clear and type in the from station text field
		 * 
		 * 4.clear and type in the to station text field
		 * 
		 * 5.Add a java sleep for 2 seconds
		 * 
		 * 6.Store all the train names in a list
		 * 
		 * 7.Get the size of it
		 * 
		 * 8.Add the list into a new Set
		 * 
		 * 9.And print the size of it
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
