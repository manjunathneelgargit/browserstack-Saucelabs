package browserStack;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserStackMobile 
{
	public static String userName = "david3611";
	public static String accessKey = "6wNpAR65i43nknsonABU";

	public static void main(String args[]) throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("device", "Google Pixel 3");
		caps.setCapability("os_version", "9.0");
		caps.setCapability("project", "My New SnapDeal Project"); //Project Name
		caps.setCapability("build", "My First Build - Regression"); //Build Name
		caps.setCapability("browserstac.debug", "true");
		caps.setCapability("name", "Bstack-[Java] Sample Test"); //Test Name
		caps.setCapability("app", "bs://6c1db3564f4b84d01396ff5416c90069cabf31d4");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
