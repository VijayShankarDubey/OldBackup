package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chapter_2 {

	
	@AfterTest
	public void demo7() {
		System.out.println("I will execute last");
	}
	@Test
	public void demo5() {
		System.out.println("To");
	}
	
	@BeforeTest
	public void demo6() {
		System.out.println("I will execute first");
	}
	
	
}
