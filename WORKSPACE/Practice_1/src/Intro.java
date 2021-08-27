import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WORKSPACE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.co.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://gmail.com");
		driver.navigate().back();
		driver.close();

	}

}
