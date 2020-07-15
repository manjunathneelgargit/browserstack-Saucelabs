package azure;
//Saucelabs
//Browserstack
//aws
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;

public class MiroSoftAzureWebChromeTest 
{


  public static void main(String[] args) throws Exception 
  {
    DesiredCapabilities caps = new DesiredCapabilities();

   caps.setCapability("browser", "Chrome");
   caps.setCapability("browser_version", "83.0.4103.116");

//    caps.setCapability("os", "Windows");
//   caps.setCapability("os_version", "8.1");
//   caps.setCapability("resolution", "1024x768");
//   caps.setCapability("name", "Test Case for AWS Web");
//    
  ChromeOptions options = new ChromeOptions();
  caps.setCapability(ChromeOptions.CAPABILITY, options);

    caps.setPlatform(Platform.WINDOWS);

    RemoteWebDriver driver = new RemoteWebDriver(new URL("http://52.165.20.6:4444/wd/hub"), caps);
    driver.get("http://www.google.com");
    
    WebElement element = driver.findElement(By.name("q"));

    element.sendKeys("BrowserStack");
    element.submit();

    System.out.println(driver.getTitle());
    driver.quit();
    

  }
}
