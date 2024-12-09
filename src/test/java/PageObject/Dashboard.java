package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	WebDriver ldriver;

	public Dashboard(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	// locate the number of table rows
	
	@FindBy(xpath ="//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//tr")
	List<WebElement> tablerows;
	
	
	
	
	// Access through each row and find the full name from column " Full Name"
	
	public void findNameAndClick(String nameFind)
	{
		for(int i=1;i<=tablerows.size();i++)
		{
			WebElement fullname = tablerows.get(i-1).findElement(By.xpath("//table//tbody//tr["+i+"]//td[3]"));
			String name = fullname.getText();
			
			// Compare the full name with Vinay Singh
			
			if(name.equalsIgnoreCase(nameFind))
			{
				System.out.println("Found Name");
				
				      WebElement viewdetails =  tablerows.get(i-1).findElement(By.xpath("//table//tbody//tr["+i+"]//td[7]"));
				      
				   // locate the view details button and click

				      viewdetails.click();
				      break;
			
			}
		}
	}


	

	
	
	
}
