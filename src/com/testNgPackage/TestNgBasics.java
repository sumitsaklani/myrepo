package com.testNgPackage;
import org.testng.annotations.*;

public class TestNgBasics {
	
	//@Before are preconditions
	
	@BeforeSuite
	public void setup() {
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void enterUrl() {
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod");
	}
	
	//@Test is test case condition
	
	@Test
	public void testMethod1() {
		System.out.println("@Test Test Method 1");
	}
	@Test
	public void testMethod2() {
		System.out.println("@Test Test Method 2");
	}
	@Test
	public void testMethod3() {
		System.out.println("@Test Test Method 3");
	}
	
	//@After are Post conditions
	
	@AfterMethod
	public void logOut() {
		System.out.println("@AfterMethod");
	}

	@AfterClass
	public void deleteCookies() {
		System.out.println("@AfterClass");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void generateReport() {
		System.out.println("@AfterSuite");
	}

}
