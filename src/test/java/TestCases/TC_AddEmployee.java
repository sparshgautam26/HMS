package TestCases;

import org.testng.annotations.Test;

import PageObject.AddEmployeeSection;
import PageObject.Dashboard;
import PageObject.Login;

public class TC_AddEmployee extends BaseClass {
	
	@Test
	public void addEmployeesDetails()
	{
		Login lp = new Login(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		lp.signButton();
		
			
	}

}
