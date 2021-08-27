package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Chapter_5 {

	@Test(dependsOnMethods = { "aftermetho" })
	public void demo1() {

		System.out.println("Apple");
	}

	@Test(enabled= false)
	public void demo2() {
		System.out.println("Ball");
	}

	@Test(timeOut=4000)
	public void beforemethod() {
		System.out.println("Cat");
	}

	@Parameters({"URL"})
	@Test
	public void aftermetho(String urlname) {
		System.out.println("Dog");
		System.out.println(urlname);
	}

}
