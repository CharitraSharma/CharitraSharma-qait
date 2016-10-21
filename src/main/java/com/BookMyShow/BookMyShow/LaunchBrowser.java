package com.BookMyShow.BookMyShow;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
BaseClass bs = new BaseClass();
WebDriver driver=null;
private System prop;
	public WebDriver BrowserLaunch() throws IOException
	{
		if( bs.getPropValues("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		if( bs.getPropValues("browser").equals("chrome"))
		{
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
			driver= new FirefoxDriver();
		}
		return driver;
		
	}
	
	public String getURL() throws IOException
	{
		String url = bs.getPropValues("url");
		return url;
		
	}
}
