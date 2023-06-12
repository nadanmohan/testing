package testngconcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Oderofexecution {
	//global precondition
	// Preconditions
	//test case--test script(steps)-->actual with expected---Assertion
	//post conditions
	//post global conditions
	
	@BeforeSuite
	void a()
	{
		System.out.println("setup DB Connections");
	}
	
	@BeforeTest
	void b()
	{
		System.out.println("launch");
		
	}
	
	@BeforeClass
	void c()
	{
		System.out.println("Url");
	}
	
	@BeforeMethod
	void d()
	{
		System.out.println("open login");
	}
	
	
	@Test
	void e()
	{
		System.out.println("landing");
	}
	@Test
	void ee()
	{
		System.out.println("landing");
	}
	@Test
	void eee()
	{
		System.out.println("landing");
	}
	
	@AfterMethod
	void dd()
	{
		System.out.println("After method landing");
	}
	
	@AfterClass
	void cc()
	{
		System.out.println("After classlanding");
	}
	
	@AfterTest
	void bb()
	{
		System.out.println("After Test landing");
		
	}
	
	@AfterSuite
	void aa()
	{
		System.out.println("After suite landing");
		
	}
	
	
	
	

}
