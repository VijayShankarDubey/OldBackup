import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chapter_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		WebElement move = driver.findElement(By.cssSelector("span[class='nav-line-2 nav-long-width']"));
		WebElement move = driver.findElement(By.id("nav-link-accountList"));

		//Moving cursor
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("input[id*='twotabsearchtextbox']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//		a.moveToElement(move).contextClick().build().perform();
	}

}
