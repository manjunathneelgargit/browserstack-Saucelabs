package com.Saucelabs.TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Saucelabs.Base.Base;

public class Google extends Base
{
	@Test
	public void googleTest()
	{
		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("BrowserStack");
		element.submit();

		System.out.println(driver.getTitle());
	}
}
