package testProject.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class object {
	public WebDriver driver;	
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\testProject\\demo\\data.properties"); 

		prop.load(fis);
	
		String browserName = prop.getProperty("browser");
//	String browserName = System.getProperty("browser");
	System.out.println(browserName);
	
	if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		driver  = new ChromeDriver();
		
	}else if (browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "d:\\java\\workspace\\geckodriver.exe");
		}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	}
	
}
