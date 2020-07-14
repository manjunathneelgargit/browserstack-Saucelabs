package saucelabsWeb;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SauceLabsMobile_RealDevices 
{
//	public static final String USERNAME = "manjunathneelgar";//david3612
//	public static final String AUTOMATE_KEY = "aa10bd5f-ee48-4523-845a-a6363501e108";//LL3xQVwwbwjxGAs2XGSM
//	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	
	public static final String DEVICEURL = "https://eu1.appium.testobject.com/wd/hub";
	public static void main(String[] args) 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("testobject_api_key", "E0BE8B7020CA45D3A1D7DDA03DC43E25");
		caps.setCapability("deviceName", "Samsung_Galaxy_S9_free");
	    caps.setCapability("appiumVersion", "1.17.1");
	    caps.setCapability("noReset", "false");
	    //caps.setCapability("cacheId", "1732807cb06");
	    caps.setCapability("testobject_session_creation_timeout", "900000");
	    caps.setCapability("testobject_app_id", "1");
	    caps.setCapability("testobject_suite_name", "Default Appium Suite");
	    caps.setCapability("testobject_test_name", "Default Appium Test");
		AppiumDriver<MobileElement> driver = null;
		try 
		{
			driver = new AppiumDriver<MobileElement>(new URL(DEVICEURL), caps);
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}

		/* Write your Custom code here */
		driver.findElement(By.xpath("//android.widget.TextView[@text='English']")).click();

		driver.quit();
	}
}
