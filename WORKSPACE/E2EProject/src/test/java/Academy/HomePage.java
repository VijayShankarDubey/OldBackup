  package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.ForgotPassword;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resource.base;

public class HomePage extends base{
	public WebDriver driver;
	
	
	@BeforeTest
	public void initialize() throws IOException {
		driver= initializeDriver();
	}
	
	@Test(dataProvider="getData")
	
	public void baseNavigation(String username, String password, String text ) throws IOException {
		
		driver.get(prop.getProperty("url"));
		
		LandingPage l = new LandingPage(driver);
		LoginPage lp = l.getLogin();
		
//		LoginPage log = new LoginPage(driver);
		lp.email().sendKeys(username);
		lp.password().sendKeys(password);
		
		
		lp.Login().click();
		ForgotPassword fp= lp.getforgotPassword();
		fp.getEmail().sendKeys("XYZ@gmail.com");
		fp.getSendMeInstructions().click();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

	@DataProvider
	public Object[][] getData(){
		
		Object [][] data =new Object[2][3];
		//0th row
		data[0][0]="restricteduser@tect.com";
		data[0][1]="123456";
		data[0][2]="Restrict User";
		//1st row
		data[1][0]="nonrestricteduser@tect.com";
		data[1][1]="12345";
		data[1][2]="Non Restrict User";
		
		return data;
		
	}
	


}
