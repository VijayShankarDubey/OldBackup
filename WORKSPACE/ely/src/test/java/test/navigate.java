package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class navigate  extends base{
	
//	@BeforeTest
//	public void intialize() throws IOException {
//		driver = initializeDriver();
//	}
	
	@Test
	public void baseUrl() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

}
