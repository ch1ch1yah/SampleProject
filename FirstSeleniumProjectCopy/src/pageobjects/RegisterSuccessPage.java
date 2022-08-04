package pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage1;

public class RegisterSuccessPage extends BasePage1{
	
	public RegisterSuccessPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	public void verifyRegistrationIsSuccesful(String value) {
		verifyMessageIsDisplayed ("//html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font", "\r\n" + 
				"\r\n" + 
				" Thank you for registering. \r\n" + 
				"        You may now ");
		System.out.println("Landed on Registration Success Page...");
	}
	
	

}
