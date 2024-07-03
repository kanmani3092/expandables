package org.validate;

import java.io.IOException;

import org.consumer.BaseClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pack.LoginPage;
import org.pack1.LoginPage1;
import org.pack2.LoginPage2;
import org.pack4.CheckOutPage;


public class TestScript extends BaseClass {
	
	
	public static BaseClass base = new BaseClass();
	public static LoginPage loginPage = new LoginPage();
	public static LoginPage1 page1 = new LoginPage1();
	public static LoginPage2 page2 = new LoginPage2();
	public static CheckOutPage page3 = new CheckOutPage();
	
	
	@BeforeClass
	
	public static void BrowserLaunch() throws IOException, InterruptedException {
		 base = new BaseClass();
		base.getDriver("Chrome");
		base.getUrl("https://www.saucedemo.com/");
		base.screenCapture("Home");
	}

		// tO LoginPage
	@Before
		public void LoginPageValidation() throws IOException, InterruptedException {
		loginPage = new LoginPage();

//		WebElement userLogin = loginPage.getUserName();
//		 boolean displayed = userLogin.isDisplayed();
//		    if (displayed) {
//				System.out.println("User in Login Page");
//			} else {
//				System.out.println("User Not in LoginPage");
//	
//			}

			if (loginPage.getLogin().isDisplayed()) {
				System.out.println("User is in LoginPage");
			} else {
				System.out.println("User Not in LoginPage");
			}

			}
	@Test
			
		public void EnterLoginCredentials() throws IOException, InterruptedException {
			
	    WebElement userName = loginPage.getUserName(); 
		base.textSend(userName, "standard_user");
		base.screenCapture("user");

		WebElement password = loginPage.getPassword();
		base.textSend(password, "secret_sauce");
		base.screenCapture("password");

		WebElement login = loginPage.getLogin();
		login.click();

		base.sleep(5000);

		base.screenCapture("AfterLogin");
		
		// to Loginpage1
		
		 page1 = new LoginPage1();
		 
		// base.alert("Accept");
		
		WebElement addToCart1 = page1.getAddToCart1();
		addToCart1.click();
		
		WebElement addToCart2 = page1.getAddToCart2();
		addToCart2.click();
		
		WebElement addToCart3 = page1.getAddToCart3();
		addToCart3.click();
		
		WebElement addToCart4 = page1.getAddToCart4();
		addToCart4.click();
		
		WebElement addToCart5 = page1.getAddToCart5();
		addToCart5.click();
		
		WebElement addToCart6 = page1.getAddToCart6();
		addToCart6.click();
		
		//base.scroll(addToCart6, "Up");
		
		
		
		// to Loginpage2
	
	
		 page2 = new LoginPage2();
		 
		 WebElement validateTheCarttext = page2.getValidate();
		 String text = validateTheCarttext.getText();
		 System.out.println("the cart given value is " + text);
		 
		 if(validateTheCarttext.isDisplayed())
		 {
			 System.out.println("Cart has added 6 items");}
		 
		 else {
			 System.out.println("Cart has not added 6 items");
		 }
		  
				
	    WebElement validate = page2.getValidate();
	    validate.click();
				
		WebElement remove1 = page2.getRemove1();
		remove1.click();
		
		WebElement remove2 = page2.getRemove2();
		remove2.click();
		
		WebElement validate1 = page2.getValidate1();
		validate1.click();
		
		WebElement validate2 = page2.getValidate1();
		String text1 = validate2.getText();
		System.out.println("the cart given value is" + text1);
		
		if(page2.getValidate1().isDisplayed())
		 {
			 System.out.println("Cart has added 4 items");}
		 
		 else {
			 System.out.println("Cart has not added 4 items");
		 }
		
		Thread.sleep(3000);
		
		WebElement checkout = page2.getCheckOut();
		checkout.click();
		
		
//		if(checkout.isDisplayed())
//		 {
//			 System.out.println("CheckOut Page is Appeared");}
//		 
//		 else {
//			 System.out.println("CheckOut Page is Not Appeared");
//		 }
		

		// to checkOut
		
	     page3 = new CheckOutPage();
		
	    WebElement firstName = page3.getFirstName();
	    base.textSend(firstName, "kanmani");
	    
	    WebElement lastName = page3.getLastName();
	    base.textSend(lastName, "B");
	    
	    WebElement postalCode = page3.getPostalCode();
	    base.textSend(postalCode, "100");
	    
	    WebElement contin = page3.getContin();
	    contin .click();
	    
	    Thread.sleep(3000);
	    
	    
	    
//	    if (contin.isDisplayed()) {
//
//			System.out.println(" Successfully Loged in and Is in CheckOut OverView Page");
//
//		} else {
//			System.out.println(" Not Successfully Loged in and Is Not in CheckOut OverView Page");
//
//		}
	    
	    WebElement finish = page3.getFinish();
	    finish .click();
	    
	    Thread.sleep(3000);
	    
//	    if (finish.isDisplayed()) {
//
//			System.out.println(" Your Order Has Been Dispatched");
//
//		} else {
//			System.out.println(" Your Order Has Not Been Dispatched");
//
//		}
	    
	    WebElement backBtn = page3.getBackBtn();
	    backBtn .click();
	    
	    Thread.sleep(3000);
	   
	    
	   
//	   if (backBtn.isDisplayed()) {
//
//			System.out.println("User Successfully Loged in and Is in Search Hotel Page");
//
//		} else {
//			System.out.println("User Not Successfully Loged in and Not in Search Hotel Page");
//
//		}
	   
	   WebElement homeBtn = page3.getHomeBtn();
	    homeBtn .click();
	   
	   WebElement logout = page3.getLogOut();
	    logout.click();

//	    if (logout.isDisplayed()) {
//
//			System.out.println("User Successfully Loged Out");
//
//		} else {
//			System.out.println("User Not Successfully Loged Out");
//
//		}
	}
private void Tco1() {
	System.out.println(1234);
}

		

	}




