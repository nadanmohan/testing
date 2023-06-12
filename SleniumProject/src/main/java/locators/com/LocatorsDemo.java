package locators.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException  {
		/*//1.
			WebDriverManager.chromedriver().setup();
			WebDriver odriver=new ChromeDriver();
			odriver.get("https://www.saucedemo.com/");
			String title=odriver.getTitle();
			System.out.println(title);
			odriver.findElement(By.id("user-name")).sendKeys("standard_user");
			odriver.findElement(By.id("password")).sendKeys("secret_sauce");
			odriver.findElement(By.id("login-button")).click();		
			odriver.quit();
			
			*/
		/*	//2.
			
			WebDriverManager.chromedriver().setup();
			WebDriver odriver=new ChromeDriver();
			odriver.get("https://www.saucedemo.com/");
			String title=odriver.getTitle();
			System.out.println(title);
			WebElement un=odriver.findElement(By.id("user-name"));
			un.sendKeys("standard_user");
			WebElement pw=odriver.findElement(By.id("password"));
			pw.sendKeys("secret_sauce");
			WebElement login=odriver.findElement(By.id("login-button"));
			login.click();
			odriver.quit();
			*/
			
	/*	//2.By.name	
		WebDriverManager.chromedriver().setup();
		WebDriver odriver=new ChromeDriver();
		odriver.get("https://classic.crmpro.com/login.cfm");
		String title=odriver.getTitle();
		System.out.println(title);
		WebElement un=odriver.findElement(By.name("username"));
		un.sendKeys("test@gmail.com");
		WebElement pw=odriver.findElement(By.name("password"));
		pw.sendKeys("test@123");
		WebElement login=odriver.findElement(By.xpath("//input[@class='btn btn-small']"));
		login.click();
		odriver.quit();
		*/
		//2.example
		/*
				WebDriverManager.chromedriver().setup();
				WebDriver odriver=new ChromeDriver();
				odriver.get("https://www.actitime.com/");
				String title=odriver.getTitle();
				System.out.println(title);
				Thread.sleep(3000);
				WebElement wee=odriver.findElement(By.className("home-page__button home-page__button--start-trial button"));
				wee.click();
				
				String title2=odriver.getTitle();
				System.out.println(title2);
				//Passing the first name
				WebElement we2=odriver.findElement(By.id("FirstName"));
				we2.sendKeys("Nucot");
				//passing the last name to the text
				WebElement we3=odriver.findElement(By.xpath("//a[contains(text(),'Get started')]"));
				we3.sendKeys("company");
				odriver.quit();
				*/
		
	/*	//3.By.className	
				WebDriverManager.chromedriver().setup();
				WebDriver odriver=new ChromeDriver();
				odriver.get("https://www.saucedemo.com/");
				String title=odriver.getTitle();
				System.out.println(title);
				WebElement oele=odriver.findElement(By.className("login_credentials_wrap"));
				String s= oele.getText();
				System.out.println(s);
				odriver.quit();				
			*/
				
				//input[@title='Search for products, brands and more']	
				
			/*	//SendKeys example
				WebDriverManager.chromedriver().setup();
				WebDriver odriver=new ChromeDriver();
				odriver.get("https://gmail.com/");
				String title=odriver.getTitle();
				System.out.println(title);
				WebElement we=odriver.findElement(By.id("identifierId"));
				we.sendKeys("Somashekar");
				Thread.sleep(3000);
				odriver.quit();
				*/
				
				
				
				
		//4.example-->linkText
		/*		
		WebDriverManager.chromedriver().setup();
		WebDriver odriver1=new ChromeDriver();
		odriver1.get("https://in.mail.yahoo.com/");
		Thread.sleep(3000);
		odriver1.findElement(By.linkText("Let's go")).click();
		Thread.sleep(3000);
		odriver1.quit();
		*/
		/*
		WebDriverManager.chromedriver().setup();
		WebDriver odriver1=new ChromeDriver();
		odriver1.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(3000);
		WebElement lt=odriver1.findElement(By.linkText("Use Custom Domain"));
		lt.click();
		Thread.sleep(3000);
		odriver1.quit();
		*/
		
		//5.cssSelector
		/*WebDriverManager.chromedriver().setup();
		WebDriver odriver2=new ChromeDriver();
		odriver2.get("https://in.mail.yahoo.com/");
		Thread.sleep(3000);
		odriver2.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		WebElement plt=odriver2.findElement(By.cssSelector("#login-username"));
		plt.sendKeys("kroger");
		Thread.sleep(3000);
		odriver2.quit();
		*/
		
		//6.partialLinkText
		WebDriverManager.chromedriver().setup();
		WebDriver odriver2=new ChromeDriver();
		odriver2.get("https://in.mail.yahoo.com/");
		Thread.sleep(3000);
		odriver2.findElement(By.partialLinkText("Upgrade to Mail Plus")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
	}

}
