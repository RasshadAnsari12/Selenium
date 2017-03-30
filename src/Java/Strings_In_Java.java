package Java;

import org.testng.annotations.Test;
// 
public class Strings_In_Java

{
	@Test(priority=1)
	public void To_LowerCase()
	{

		String a="ABCDEFGH";
		String b=a.toLowerCase();

		System.out.println(b);

	}
	@Test(priority=2)
	public void To_UpperCase()
	{
		String a="abcdefgh";
		String b=a.toUpperCase();
		System.out.println(b);
	}
	@Test(priority=3)
	public void Length()              
	{
		String a="abcdefgh";
		int b=a.length();                //It finds the length of the string
		System.out.println(b);

	}
	@Test(priority=4)
	public void Equals()
	{
		String a="abcdefgh";
		boolean c=a.equals("abcdefgh");
		System.out.println(c);
	}
	@Test(priority=5)
	public void EqualIgnoreCase()            //It is same as above method
	{
		String a="ABCDEFGH";
		boolean c=a.equalsIgnoreCase("abc");

	}
	@Test(priority=6)
	public void CompareTo()              
	{
		String a="ABCDEFGH";
		int b=a.compareTo("abcdefgh");  //it compares two strings based on ASCII values. If 'a' is greater than b, It returns +ve value, If 'b'
		//is greater than 'a', it returns -ve values. If both are same it returns 0.
		System.out.println(b);


	}
	@Test(priority=7)
	public void Replace()            //It replaces old char with a new char
	{
		String a="ABBO";

		//Syntax ::  String var2=var1.replace('oldchar','newchar');
		String b=a.replace('B', 'K');
		System.out.println(b);

	}
	@Test(priority=8)
	public void Concat()
	{
		String a="abc";
		String b=a.concat("defgh");
		System.out.println(b);
	}
	@Test(priority=9)
	public void SubString()
	{
		String a="RasshadAnsari";

		String b=a.substring(7);     //It is used to get the portion of the given string
		System.out.println(b);

	}
	@Test(priority=10)
	public void StartsWith()
	{
		String a="Rasshad";
		boolean b=a.startsWith("Ras");           //It tests whether string starts with given matching pattern or not
		System.out.println(b);

	}

	@Test(priority=11)
	public void EndsWith()
	{

		String a="Rasshad";
		boolean b=a.endsWith("had");           //It tests whether string with with given matching pattern or not
		System.out.println(b);
	}



	//--------------------------------------------------------------------------------------
	// String object does not allow to insert new characters in middle of the string. It does not allow to delete chatracters from string.
	//The string size does not grow and shrink during program execution......To overcome this problem the java developers introduced STRING BUFFER
	//class defined in lang package. 
	//StringBuffer class contains three contructors. It means there are three methods for object declaration.
	//------>StringBuffer obj=new StringBuffer();------system allocates memory of 16 characters
	//------>StringBuffer obj=new StringBuffer(size);-------> It allocates memory of given size.
	//------>Stringbuffer obj=new StringBuffer(string obj, "string");----> It allocates memory for given string and additionally it allocates
	//memory for 16 characters.




	@Test(priority=12)
	public void Capacity()
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());    ///it allocates memory of 16 characters.
		System.out.println(sb.length());  



		StringBuffer sb1=new StringBuffer("abc");  //It allocates memory of 16 character and additionally memory of the given string.
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());  

	}
	@Test(priority=13)
	public void Reverse()
	{
		StringBuffer sb=new StringBuffer("ABC");
		System.out.println(sb.reverse());   
}
	
	@Test(priority=14)
	public void Delete()                   //It removes characters from stringBuffer object for given range.
	{
		StringBuffer sb=new StringBuffer("abcdefgh");
		sb.delete(3, 7);
		System.out.println(sb);
	}
	@Test(priority=15)
	public void deletecharAt()                   //It deletes characters from stringBuffer object for given position
	{
		StringBuffer sb=new StringBuffer("abcdefgh");
		sb.deleteCharAt(3);
		System.out.println(sb);
}
}











