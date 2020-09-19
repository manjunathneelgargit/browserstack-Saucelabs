package saucelabsWeb;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;

public class SaucelabsWeb 
{
	public static final String USERNAME = "lemaxdavid";//david3612
	public static final String AUTOMATE_KEY = "24ed46a9-9bac-4e62-8b20-8247a5a7ccd2";//LL3xQVwwbwjxGAs2XGSM
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	
	//public static final String URL = "https://bharani:a779211f-9658-47a5-9c53-ce10d3afa0f7@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	
	public static void main(String[] args) throws Exception 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("name", "Regression");
		caps.setCapability("platformName", "Windows 10");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("browserVersion", "71.0");
		caps.setCapability("build", "Bharani Google");
		caps.setCapability("recordVideo", "true");
		caps.setCapability("recordScreenshots", "false");
	

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		//Script
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("BrowserStack");
		element.submit();

		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
