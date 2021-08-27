import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\WORKSPACE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://shellbng.efmfm.com");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("inputEmail3")).sendKeys("12345");
//		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'inputPassword3\']")).sendKeys("54321");
		driver.findElement(By.xpath("//*[@id=\'loginModal\']/div/div/div[2]/form/div[3]/div/button")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/div[5]/p")).getText());
		
//		driver.close();

	}

}
