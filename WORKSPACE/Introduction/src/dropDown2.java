import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dropDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WORKSPACE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currency.selectByVisibleText("AED");
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getAttribute("value"));

		// Radio Button

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{
			System.out.println("It's Enabled");
			Assert.assertTrue(true);
		}

		else {
			Assert.assertTrue(false);
		}
	}
}
