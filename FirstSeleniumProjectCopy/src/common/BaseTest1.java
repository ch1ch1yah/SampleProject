package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest1 {
	
public static WebDriver driver;
	
	public void openBrowser() {
		driver = new ChromeDriver();
		System.out.println("Test is running in Chrome");
	}
	
	public void openURL(String url) {
		driver.get(url);
		System.out.println("Opened the url.");
	}
	
	public void endTest() {
		driver.close();
		driver.quit();
		System.out.println("The test is finished.");
	}

}
