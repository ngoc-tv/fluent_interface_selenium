package pluralsight.pages.home;

import static pluralsight.DriverFactory.getChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeActController {
	private WebDriver driver = getChromeDriver();
	
	public HomeActController search(String value) {
		
		WebElement search= driver.findElement(By.id("searchMobile"));
		search.click();
		search.sendKeys(value);
		search.sendKeys(Keys.ENTER);
		return this;
	}
}
