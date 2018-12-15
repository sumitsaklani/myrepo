package com.testNgPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleTest {

	WebDriver driver;
	String title;
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumit\\Documents\\chromedriver_win32\\chromedriver.exe");
	}
	
	@BeforeMethod
	public void start() {
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test(priority=1)
	public void googleTitleTest() {
		title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google1","Title Not Matched");
	}
	
	@Test(priority=2)
	public void googleLogoTest() {
		System.out.println(driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed());
	}
	
	@Test(priority=3)
	public void googleMailLink() {
		System.out.println(driver.findElement(By.linkText("Gmail")).isDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
