package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	
	public WebDriver driver;
	
	By email = By.name("email");
	By SendMeInstructions = By.cssSelector("[type='submit']");
	
	
		
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getSendMeInstructions() {
		return driver.findElement(SendMeInstructions);
	}
	}

