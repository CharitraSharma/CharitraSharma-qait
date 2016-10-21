package com.BookMyShow.BookMyShow;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Step1_WebSiteLaunch {

	LaunchBrowser browser;
	WebDriver driver;
	
	@Test
	public void LaunchWebSite() throws IOException
	{
		browser = new LaunchBrowser();
        driver = browser.BrowserLaunch();
        System.out.println(driver);
        Reporter.log("----------------Automation Task Begins Here----------------");
        driver.get(browser.getURL());
        driver.manage().window().fullscreen();
        Reporter.log("Current URL is : ");
        System.out.print(driver.getCurrentUrl().toString());
        System.out.println("");
        Reporter.log("Current Title is : ");
        System.out.println(driver.getTitle().toString());
           
	}
}
