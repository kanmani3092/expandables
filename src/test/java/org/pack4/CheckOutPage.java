package org.pack4;

import org.consumer.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BaseClass{
	
	
	public CheckOutPage()  {
		
	     PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//input[@id='first-name']")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}

	@FindBy(xpath = "//input[@id='last-name']")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(xpath = "//input[@id='postal-code']")
	private WebElement postalCode;

	public WebElement getPostalCode() {
		return postalCode;
	}
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement contin;

	public WebElement getContin() {
		return contin;
	}	

	@FindBy(xpath = "//button[@id='finish']")
	private WebElement finish;

	public WebElement getFinish() {
		return finish;
	}	
	
	@FindBy(xpath = "//button[@id='back-to-products']")
	private WebElement backBtn;

	public WebElement getBackBtn() {
		return backBtn;
	}	
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement homeBtn;

	public WebElement getHomeBtn() {
		return homeBtn;
	}	
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logOut;

	public WebElement getLogOut() {
		return logOut;
	}	
}
