package saucelabsWeb;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SaucelabsWeb 
{
	public static final String USERNAME = "manjunathneelgar";//david3612
	public static final String AUTOMATE_KEY = "aa10bd5f-ee48-4523-845a-a6363501e108";//LL3xQVwwbwjxGAs2XGSM
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	
	public static void main(String[] args) throws Exception 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Windows 10");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("browserVersion", "83.0");
		caps.setCapability("recordVideo", "false");
		caps.setCapability("recordScreenshots", "false");
	

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("BrowserStack");
		element.submit();

		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
