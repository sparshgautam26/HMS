package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfige {

	Properties pro;
	
	String path = "/home/yagvendra/Documents/PracticalMaven/Java/Configuration/confige.properties";
	
	public ReadConfige() 
	{
		pro = new Properties();
		
		try {
		
		FileInputStream file = new FileInputStream(path);
		
		pro.load(file);
		
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e.getMessage());
		}
		
	}
	
    public String getURL()
    {
    	String Url =pro.getProperty("baseUrl");
    	
    	return Url;
    }
    
    public String getUsername()
    {
    	String username = pro.getProperty("username");
    	return username;
    }
    
    public String getPassword()
    {
    	String password = pro.getProperty("password");
    	return password;
    }
    
	
	
}
