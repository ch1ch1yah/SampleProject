package pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage1;

public class RegisterPage extends BasePage1{
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
    public void clickRegisterLink (){
		click("//a[@href='register.php']");
		System.out.println("Clicked Register Link...");
	}

	public void verifyRegistrationIsDisplayed (boolean b) {
		verifyPageDisplayedIsCorrect ("//img[@src='images/mast_register.gif']");
		System.out.println("Landed on Registration Page...");
	}
	
	public void inputDetails(String value){
			enterText ("firstName", "Princess");
			System.out.println("First Name has been entered");
			
			enterText ("lastName", "Faustino");
			System.out.println("Last Name has been entered");
			
			enterText ("phone", "123456789");
			System.out.println("Phone number has been entered");

			enterText ("userName", "cess@email.com");
			System.out.println("Email has been entered");
			
			enterText ("address1", "ABC St., Brgy. 1");
			System.out.println("Address has been entered");
			
			enterText ("city", "Madaluyong");
			System.out.println("City has been entered");
			
			enterText ("state", "NCR");
			System.out.println("State/Province has been entered");
			
			enterText ("postalCode", "1400");
			System.out.println("Postal code has been entered");
			
			enterText ("country", "PHILIPPINES");
			System.out.println("Country has been entered");
			
			enterText ("email", "cess@email.com");
			System.out.println("Email has been entered");
			
			enterText ("password", "samplepw");
			System.out.println("Password has been entered");
			
			enterText ("confirmPassword", "samplepw");
			System.out.println("Password has been confirmed");
	}
	
	 public void clickSubmitButton (){
			click("//input[@name='submit']");
			System.out.println("Submit button has been clicked...");
		}

}
