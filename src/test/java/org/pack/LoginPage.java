package org.pack;

import org.consumer.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
	     PageFactory.initElements(driver, this);
		}

		@FindBy(id="user-name")
		private WebElement userName;

		public WebElement getUserName() {
			return userName;
		}
		
		@FindBy(id="password")
		private WebElement password;
		
		public WebElement getPassword() {
			return password;
		}
		
		@FindBy(xpath="//input[@id='login-button']")
		private WebElement login;
		
		public WebElement getLogin() {
			return login;
		}
		
		

	}


