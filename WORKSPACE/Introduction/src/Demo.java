import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Driver object for chrome driver
		
		//we will strictly implement methods of webDriver
		
	/*	 class name= ChromeDriver
		
			X driver = new X(); */
			
	//Invoke .exe file first	
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WORKSPACE\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		driver.navigate().to("https://yahoo.com");
		driver.navigate().back();
		driver.close();
	}
 
}