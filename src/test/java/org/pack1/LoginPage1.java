package org.pack1;

import org.consumer.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 extends BaseClass{
	
	public LoginPage1() {
	     PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart1;

	public WebElement getAddToCart1() {
		return addToCart1;
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement addToCart2;

	public WebElement getAddToCart2() {
		return addToCart2;
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement addToCart3;

	public WebElement getAddToCart3() {
		return addToCart3;
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement addToCart4;

	public WebElement getAddToCart4() {
		return addToCart4;
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement addToCart5;

	public WebElement getAddToCart5() {
		return addToCart5;
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement addToCart6;

	public WebElement getAddToCart6() {
		return addToCart6;
	}

	

	
}
