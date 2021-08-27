import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Chapter_20 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\JAVA\\WORKSPACE\\Practice_1\\src\\data.properties");
		prop.load(fis);
		
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("url"));
		
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("D:\\JAVA\\WORKSPACE\\Practice_1\\src\\data.properties");
		prop.store(fos, null);
	}
}
