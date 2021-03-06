import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class miscellaneous1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WORKSPACE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS );
		driver.findElement(By.cssSelector("input[value='radio2']")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			//pass this string on sendkeys method
			//String clinkonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER); 
			
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
			Thread.sleep(5000L);
		}
		Set<String> getTitle=driver.getWindowHandles();
		Iterator<String> it=getTitle.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
