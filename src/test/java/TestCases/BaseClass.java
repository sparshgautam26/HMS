package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ReadConfige;

public class BaseClass {
	
	ReadConfige config = new ReadConfige();
	
     String url =  config.getURL();
	 String username = config.getUsername();
	 String password = config.getPassword();
	 
	 static WebDriver driver;
	 
	 @BeforeClass
	 public void setUp()
	 {
		  ChromeOptions options = new ChromeOptions();
		  
	        options.addArguments("--remote-allow-origins=*");

	        driver = new ChromeDriver(options);
	        
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        driver.get(url);
		 
	        
	 }
	 
	 
	 @AfterClass
	 public void tearDown() throws InterruptedException
	 {
		 Thread.sleep(5000);
		 driver.quit();
	 }
	            

}
