package com.saucdemo.UTILITYpack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilityclass
{
	 
    public static void getscreenshot(  WebDriver driver, String name) throws IOException
    {  
	// take screenshots
    TakesScreenshot ts =  (TakesScreenshot)driver;
	File sourcefile =ts.getScreenshotAs(OutputType.FILE);
    File destfile= new File("./screenshots/"+name+".jpg");
	FileHandler.copy(sourcefile, destfile);
	 
    }
 
}
