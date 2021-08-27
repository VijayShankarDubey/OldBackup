import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WORKSPACE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("vijay");
		driver.findElement(By.name("pw")).sendKeys("12345");
//		driver.findElement(By.className("button r4 wide primary")).click();
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		driver.quit();
	}

}
