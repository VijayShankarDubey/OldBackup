import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WORKSPACE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
//		driver.close();
		driver.findElement(By.id("email")).sendKeys("88779274");
		driver.findElement(By.id("pass")).sendKeys("8507485");
//		driver.findElement(By.id("pass")).getCssValue( )
//		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().to("https://www.ebay.in/");
		driver.navigate().refresh();
		driver.navigate().to("https://google.co.in/");
		driver.navigate().back();
		driver.navigate().forward();
//		driver.findElement(By.name("login")).click();
	}

}
