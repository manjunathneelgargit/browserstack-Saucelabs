package dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase 
{
	@Test(dependsOnMethods = "TC6")
	public void TC1()
	{
		System.out.println("Running TC1");
	}
	@Test(dependsOnMethods = "TC1")
	public void TC2()
	{
		System.out.println("Running TC2");
	}
	@Test(dependsOnMethods = "TC1")
	public void TC3()
	{
		System.out.println("Running TC3");
	}
	@Test(dependsOnMethods = "TC1")
	public void TC4()
	{
		System.out.println("Running TC4");
	}
	@Test(dependsOnMethods = "TC1")
	public void TC5()
	{
		System.out.println("Running TC5");
	}
	@Test
	public void TC6()
	{
		System.out.println("Running TC6 - 1 Time");
		Assert.assertTrue(false);
		System.out.println("Running TC6");
	}
}
