package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver ldriver;

	public Login(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(name="username")
	WebElement UserName;

	
	@FindBy(name="password")
	WebElement passWord;
	
	
	@FindBy(id ="form_submit")
	WebElement button;
	
	public void setUsername(String ename)
	{
		UserName.sendKeys(ename);
	}
	
	public void setPassword(String pass)
	{
		passWord.sendKeys(pass);
	}
	
	
	public void signButton()
	{
		button.click();
	}
	
	
	
	
	
}
