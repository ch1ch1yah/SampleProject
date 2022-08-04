package test;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

import common.BaseTest1;
import pageobjects.LoginPage;
import pageobjects.LoginSuccessPage;
import pageobjects.NewToursHomePage;
import pageobjects.RegisterPage;
import pageobjects.RegisterSuccessPage;

public class MercuryToursTest extends BaseTest1 {
	
	@Test
	public void MercuryToursTest() throws Exception{
		
		openBrowser();
		openURL("https://demo.guru99.com/test/newtours/");
		
		//Mercury Tours Home Page
		NewToursHomePage homepage = new NewToursHomePage(driver);
		
		homepage.verifyHomePage(true);
		Thread.sleep(3000);
		
		//Registration
		RegisterPage registerpage = new RegisterPage(driver);
		
		registerpage.clickRegisterLink();
		registerpage.verifyRegistrationIsDisplayed(true);	
		
		String value = null;
		registerpage.inputDetails(value);
		registerpage.clickSubmitButton();
		
		//Registration Success
		RegisterSuccessPage registersuccess = new RegisterSuccessPage(driver);
		
		registersuccess.verifyRegistrationIsSuccesful(value);
		assertTrue(true);
		
		//Login Page
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.clickSignIn();
		Thread.sleep(5000);
		loginpage.verifySignOnPage(true);
		loginpage.logIn(value);
		Thread.sleep(3000);
		
		//Login Success Page
		LoginSuccessPage loginsuccess = new LoginSuccessPage(driver);
		
		loginsuccess.verifyLogiInIsSuccessful(value);
		assertTrue(true);
				
		endTest();
		//sample
		
	}

}
