package pluralsight.pages.search;

import static pluralsight.DriverFactory.getChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchGetController {
	
	private WebDriver driver = getChromeDriver();
	
	public List<String> course(){
		List<WebElement> courses = driver.findElements(
				By.xpath("//div[@id='search-results-category-target']//div[@class='search-result__title']"));
	}
}
