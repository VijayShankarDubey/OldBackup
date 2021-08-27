package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepo.LogInPage;

public class Login {

	@Test
	public void signin() {

		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LogInPage login = new LogInPage(driver);
		login.Email().sendKeys("hello");
		login.Password().sendKeys("hello");
		login.Submit().click();

	}
}
