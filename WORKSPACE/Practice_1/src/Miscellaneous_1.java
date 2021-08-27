import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miscellaneous_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='MAA']")).click();
		System.out.println("Origin : "
				+ driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("value"));

//		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		System.out.println("Destination : "
				+ driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getAttribute("value"));

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println("Date : " + driver.findElement(By.id("ctl00_mainContent_view_date1")).getAttribute("value"));

		driver.findElement(By.id("divpaxinfo")).click();

		WebElement adult = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select adultdd = new Select(adult);
		adultdd.selectByVisibleText("2");

		WebElement child = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
		Select childDD = new Select(child);
		childDD.selectByVisibleText("2");

		WebElement Infant = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']"));
		Select infantDD = new Select(Infant);
		infantDD.selectByVisibleText("2");

		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println("Total Passenger :  " + driver.findElement(By.id("divpaxinfo")).getText());

		Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currency.selectByVisibleText("AED");
		System.out.println("Currency : "
				+ driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getAttribute("value"));
//		Select currency = new Select(driver.findElement(By.cssSelector("select[id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency']")));
//		currency.selectByVisibleText("USD");

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		System.out.println("Flight Booked");
		driver.close();

	}

}
