package com.saucdemo.TESTpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucdemo.POMpack.Homepomclass;

public class TC04_varifyallproductselect extends Testbaseclass
{       
	    
	     
        @Test
        public void varifyallprodslect()
        {
         
        //all products select
		Homepomclass hp = new Homepomclass(driver);
		hp.clickAllProducts();
		System.out.println("All products will be get selected");
		
		//validation
		System.out.println("Apply Validation");
				
		String exepctedProductCount = "6";	
		String actualProductCount = hp.getTextOfAddToCartButton();
		System.out.println("total products selected are->"+actualProductCount);
		
		
	    Assert.assertEquals(exepctedProductCount, actualProductCount);
        }
        }

