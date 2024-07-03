package org.pack2;

import org.consumer.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 extends BaseClass{
	
	public LoginPage2()  {
		
	     PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//a[@class = 'shopping_cart_link']")
	private WebElement validate;

	public WebElement getValidate() {
		return validate;
	}
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
	private WebElement remove1;

	public WebElement getRemove1() {
		return remove1;
	}
	
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
	private WebElement remove2;

	public WebElement getRemove2() {
		return remove2;
	}
	
	@FindBy(xpath = "//a[@class = 'shopping_cart_link']")
	private WebElement validate1;

	public WebElement getValidate1() {
		return validate1;
	}
	
	@FindBy(id="checkout")
	private WebElement checkOut;

	public WebElement getCheckOut() {
		return checkOut;
	}

	

}
