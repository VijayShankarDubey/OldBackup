package vendorMangment;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.loginPage;
import pageObject.viewEditDriver;
import resource.base;

public class addDriver extends base {

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		loginPage lp = new loginPage(driver);
		// Enter UserName
		lp.getUserName().sendKeys(prop.getProperty("username"));
//		Enter Password
		lp.getPassword().sendKeys(prop.getProperty("password"));
		lp.getSignIn().click();
	}

	@Test
	public void newDriver() throws InterruptedException {
//		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		viewEditDriver nd = new viewEditDriver(driver);
		nd.getvendorDashboard().click();
		nd.getclickDriver().click();
		nd.getaddDriver().click();
		nd.getdriverName().sendKeys("Vijay");
		nd.getdriverfatherName().sendKeys("Vijay");
		nd.getmobileNumber().sendKeys("9191919191");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
