package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Chapter_3 {
	
	@Test
	public void demo3() {
		System.out.println("TestNG");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("I'm no 1");
	}
	@AfterSuite
	public void afetersuit() {
		System.out.println("I'm last suite");
	}
	
	@Test
	public void demo4() {
		System.out.println("Framework");
	}

}
