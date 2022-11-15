package com.saucdemo.TESTpack;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucdemo.POMpack.Homepomclass;

public class TC3_varifybagproductfunctionality extends Testbaseclass
{    
	
	
	   
		@Test
        public void varifyaddtocart()
        
		{
	   
	    Homepomclass hp = new Homepomclass(driver);
		hp.clickAddToCartBagButton();
		System.out.println("Bag Product is selected"); 
	    
		 
        //validation
		System.out.println("Apply Validation");
		
		String exepctedProductCount = "1";	
		String actualProductCount = hp.getTextOfAddToCartButton()  ;
	
		 //hard assertion
		Assert.assertEquals(actualProductCount,exepctedProductCount) ;
        }
		 
	    }

