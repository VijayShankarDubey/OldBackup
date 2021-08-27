import java.awt.event.WindowStateListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Miscellaneous_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement footer = driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));
		WebElement footerColumn = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		System.out.println("Footer Link Count : " + footer.findElements(By.tagName("a")).size());
		System.out.println("Footer Column Count : " + footerColumn.findElements(By.tagName("a")).size());
		System.out.println("Page Link Count : " + driver.findElements(By.tagName("a")).size());
		Assert.assertEquals(driver.findElements(By.tagName("a")).size(), 27);

		for (int i = 1; i < footerColumn.findElements(By.tagName("a")).size(); i++) {
			String clickonLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footerColumn.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
		}

		Set<String> title = driver.getWindowHandles();
		Iterator<String> it = title.iterator();
		String parentId = it.next();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println("Page Title : " + driver.getTitle());
			driver.close();
		}
		driver.switchTo().window(parentId);
		System.out.println("Parent Window Title : " + driver.getTitle());
	}

}
