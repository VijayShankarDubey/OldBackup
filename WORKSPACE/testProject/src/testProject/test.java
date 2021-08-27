package testProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://return-order-app.herokuapp.com/");
	}

}
