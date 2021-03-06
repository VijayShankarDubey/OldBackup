import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WORKSPACE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

		Thread.sleep(4000);

		// Selection of Adults

		WebElement Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));

		Select adultsdrp = new Select(Adults);

		adultsdrp.selectByValue("2");

		// Selection of Childs

		WebElement childs = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));

		Select childsdrp = new Select(childs);

		childsdrp.selectByValue("2");

		driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());

	}

}
