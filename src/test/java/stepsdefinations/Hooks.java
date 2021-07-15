package stepsdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before("@MobileTest")
	public void BeforeMobileTest() {
		
		System.out.println("BeforeMobileTest");

	}
	
	@After("@MobileTest")
	public void AfterMobileTest() {
		
		System.out.println("AfterMobileTest");

	}
	
	@Before("@WebTest")
	public void BeforeWebTest() {
		
		System.out.println("BeforeWebTest");

	}
	
	@After("@WebTest")
	public void AfterWebTest() {
		
		System.out.println("AfterWebTest");

	}
	
	
	

}
