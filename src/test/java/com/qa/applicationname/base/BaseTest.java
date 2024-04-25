package com.qa.applicationname.base;

import org.openqa.selenium.WebDriver;

import com.qa.applicationname.factory.DriverFactory;
import com.qa.applicationname.pages.HomePage;

public class BaseTest {
	
	private static WebDriver driver;
//	private DriverFactory df;
	private static HomePage homePageObj;
	
	public void setUp() {
		driver = new DriverFactory().initDriver("chrome","https://naveenautomationlabs.com/opencart/index.php?route=account/login");
														//without https - will get InvalidArgumentException but without www ---> it will still work
		homePageObj = new HomePage(driver);
		
	}
	
	public static void main(String args[]) {
		BaseTest test = new BaseTest();
		test.setUp();	
		String homePageTitle = homePageObj.getHomePageTitle();
		System.out.println("Home page title is: " + homePageTitle);
		test.tearDown();
	}
	
	public void tearDown() {
		this.driver.quit();
	}
	
	

}
