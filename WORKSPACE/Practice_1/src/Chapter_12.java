import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// Handling calendar months
		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("July")) 
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		// Handling calendar date
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
		int count = driver.findElements(By.cssSelector(".day")).size();
		
		for(int i=0;i<count;i++) {
			
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
		
	}

}
