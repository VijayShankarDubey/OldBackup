package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage  {
	
	public WebDriver driver;
	
	By UserName = By.id("inputEmail3");
	By Password = By.id("inputPassword3");
	By SignIn = By.cssSelector("button[class='btn blueBtn ng-pristine ng-valid']");

	
	public loginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getUserName() {
		return driver.findElement(UserName);
	}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	
	public WebElement getSignIn() {
		return driver.findElement(SignIn);
	}

}
