import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class efm_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://shellgf.efmfm.com/index");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("inputEmail3")).sendKeys("ngfv0013");
		driver.findElement(By.id("inputPassword3")).sendKeys("Good@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Request Details")).click();
		Thread.sleep(3000);
//		driver.close();
	}

}
