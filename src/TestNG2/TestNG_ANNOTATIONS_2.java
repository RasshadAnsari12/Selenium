package TestNG2;

public class TestNG_ANNOTATIONS_2 
{
	
	
@org.testng.annotations.BeforeSuite
public void BeforeSuite()
{
	System.out.println(" I am the first");
}

@org.testng.annotations.AfterSuite
public void AfterSuite()
{
	System.out.println("I am the last");
}

}
