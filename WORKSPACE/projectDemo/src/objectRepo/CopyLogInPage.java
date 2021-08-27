package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CopyLogInPage {

	WebDriver driver;

	/* constructor */
	public CopyLogInPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(name ="login")
	WebElement username;
	
	@FindBy(xpath =".//*[@id='password']")
	WebElement password;
	
	@FindBy(css =".signinbtn")
	WebElement go;

	public WebElement Email() {
		return username;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement Submit() {
		return go;
	}
}