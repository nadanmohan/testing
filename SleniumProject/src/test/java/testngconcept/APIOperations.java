package testngconcept;

import org.testng.annotations.Test;


//chaining concept(DependOnmethod)
public class APIOperations {
	
	//API--Application programming interface
	//CURD Operations-->Creating(Post),updating(Put),getting(get),deleting(delete)

	void createUserDeatils()
	{
		System.out.println("user details");
	}
	void updateUserDeatils()
	{
		System.out.println("update details");
	}
	
	void getUserDeatils()
	{
		System.out.println("get details");
	}
	void delteUserDeatils()
	{
		System.out.println("delete details");
	}
	
	
	@Test(priority=1)
	void createUserDeatilsTest()
	{
		System.out.println("This user create method");
		createUserDeatils();//post
		//assertions
	}
	@Test(priority=2)
	void getUserDeatilsTest()
	{
		System.out.println("This user get details method");
		createUserDeatils();//.post
		getUserDeatils();//get call
		
	}
	@Test(priority=3)
	void updateUserDeatilsTest()
	{
		System.out.println("This user update details method");
		createUserDeatils();//post
		getUserDeatils();//get
		updateUserDeatils();//put
		getUserDeatils();//get
		
	}
	
	@Test(priority=4)
	void delteUserDeatilsTest()
	{
		System.out.println("This user delete method");
		delteUserDeatils();//delete
		
	}

}
