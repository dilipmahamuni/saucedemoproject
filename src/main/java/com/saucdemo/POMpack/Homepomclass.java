package com.saucdemo.POMpack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
 

public class Homepomclass
{
	private WebDriver driver;
	private Select S;
	
	//menuBtn
	@FindBy(xpath ="//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	public void clickOnMenuButton()
	{
		menuButton.click();
	}

	//logOutBtn
	@FindBy(xpath ="//a[@id='logout_sidebar_link']")
	private WebElement logOutButton;
	
	public void clickOnLogOutButton()
	{
		logOutButton.click();
	}
	

	//bagEle
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagProduct;
	
	public void clickAddToCartBagButton()
	{
		bagProduct.click();;
	}
	
	//add to cart ele
	@FindBy(xpath ="//a[@class='shopping_cart_link']")
	private WebElement addToCartLink;
	
	public String getTextOfAddToCartButton()
	{
		String actualCount= addToCartLink.getText();
		return actualCount;
	}
	

	//all product ele
	@FindBy(xpath ="//button[text()='Add to cart']")
	private List<WebElement> allProducts;
	
	public void clickAllProducts()
	{
	   // use for each loop as assigment
			
			for(int i=0; i<allProducts.size();i++)
			{
				allProducts.get(i).click();
			}	
	
	}	
	
	public  Homepomclass(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver ,this);
		  S = new Select(filterDropDown);
	}
	
	
	//filter dropdown
    @FindBy(xpath ="//select[@class='product_sort_container']")
	private WebElement filterDropDown;
    
    public void clickFilterDropDown()
    {
    	filterDropDown.click();
    	 
        S.selectByValue("za");    	
    }
	 
}
