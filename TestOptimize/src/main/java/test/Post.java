package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Post 
{
	@Test
	public void m1()
	{
		System.out.println("Method 1");
//		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void am()
	{
//		System.out.println("After Method");
		Assert.assertTrue(false);
	}
	
	@Test
	public void m2()
	{
		System.out.println("Method 2");
	}
}
