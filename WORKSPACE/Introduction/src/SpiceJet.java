import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WORKSPACE\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(6000);
		System.out.println(driver.getTitle());

		// Origin Station
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='PAT']")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))
				.getAttribute("Value"));

//		Destination Station
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("(//a[@value='MAA']) [2]")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"))
				.getAttribute("value"));

//		Select Date
//		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date1")).getAttribute("string"));

//		Search Flight
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		driver.quit();

	}

}
