package com.saucdemo.TESTpack;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_logoutfunctionality extends Testbaseclass
        {     
	    
	 
		@Test 
	    public void varifylogout()
	    {
//		 
		//validation
		System.out.println("Apply validation");		
		String expectedTitle = "Swag Labs";   //BA/dev		
		String actaulTitle   =  driver.getTitle();
		
		// hard assertion
		Assert.assertEquals(actaulTitle, expectedTitle);
        }
		 
			
		     
			 
	    }

