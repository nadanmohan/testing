package testngconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
	WebDriver odriver; 

	  @BeforeTest // It will be executed before any of the execution of the test method only once. 
	   public void setupDriver() 
	   { 
	
	     odriver = new ChromeDriver(); 
	     odriver.manage().window().maximize(); 
	     String URL = "https://pixabay.com/accounts/login/";
	     odriver.get(URL); 
	 } 
	@Test(dataProvider = "myData") 
	public void login(String Username, String Password) 
	{ 
	  WebElement userN = odriver.findElement(By.name("username")); 
	  userN.sendKeys(Username); 
	  
	  WebElement passW = odriver.findElement(By.name("password")); 
	  passW.sendKeys(Password); 
	  
	  WebElement login = odriver.findElement(By.xpath("*//input[@value='Log in']")); 
	   login.click(); 
	  
	   WebElement profileImage = odriver.findElement(By.xpath("*//img[@class='profile_image']")); 
	   profileImage.click(); 
	  
	   WebElement logout = odriver.findElement(By.linkText("Log out")); 
	   logout.click(); 

	    odriver.findElement(By.linkText("Log in")).click(); 
	 } 
	@DataProvider(name = "myData") 
	public Object[ ][ ] loginData() 
	{ 
	  Object[ ][ ] data = new Object[2][2]; 
	   data[0][0] = "1st username"; 
	   data[0][1] = "1st password"; 
	   data[1][0] = "2nd username"; 
	   data[1][1] = "2nd password"; 
	    return data; 
	} 
	@AfterTest 
	public void close() 
	{ 
	   odriver.close(); 
	  } 
}
