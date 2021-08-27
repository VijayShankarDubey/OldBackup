package guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "d:\\java\\workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.findElement(By.name("uid")).sendKeys("mngr328132");
		driver.findElement(By.name("password")).sendKeys("tUmAhYb");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.close();
	}

}