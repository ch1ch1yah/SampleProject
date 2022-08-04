package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import common.BasePage1;

public class LoginPage extends BasePage1{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickSignIn (){
		click("//a[@href='login.php']");
		System.out.println("Sign-in link has been clicked...");
	}
	
	public void verifySignOnPage(boolean b) {
		verifyPageDisplayedIsCorrect ("//img[@src='images/mast_signon.gif']");
		System.out.println("Landed on Sign On Page...");
	}
	
	public void logIn(String value) throws InterruptedException{
		enterText ("userName", "cess@email.com");
		System.out.println("User Name has been entered");
		
		enterText ("password", "samplepw");
		System.out.println("Password has been entered");
		
		Thread.sleep(2000);
		click("//input[@name='submit']");
		System.out.println("Submit button has been clicked...");
	}
	
	public void dismissPopUp(){
		/*Alert alert = driver.switchTo().alert();
		alert.accept();*/
		click("//div[@id='dismiss-button']");
		System.out.println("Pop-up has been dismissed...");
	}
}
