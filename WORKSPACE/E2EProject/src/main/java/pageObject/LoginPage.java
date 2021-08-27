package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	By email = By.name("email");
	By password = By.id("user_password");
	By Login = By.cssSelector("[value='Log In']");
	By forgotPassword = By.cssSelector("[href*='password/new']");


	
	public ForgotPassword getforgotPassword() {
		driver.findElement(forgotPassword).click();
		return new ForgotPassword(driver);
	}
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement email() {
		return driver.findElement(email);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement Login() {
		return driver.findElement(Login);
	}

}
