  package Academy;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resource.base;

public class validateNavigation extends base{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test
	
	public void baseNavigation() {
		
		LandingPage lp = new LandingPage(driver);

		Assert.assertTrue(lp.getContact().isDisplayed());
		
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}


}
