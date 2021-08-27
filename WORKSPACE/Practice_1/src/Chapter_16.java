import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Chapter_16 {

	public static void main(String[] args) throws MalformedURLException, IOException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\java\\workspace\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// broken URL

		// Step 1 - IS to get all urls tied up to the links using Selenium

		// Java methods will call URL's and gets you the status code

		// if status code >400 then that url is not working-> link which tied to url is
		// broken

		// a[href*="soapui"]'

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
//		String link = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		SoftAssert a = new SoftAssert();

		for (WebElement link : links) { // all links are string in one link
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode = conn.getResponseCode();
			System.out.println(link.getText() + " getting " + resCode + " response");
//			if(resCode<400) {
//				a.assertTrue( resCode>400, link.getText() +" getting = " + resCode + " response." );
//			}
//			else{
			a.assertTrue(resCode < 400, link.getText() + " getting " + resCode + " response.");
		}
		a.assertAll();
	}
//	}
}
