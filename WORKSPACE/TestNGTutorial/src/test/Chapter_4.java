package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Chapter_4 {
	
	@Test(groups= {"Smoke"})
	public void vlog() {
		System.out.println("vlog");
	}
	@BeforeClass
	public void beforeCl() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void BeforeMeth() {
		System.out.println("Before Method");
	}

}
