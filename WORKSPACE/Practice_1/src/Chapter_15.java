import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter_15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		// need to download jar https://commons.apache.org/proper/commons-io/
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Screenshot Capture
		FileUtils.copyFile(src, new File("C:\\Users\\Administrator\\Pictures\\Saved Pictures.screenshot.jpeg"));
	}

}
