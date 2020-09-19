package test;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariOptions;

public class BrowserOptions 
{
	public Object browserOptions(DesiredCapabilities cap, String browser)
	{
		Object options = null;
		if(browser.equals("chrome"))
		{
			options = new ChromeOptions();
			cap.setCapability(ChromeOptions.CAPABILITY,options);
		}
		else if(browser.equals("firefox"))
		{
			options = new FirefoxOptions();
			cap.setCapability(FirefoxOptions.FIREFOX_OPTIONS,options);
		}
		else if(browser.equals("opera"))
		{
			options = new OperaOptions();
			cap.setCapability(OperaOptions.CAPABILITY,options);
		}
		else if(browser.equals("safari"))
		{
			options = new SafariOptions();
			cap.setCapability(SafariOptions.CAPABILITY, options);
		}
		return options;
	}

	//Set Chrome options
	public ChromeOptions addChromeOptions(Object object)
	{
		ChromeOptions options = (ChromeOptions)object;
		//Add your code below
		

		return options;
	}

	//Set Firefox Options
	public FirefoxOptions addFirefoxOptions(Object object)
	{
		FirefoxOptions options = (FirefoxOptions)object;
		//Add your code below
		
		
		return options;
	}

	//Set Opera Options
	public OperaOptions addOperaOptions(Object object)
	{
		OperaOptions options = (OperaOptions)object;
		//Add your code below

		
		return options;
	}

	//Set Safari Options
	public SafariOptions addSafariOptions(Object object)
	{
		SafariOptions options = (SafariOptions)object;
		//Add your code below
		
		
		return options;
	}
}
