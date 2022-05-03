package pluralsight.pages.search;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.auto.common.Visibility;

public class SearchPage {
	
	WebDriver driver = getChromeDriver();
	WebDriverWait wait = getWebDriverWait();
	
	private SearchPage() {
		//hide it
	}
	
	public static SearchPage getSearchPage() {
		return new SearchPage();
	}
	
	public SearchPage filterBySkillLevel(SkillLevel value) {
		//driver.findElement(By.xpath());
			//.click();
		By skillLevel = By.xpath("abc"+value+"')]");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(skillLevel));
		driver.findElement(skillLevel)
			.click();
		//explicitwait();
		return this;
	}
	
	public SearchPage filterByRole(Role role) {
		
		return this;
	}
	
	public SearchPage selectTabCourse(Tab tab) {
		//driver.findElement(By.xpath()+tab+"')]"))
			//.click();
		return this;
	}
	
	public void selectCourse(String courseName) {
		//driver.findElement(By.xpath())
			//.click();
	
	}
}
