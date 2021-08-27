import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Chapter_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.spicejet.com/");
		 driver.manage().window().maximize();
		 driver.getTitle();
		 
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1"))
		 {
			 System.out.println("Round Trip Active");
			 Assert.assertTrue(true);
		 }
		 else {
			 System.out.println("Round Trip Inactive");
		 }
		 
		 driver.close();
	}

}
