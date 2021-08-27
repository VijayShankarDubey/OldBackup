	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		Origin
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='PAT']")).click();
		System.out.println(driver.getTitle());
		System.out.println("Origin: " + driver
				.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));

//		Destination
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='MAA']")).click();
		System.out.println("Destination: "
				+ driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"))
						.getAttribute("value"));

//		driver.close();

	}

}
