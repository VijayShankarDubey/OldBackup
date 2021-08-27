package resource;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class base {
	public Properties prop;
	public WebDriver driver;
	
	
	public WebDriver initializeDriver() throws IOException {
	prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resource\\data.properties");
	prop.load(fis);

	String browserName = prop.getProperty("browser");
	System.out.println(browserName);
	
	if(browserName.contentEquals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		 driver = new ChromeDriver();
	}else if(browserName.contentEquals("firefox")) {
		System.setProperty("WebDriver.firefox.driver", "d:\\java\\workspace\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	return driver;
	}
}
