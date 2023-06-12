package locators.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathConcept2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver odriver=new ChromeDriver();
		odriver.get("https://app.hubspot.com/login");
		/*WebElement ole=odriver.findElement(By.xpath("//input[@type='email' and contains(@type,'email')]"));
		ole.sendKeys("abc");
		*/
		
		WebElement ole=odriver.findElement(RelativeLocator.with(By.xpath("//input[contains(@id,'username')]")).above(By.xpath("//input[@id='password']")));
		ole.sendKeys("abc");
		
		WebElement ole1=odriver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]"));
		ole1.sendKeys("abcd123");
		Thread.sleep(3000);
		
		//toLeftOf example
		//1.singup-->//i18n-string[@data-key='login.signupLink.text']
		WebElement ole2=odriver.findElement(RelativeLocator.with(By.xpath("//i18n-string[@data-key='login.signupLink.text']")).toLeftOf(By.xpath("//i18n-string[@data-key='login.signupLink.cta']")));
		String ss=ole2.getText();
		System.out.println(ss);
		
		
		
		odriver.quit();
		
		
		//Customized Xpath 
		//userName
		//1.//input[@id='username']

		//2.//input[@type='email']
		//3.//input[@class='form-control private-form__control login-email']
		
		
		//password
		//1.//input[@id='password']

		//2.//input[@type='password']

		//3.//input[@class='form-control private-form__control login-password m-bottom-3']
		
		
		//contains()-->in xpath
		
		/*<input id="username" type="email" 
		tabindex="1" aria-labelledby="UIFormControl-label-2"
		class="form-control private-form__control login-email" value="">
		*/
			//syntax
			//tagName[contains(@pro,'value')]
		
		//1.//input[contains(@id,'username')]
		//2.//input[contains(@class,'form-control')]
		
		//3.//input[contains(@id,'username') and @id='username']
		//4.//input[@id='username' and contains(@id,'username')]
		//5.//input[@type='email' and contains(@type,'email')]
		
		
		//indexbased
		/*
		 * (//input[contains(@class,'form-control')])[1]
		 */
		
		//postionbased
		/*
		 * (//input[contains(@class,'form-control')])[position()=1]
		 */
		/*
		 * 
		 * (//input[contains(@class,'form-control')])[last()]
		 * 
		 */
		/*
		 *  RelativeLocators--in new version
		 * 
		 * 
		 */
		
		//1.//input[@id='password']
		
		//RelativeLocator.with(By.xpath("//input[contains(@id,'username')]")).above(By.xpath("//input[@id='password']"));
		//1.above
		//2.below
		//3.toLeftOf
		//4.toRightOf
		//5.near
	
	
		
		//Password
		//1.//input[@id='password']

		//2.//input[@type=‘password’]

		//3.//input[@class=‘form-control private-form__control login-password m-bottom-3’]
		
		//indexbased
				/*
				 * (//input[contains(@class,'form-control')])[2]
				 */
		
		
		//.--->//text()
		// syntax-->//tagName[text()='value']
		//1.//i18n-string[text()='Email address']
		//2.//i18n-string[text()='Password']
		//-->//h5[text()="That email address doesn't exist."]
		//-->//i18n-string[contains(text(),'Email address')]
		//-->//span[contains(text(),'Show Password')]
		
		
		
		
		

	}

}
