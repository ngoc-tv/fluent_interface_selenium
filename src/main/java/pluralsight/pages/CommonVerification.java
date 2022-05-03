package pluralsight.pages;

import static org.junit.Assert.assertTrue;
import static pluralsight.DriverFactory.getChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonVerification {
	protected WebDriver driver = getChromeDriver();
	
	private CommonVerification() {
		//hide it
	}
	
	public static CommonVerification getCommonVerification() {
		return new CommonVerification();
	}
	
	public CommonVerification verifyIsDisplayed(By element) {
		assertTrue(driver.findElement(element).isDisplayed());
		return this;
	}
	
	public CommonVerification verifyIsNotDisplayed(By element) {
		//your code
		return this;
	}
}
