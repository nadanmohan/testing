package testngconcept;

import org.testng.annotations.Test;

public class ExceptionExpectedConcept {
	
	
	
	@Test(expectedExceptions= {Exception.class,ArithmeticException.class,NullPointerException.class})
	public void add()
	{
		System.out.println("hello hi");
		int a=9/0;
		System.out.println("Thanks");
		
		
	}

}
