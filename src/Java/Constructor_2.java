package Java;



class ClassName

{
	int a,b,x,y;
	ClassName()
	{
		System.out.println("I am default Constructor");
		a=10;
		b=20;
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		
		
	}
	
	ClassName(int a,int b)
	{
		System.out.println("I am parametrised constructor");
	    x=a;
		y=b;
		System.out.println("x value is "+a);
		System.out.println("y value is "+b);
		
	}
	ClassName(ClassName name1)
	{
		System.out.println("I am parametrised constructor");
	    x=name1.a;
		y=name1.b;
		System.out.println("x value is "+a);
		System.out.println("y value is "+b);
}



public class Constructor_2 {

	public void main(String[] args)
	{
ClassName name=new ClassName();
ClassName name1=new ClassName(30,40);
ClassName name2=new ClassName(name1);


	}
}
}
