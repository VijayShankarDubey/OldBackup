package efmfmWeb;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.loginPage;
import resource.base;

public class signinPage extends base {

	@BeforeSuite
	public void intialize() throws IOException {
		driver = initializeDriver();
	}

	@BeforeTest
	public void baseUrl() throws InterruptedException {

		driver.get(prop.getProperty("url"));
		loginPage lp = new loginPage(driver);
		// Enter UserName
		lp.getUserName().sendKeys(prop.getProperty("username"));
//		Enter Password
		lp.getPassword().sendKeys(prop.getProperty("password"));
		lp.getSignIn().click();
		
	}

//	@AfterTest
//	public void tearDown() {
//		driver.close();
//	}

	
	
}
