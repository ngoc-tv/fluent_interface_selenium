package pluralsight.pages;

import static org.junit.Assert.assertTrue;
import static pluralsight.DriverFactory.getChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbstractPage {
	protected WebDriver driver = getChromeDriver();
	
	public AbstractPage verifyIsDisplayed(By element) {
		assertTrue(driver.findElement(element).isDisplayed());
		return this;
	}
}
