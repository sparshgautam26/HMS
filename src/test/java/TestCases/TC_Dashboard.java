package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LeaveDetails;
import PageObject.Login;

public class TC_Dashboard extends BaseClass {
	
	@Test
	public void dashboard() throws InterruptedException
	{
		Login lg = new Login(driver);
		lg.setUsername(username);
		lg.setPassword(password);
		lg.signButton();
		
		Dashboard d = new Dashboard(driver);
		d.findNameAndClick("Vinay Singh");
		
		LeaveDetails lt = new LeaveDetails(driver);
	    lt.clickSetAction();
		Thread.sleep(5000);
		lt.selectType("Approve");
		Thread.sleep(5000);
		lt.enterDescription("Approved");
		lt.clickApply();
	}
	

}
