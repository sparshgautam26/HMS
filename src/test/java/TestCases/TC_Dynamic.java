package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import PageObject.Dynamic;

public class TC_Dynamic {

	
	@Test
	public void loginTest() throws InterruptedException
	{

		  ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
			WebDriver driver = new ChromeDriver(options);
			 
			driver.manage().window().maximize(); 
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
			
			Dynamic dc = new Dynamic(driver);
			
		    dc.findNameAndClick("Router");
	}
}
