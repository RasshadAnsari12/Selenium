package TestNG2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_ANNOTATIONS {
	@BeforeMethod   // This annotation runs before every test case
	public void POP()
	{
		System.out.println("I am Before Method");
	}
	@Test
	public void  APlan()

	{
		System.out.println("This is Plan A");
	}
	
	@BeforeTest //this annotation runs before a test case :::: note beforemethod runs after beforetest
	public void BeforeTest()
	{
		System.out.println("I run before a test case ");
	}
	
	@AfterTest //this annotations runs after all the test cases 
	public void AfterTest()
	{
		System.out.println("i run at the end");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		
		System.out.println("This is After Method");
	}
	@Test
	public void BPlan()

	{
		System.out.println("This is Plan B");
	}
	
	
	
	
}



