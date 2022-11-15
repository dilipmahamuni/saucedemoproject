package com.saucdemo.TESTpack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucdemo.POMpack.loginpomclass;

public class Testbaseclass
{
	WebDriver driver;
	@Parameters("browserName")
    @BeforeMethod  // logout functionality
    public  void setup( String browserName)
    { if(browserName.equals( "chrome"))
    {
    // Test Steps
	System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	driver = new ChromeDriver();	
    }
    else
    {
	System.setProperty("webdriver.gecko.driver","./DriverFiles/geckodriver.exe");
	driver = new FirefoxDriver();
    }
	
	System.out.println("Browser is opened");
	
	driver.manage().window().maximize();
	System.out.println("Browser is maximzed");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("Url is opened");
	System.out.println("Went on LoginPage");
	
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//loginActivity
	loginpomclass lp = new loginpomclass(driver);
	lp.sendUsername();
	System.out.println("Username is entered");
	
	lp.sendPassword();
	System.out.println("Password is entered");
	
	lp.clickLoginButton();
	System.out.println("Clicked on login Button");
	
	//homePage
	System.out.println("Went on HomePage");
    }
    
    @AfterMethod() // logout functionality
    public void teardovn()
	{driver.quit();
	System.out.println("browser is closed");
	}
    
    
    
}
