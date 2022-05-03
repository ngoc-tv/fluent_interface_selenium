package pluralsight.pages.course;

import static org.junit.Assert.assertTrue;
import static pluralsight.DriverFactory.getChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CourseVerifyController {

	private WebDriver driver = getChromeDriver();

	public CourseVerifyController verifyIsDisplayed(By element) {
		assertTrue(driver.findElement(element).isDisplayed());
		return this;
	}

}
