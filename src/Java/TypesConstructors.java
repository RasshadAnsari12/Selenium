package Java;
public class TypesConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t1=new Test();
Test t2=new Test(10);
Test t3=new Test(10,20f);
Test t4=new Test(10,20f,30000);

	}
}

class Test
{ 
int a,b;
float c;
double d;
	Test()  //Default Constructor
	{
		a=23;
		d=24;
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);
		System.out.println("Default Constructor");
		
		
	}
	
	Test(int x)  // Parametrised constructor
	{
		a=x;
		b=x;
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);
		System.out.println("Parametrised Constructor");
	}
	Test(int x, float y)    // Overloaded Constructor "It's signatures will be different 
	{
		a=x;
		c=y;
	}
    Test(int x, float y, double z) // Overloaded constructor, its singnature is different here
    {
    	a=x;
    	c=y;
    	d=z;
    	System.out.println("Value of a ="+a);
		System.out.println("Value of c ="+c);
		System.out.println("Value of d ="+z);

		System.out.println("Overloaded Constructor");

    }
}

