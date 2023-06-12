package testngconcept;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	@Test(priority=4)
	public void b()
	{
		System.out.println("This is b");
	}
	@Test(priority=3)
	public void ae()
	{
		System.out.println("This is ae");
	}
	@Test(priority=1)
	public void ad()
	{
		System.out.println("This is ad");
	}
	@Test(priority=6)
	public void c()
	{
		System.out.println("This is c");
	}
	@Test(priority=5)
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
