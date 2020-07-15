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

public class MicroSoftAzureFirefoxTest2 
{


  public static void main(String[] args) throws Exception 
  {
    DesiredCapabilities caps = new DesiredCapabilities();
  //  caps.setBrowserName("firefox");
  //  caps.setVersion("78.0.1");
      caps.setPlatform(Platform.WINDOWS);

    FirefoxOptions options = new FirefoxOptions();
    caps.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
    
    RemoteWebDriver driver = new RemoteWebDriver(new URL("http://52.165.20.6:4444/wd/hub"), caps);
    driver.get("http://www.google.com");
    
    WebElement element = driver.findElement(By.name("q"));

    element.sendKeys("BrowserStack");
    element.submit();

    System.out.println(driver.getTitle());
    driver.quit();
    

  }
}
