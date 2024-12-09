package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeaveDetails {

	WebDriver ldriver;

	public LeaveDetails(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//button[text()='SET ACTION']")
	WebElement setAction;

	@FindBy(name="status")
	WebElement st;
	

	@FindBy(name="description")
	WebElement des;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement Apply1;
	
	
	public void clickSetAction()
	{
		setAction.click();
	}
	
	
	
	public void selectType(String str)
	{
		Select sc= new Select(st);
				
		sc.selectByVisibleText(str);
	}
	

	public void enterDescription(String desc)
	{
		des.sendKeys(desc);
	}
	
	public void clickApply()
	{
		Apply1.click();
	}
	
	
	
}
