package testProject.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	public WebDriver driver;

	By oderid = By.id("order-id");
	By submit = By.xpath("//div[@class='form-group']/button[1]");
	By details = By.xpath("//table[@class='table common-table']");
	By returned = By.cssSelector("div[class='return-address'] button");
	By returnDetails = By.xpath("//div[@class='output']");

	public WebElement getorderId() {
		return driver.findElement(oderid);
	}

	public WebElement getSubmit() {
		return driver.findElement(submit);
	}

	public WebElement getdetails() {
	return driver.findElement(details);
		
	}
	public WebElement getreturned() {
		return driver.findElement(returned);
			
		}
	public WebElement getreturnDetails() {
		return driver.findElement(returnDetails);
			
		}
}