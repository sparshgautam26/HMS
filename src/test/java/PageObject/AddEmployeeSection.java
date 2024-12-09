package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddEmployeeSection {


	WebDriver ldriver;

	public AddEmployeeSection(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="empcode")
	WebElement ID;
	
	@FindBy(name="firstName")
	WebElement first;
	
	@FindBy(name="lastName")
	WebElement last;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="department")
	WebElement department;
	
	@FindBy(name="gender")
	WebElement type;
	
	@FindBy(name="dob")
	WebElement Date;
	
	@FindBy(name="mobileno")
	WebElement number;
	
	@FindBy(name="country")
	WebElement cnt;
	
	@FindBy(name="address")
	WebElement addr;
	
	@FindBy(name="city")
	WebElement cty;
	
	@FindBy(name="password")
	WebElement psw;
	
	@FindBy(name="confirmpassword")
	WebElement cnfpwd;
	
	public void setID(String aid)
	{
		ID.clear();
		ID.sendKeys(aid);
	}
	
	public void setFirstName(String ename)
	{
		first.sendKeys(ename);
	}
	
	public void setLastName(String elast)
	{
		last.sendKeys(elast);
	}
	
	public void setEmailAddress(String emal)
	{
		email.sendKeys(emal);
	}
	
	public void setDepartment(String dep)
	{
		Select sc = new Select(department);
		sc.selectByVisibleText(dep);
	}
	
	public void setGender(String gen)
	{
		Select sc1 = new Select(type);
		sc1.selectByVisibleText(gen);
	}
	
	public void setDOB(String dd,String mm,String yyyy)
	{
		Date.sendKeys(dd);
		Date.sendKeys(mm);
		Date.sendKeys(yyyy);
	}
	

	
	public void setMobile(String no)
	{
		
		number.sendKeys(no);
	}
	
	public void setCountry(String cn)
	{
		cnt.sendKeys(cn);
	}
	
	
	public void setAddress(String adr)
	{
		addr.sendKeys(adr);
	}
	
	public void setCity(String cty1)
	{
		
		cty.sendKeys(cty1);
	}
	

	public void setPassword(String pwdr)
	{
		psw.sendKeys(pwdr);
	}
	
	public void setConfirmPassword(String cnfpw)
	{
		cnfpwd.sendKeys(cnfpw);
	}
}

