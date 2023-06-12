package testngconcept;

import org.testng.annotations.Test;

public class Priority2 {

	@Test
	public void b()
	{
		System.out.println("This is b");
	}
	@Test
	public void ae()
	{
		System.out.println("This is ae");
	}
	@Test
	public void ad()
	{
		System.out.println("This is ad");
	}
	@Test
	public void c()
	{
		System.out.println("This is c");
	}
	@Test(priority=1)
	public void e()
	{
		System.out.println("This is e");
	}
	@Test(priority=2)
	public void f()
	{
		System.out.println("This is f");
	}

	
	
}
