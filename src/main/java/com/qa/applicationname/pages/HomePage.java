package com.qa.applicationname.pages;

import org.openqa.selenium.WebDriver;

import com.qa.applicationname.utils.ElementUtil;

public class HomePage {
	private ElementUtil eleUtil;
	
	public HomePage(WebDriver driver){
		eleUtil = new ElementUtil(driver);
	}
	
	public String getHomePageTitle() {
		return eleUtil.getTitle();
	}

}
