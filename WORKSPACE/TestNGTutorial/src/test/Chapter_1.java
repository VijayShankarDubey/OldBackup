package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class Chapter_1 {

	@Test
	public void demo1() {
	
		System.out.println("Hello");
	}
	@Test
	public void demo2() {
		System.out.println("Welcome");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("I will execute before every test method before method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("I will execute after every test method before method");
	}
}
