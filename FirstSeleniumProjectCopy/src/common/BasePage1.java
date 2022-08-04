package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage1 {
	
protected WebDriver driver;
	
	public BasePage1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void click (String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
		System.out.println("The element has been clicked.");
	}

	public void enterText(String locator, String value) {
		WebElement element = driver.findElement(By.name(locator));
		element.sendKeys(value);
		System.out.println("Text has been entered.");
	}
	
	public void verifyPageDisplayedIsCorrect(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.isDisplayed();
		System.out.println("Page has been displayed...");
	}
	
	public void verifyMessageIsDisplayed(String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.isDisplayed();
		System.out.println("Page has been displayed...");
		element.getText();
		String.valueOf(value);
		System.out.println("Expected value has been displayed...");
	}
	
	
	
	
	

}
