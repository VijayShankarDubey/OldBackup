package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	WebDriver driver;
	Properties prop;
	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"src\\main\\java\\test\\data.properties");
				prop.load(fis);
				
			String browserName = System.getProperty("browser");
			
			if(browserName.contains("chrome")) {
				System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if(browserName.contains("firefox")) {
				System.setProperty("webdriver.firefox.driver", "d:\\java\\workspace\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}

}
