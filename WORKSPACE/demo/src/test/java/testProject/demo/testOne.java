package testProject.demo;

import org.testng.annotations.Test;
import java.io.IOException;




public class testOne extends object {

	@Test
	public void homePage() throws IOException {
	driver = initializeDriver();
	driver.get(prop.getProperty("url"));
	
	loginPage lp = new loginPage();
	
	lp.getorderId().sendKeys("1257945872");
	lp.getSubmit().click();
	System.out.println(lp.getdetails().getText());
	lp.getreturned().click();
	System.out.println(lp.getreturnDetails().getText());
	}

}
