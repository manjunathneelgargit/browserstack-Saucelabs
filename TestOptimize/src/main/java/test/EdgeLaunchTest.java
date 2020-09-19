package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunchTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "./msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

	}

}
