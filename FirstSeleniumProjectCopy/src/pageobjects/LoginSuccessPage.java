package pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage1;

public class LoginSuccessPage extends BasePage1{
	
	public LoginSuccessPage (WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean verifyLogiInIsSuccessful (String value) {
		verifyMessageIsDisplayed ("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3", "Login Successfully");
		System.out.println("Landed Successful Login Page...");
		return false;
	}
	
}
