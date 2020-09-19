package com.Saucelabs.Base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base 
{
	public WebDriver driver;
	public static final String USERNAME = "lemaxdavid";//david3612
	public static final String AUTOMATE_KEY = "24ed46a9-9bac-4e62-8b20-8247a5a7ccd2";//LL3xQVwwbwjxGAs2XGSM
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	
	@Parameters({"browser","platform"})
	@BeforeClass
	public void configBC(String browser, String platform)
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("name", "Regression");
		caps.setCapability("platformName", platform);
		caps.setCapability("build", "Build");
		caps.setCapability("recordVideo", "true");
		caps.setCapability("recordScreenshots", "false");
		
		if(browser.equals("chrome"))
		{
			caps.setCapability("browserName", "Chrome");
			caps.setCapability("browserVersion", "82.0");
		}
		if(browser.equals("firefox"))
		{
			caps.setCapability("browserName", "Firefox");
			caps.setCapability("browserVersion", "70.0");
		}
		
		try 
		{
			driver = new RemoteWebDriver(new URL(URL), caps);
			driver.get("http://www.google.com");
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
	}

	@AfterClass(alwaysRun = true)
	public void configAC()
	{
		driver.close();
	}
}
