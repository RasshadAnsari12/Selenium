package Sysro;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Practice {
@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("I am Before Method");
	}
	@Test(priority=3)
	public void Test1()
	{
		System.out.println("Test Case 1");
	}
	@BeforeTest
	public void BeforTest()
	{
		System.out.println("I am Before Test ");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("I am After Method");
	}
	@Test(priority=2)
	public void Test2()
	{
		System.out.println("Test Case 2");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("I am at the End");
	}
	@Test()
	public void Test3()
	{
		System.out.println("Test Case 3");
	}
}
