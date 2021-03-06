import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WORKSPACE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.xpath(
		 * "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 * 
		 * driver.findElement(By.xpath("(//a[@value=\'MAA\'])")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("(//a[@value=\'PNQ\'])[2]")).click();
		 */

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(driver.getTitle());

		// OriginStation

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.cssSelector("a[value='DEL']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))
				.getAttribute("value"));

		// Destination

		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"))
				.getAttribute("value"));

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
	}

}
