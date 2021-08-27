package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	private By signin = By.cssSelector("a[href*='sign_in']");
	private By title = By.xpath("//*[@id='content']/div/div[1]/h2[1]");
	private By contact = By.xpath("//nav[@class='navbar-collapse collapse']/ul[1]/li[8]/a[1]");
	private By header = By.xpath("//div[@class='row']/div[1]/p[1]");
	
	
	
		
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	public WebElement getheader() {
		return driver.findElement(header);
	}
	public LoginPage getLogin() {
		driver.findElement(signin).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}
	public WebElement getContact() {
		return driver.findElement(contact);
	}

	}

