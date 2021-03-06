package browserStack;
//Saucelabs
//Browserstack
//aws
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BrowserStackWeb 
{

  public static final String USERNAME = "david3611";//david3612
  public static final String ACCESSKEY = "6wNpAR65i43nknsonABU";//LL3xQVwwbwjxGAs2XGSM
  public static final String URL = "https://" + USERNAME + ":" + ACCESSKEY + "@hub-cloud.browserstack.com/wd/hub";
  
//  https://david3611:david3611@hub-cloud.browserstack.com/wd/hub

  public static void main(String[] args) throws Exception 
  {
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "83.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "8.1");
    caps.setCapability("name", "Regression");

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
