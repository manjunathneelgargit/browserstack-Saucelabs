package saucelabsWeb;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SauceLabsMobile_Emulator 
{
	public static final String USERNAME = "manjunathneelgar";//david3612
	public static final String AUTOMATE_KEY = "aa10bd5f-ee48-4523-845a-a6363501e108";//LL3xQVwwbwjxGAs2XGSM
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";
	public static void main(String[] args) 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("appiumVersion", "1.9.1");
		caps.setCapability("deviceName","Samsung Galaxy S9 Plus WQHD GoogleAPI Emulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("browserName", "");
		caps.setCapability("build", "SnapDeal"); //
		caps.setCapability("platformVersion","8.1");
		caps.setCapability("platformName","Android");
		caps.setCapability("app","https://github.com/Sofia832/apkFile/releases/download/2.2.1/Android.SauceLabs.Mobile.Sample.app.2.2.0.apk");
		
		AppiumDriver<MobileElement> driver = null;
		try 
		{
			driver = new AppiumDriver<MobileElement>(new URL(URL), caps);
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}

		/* Write your Custom code here */
		try 
		{
			driver.findElementById("com.snapdeal.main:id/close").click();
			driver.findElementById("com.snapdeal.main:id/top_bar").click();
			driver.findElementById("com.snapdeal.main:id/search_edit_text").sendKeys("Reebok");
			driver.findElementByXPath("(//android.widget.FrameLayout[@resource-id='android:id/content']/descendant::android.widget.LinearLayout)[1]").click();
			driver.findElementById("com.snapdeal.main:id/negativeBtnView").click();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		driver.quit();
	}
}
