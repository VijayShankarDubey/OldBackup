package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	WebDriver driver;

	/* constructor */
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.name("login");
	By password = By.xpath(".//*[@id='password']");
	By go = By.cssSelector(".signinbtn");

	public WebElement Email() {
		return driver.findElement(username);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement Submit() {
		return driver.findElement(go);
	}
}