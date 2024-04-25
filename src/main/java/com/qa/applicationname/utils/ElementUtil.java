package com.qa.applicationname.utils;

import org.openqa.selenium.WebDriver;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver){
		this.driver = driver;
	}
	
	public String getTitle() {
		return this.driver.getTitle();   // to get the current title of the web page
	}
	
	

}
/*
 * What is Selenium  ---> Selenium is divided into 4 components:
 * 
 * 1. Selenium IDE --> Record n play tool, cannot write any code
 * 2. Selenium RC or Selenium 1 --->. it is deprecated, no handler for alerts or pop ups, remote control servers
 * 3. Selenium WebDriver	---> Selenium RC and Selenium Webdriver are merged --->  Selenium 2 --> Selenium 3 --->  Selenium 4(Latest Selenium Webdriver)
 * 4. Selenium Grid ---> Run test cases on multiple os/browser ---- run test cases parallel ----- remote/on cloud / on server
 * 
 * PROS:
 * - Selenium is open source
 * - Free license toll 
 * - Cross browser support
 * - Cross Platform  ---> does not support UNIX ---- supports windows, mac, linux
 * - Multiple language bindings support --- Java, python, c#, php, JS, Ruby
 * - W3C WebDriver protocol compliance ---> no other tool is w3c protocol compliance --- major changes done between Selenium 3 and Selenium 4
 * - Can be integrated with third party tools or libraries
 * - Can do scrolling, take screen shots, handle pop ups, open new tabs/windows etc., anything related to browser can do
 * 
 * 
 * CONS:
 * - Can automate only web applications
 * - Can not perform API automation
 * - Selenium is just a library or a tool which automates browsers using actions, it cannot do any validations
 * - Can not generate any test results
 * - Can not do performance testing/ security testing/ hardware testing
 * - Can not automate CAPTCHA, QR code, Bar Code ---- no tool in the market can do this as these features are built in that way
 * - 
 *
 */
