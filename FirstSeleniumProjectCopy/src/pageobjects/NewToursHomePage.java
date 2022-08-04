package pageobjects;

import org.openqa.selenium.WebDriver;

import common.BasePage1;

public class NewToursHomePage extends BasePage1{
	

		public NewToursHomePage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		
		public void verifyHomePage (boolean b) {
			verifyPageDisplayedIsCorrect ("//img[@src='images/featured_destination.gif']");
			System.out.println("Landed on Mercury Tours Home Page...");
		}


}
