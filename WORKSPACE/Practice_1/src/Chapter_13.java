import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Chapter_13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // Implicit wait
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;  //window scroll handling handling through JS
		js.executeScript("window.scrollBy(0,600)");

		Thread.sleep(3000);

		js.executeScript("document.querySelector('.tableFixHead').scrollTop=300"); // table scroll handling through JS

		List<WebElement> value = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int sum = 0;

		for (int i = 0; i < value.size(); i++) {
			sum = sum + Integer.parseInt(value.get(i).getText()); //converting string to integer
		}
		System.out.println(sum);
//		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);
	}

}
