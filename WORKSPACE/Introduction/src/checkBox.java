import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WORKSPACE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();

		System.out.println((driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()));

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

//		Count Number of Checkboxes

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
