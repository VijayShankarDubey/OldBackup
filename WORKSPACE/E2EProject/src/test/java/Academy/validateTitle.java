package Academy;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resource.base;

public class validateTitle extends base {
	public WebDriver driver;
	LandingPage lp;
	@BeforeTest
	public void initialize() throws IOException {
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	

	@Test
	public void validateAppTitle() {

		lp = new LandingPage(driver);

		Assert.assertEquals(lp.getTitle().getText(), "FEATURE COURSES");
		
//		lp.getLogin().click();

	}
	
	@Test
	public void validateHeader() {

		lp = new LandingPage(driver);

		Assert.assertEquals(lp.getheader().getText(), "Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..");
		
//		lp.getLogin().click();

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

}
