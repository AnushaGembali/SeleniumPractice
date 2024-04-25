package com.qa.applicationname.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private WebDriver driver;

	public WebDriver initDriver(String browserName, String url) {
		
		switch(browserName.trim().toLowerCase()) {
				case "chrome": {
					driver = new ChromeDriver();	//launches the browser
					break;
				}
				case "firefox": {
					driver = new FirefoxDriver();
					break;
				}
				default: {
					System.out.println("The entered browser name is inn correct, so exiting the automation");
					System.exit(0);
				}
		}
		driver.manage().window().maximize();	// makes the screen to its maximum size
		driver.manage().deleteAllCookies();		// deletes the cookies
		driver.get(url);		// URL -- url of the application which we want to open and that application will be opened
		return driver;
	}

}
