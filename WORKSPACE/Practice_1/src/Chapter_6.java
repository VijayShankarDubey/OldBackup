import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Chapter_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Using assert for checking expected values or result
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_IndArm']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_IndArm']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_IndArm']")).isSelected());
		
//		Total check box count 
		
		System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type*='checkbox']")).size(), "8");
		
		
		driver.close();
	}

}
