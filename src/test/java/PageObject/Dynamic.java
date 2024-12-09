package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dynamic {
	

	WebDriver ldriver;

	public Dynamic(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="//ul[@class='pagination']//a")
	List<WebElement> paginationLinks;
	
	@FindBy(xpath="//table[@id='productTable']//tr")
	List<WebElement> tablerows;
	
	public void findNameAndClick(String ename) throws InterruptedException
	{
		boolean nameFound=false;
		
		for(int pageIndex =1;pageIndex<paginationLinks.size();pageIndex++)
		{
			for(int i=1;i<tablerows.size();i++)
			{
								
				WebElement fullname = tablerows.get(i-1).findElement(By.xpath("//table[@id='productTable']//tbody//tr[" +i+ "]//td[2]"));
				String name =fullname.getText();
				
				System.out.println("Searching name in row " + i + ": " + name);
				
				if(name.equals(ename))
				{
					System.out.println("Name Found");
					
					WebElement checkbox =tablerows.get(i-1).findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]//td[4]//input"));
					checkbox.click();
					
					nameFound = true;
					break;
				}
			}
			
			if(nameFound==true)
			{
				break;
			}
			
			if(pageIndex<paginationLinks.size())
			{
				WebElement nextpage=paginationLinks.get(pageIndex);
				nextpage.click();
			}
			
		}
		
		
	
	if(nameFound==false)
	{
		System.out.println("Element Not found in the table");
	}

	}
}