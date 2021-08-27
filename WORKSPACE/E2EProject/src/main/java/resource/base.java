package resource;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//Add testng dependency pom xml 
//Add selenium java depedency
//Add Log4j in your Apache Maven build pom xml

public class base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resource\\data.properties");

		prop.load(fis);

		// Customize Browser
		// mvn test - DBrowser = Chrome

		String browserName = System.getProperty("browser");
		System.out.println(browserName);
//		String browserName = prop.getProperty("browser");

		if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");

			//Headless mode code without opening chrome 
			ChromeOptions options = new ChromeOptions();
			if(browserName.contains("headless")) 
			{
			options.addArguments("headless");
			//-----------------
			}
			driver = new ChromeDriver(options);

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "d:\\java\\workspace\\geckodriver.exe");

			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
}
