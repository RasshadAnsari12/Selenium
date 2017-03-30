package TestNG2;

import org.testng.annotations.Test;

public class Dependency {


	@Test
	public void MethodB()

	{
		System.out.println("Opening Browsers");

	}
	@Test(dependsOnMethods="MethodB",alwaysRun=true) //MethodA() if MethodB has no problem
	public void MethodA() 							// here alwaysRun attribute enables methodA() to run even if MethodB() fails.
	{
		System.out.println("go to yahoo.com");

	}

	@Test(enabled=false)    // this attribute disables the testcase to be run  :: 
	public void MethodC()
	{
		System.out.println("click sin in button");
	}

	@Test(timeOut=5000)    //this attribute is used whether this test runs in 5 sec or not

	public void MethodD()
	{
		System.out.println("Enter user name and password");
	}
}