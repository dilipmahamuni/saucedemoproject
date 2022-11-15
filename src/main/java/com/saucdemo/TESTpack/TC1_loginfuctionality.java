package com.saucdemo.TESTpack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.saucdemo.UTILITYpack.Utilityclass;


 

        public class TC1_loginfuctionality extends Testbaseclass
        
        {       
	   
	    // test validation
	    @Test  // (invocationCount=2)
		public void varifylogin() 
		{
	    //take screenshot
	    //  Utilityclass.getscreenshot(driver,  "homepage");
	     
		//validation
		System.out.println("Apply validation");		
		String expectedTitle = "Swag Labs";   //BA/dev		
		String actaulTitle   =  driver.getTitle();	
	    System.out.println(actaulTitle );
	     
        //hard assertion
		Assert.assertEquals(actaulTitle, expectedTitle);
	    
	    //soft assretion
//	    SoftAssert Soft = new  SoftAssert();
//	    Soft.assertEquals(actaulTitle ,expectedTitle);
//		Soft.assertAll();
		}
        }
		
		
	 
