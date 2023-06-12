package testngconcept;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	

	@Test(priority=1,expectedExceptions= Exception.class)
	public void loginPage()
	{
		System.out.println("This is login page");
		int a=2/0;
	}
	@Test(priority=2,dependsOnMethods="loginPage",expectedExceptions= Exception.class)
	public void homePage()
	{
		System.out.println("This is home page");
		int b=5/0;
	}
	
	@Test(priority=3,dependsOnMethods= {"loginPage","homePage"})
	public void productList()
	{
		System.out.println("This is ProductList page");
	}
}
	
	
	
	
	


