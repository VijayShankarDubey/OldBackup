import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chapter_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\java\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("divpaxinfo")).click();

//		Adult
		WebElement adult = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']"));
		Select adultdropdown = new Select(adult);
		adultdropdown.selectByVisibleText("3");

//		Child
		WebElement child = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
		Select childdropdown = new Select(child);
		childdropdown.selectByVisibleText("2");
		
//		Infant
		WebElement infant = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']"));
		Select infantdropdown = new Select(infant);
		infantdropdown.selectByVisibleText("2");

		
		driver.findElement(By.id("divpaxinfo")).click();

//		driver.close();
	}

}
