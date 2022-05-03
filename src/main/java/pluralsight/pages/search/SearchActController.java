package pluralsight.pages.search;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pluralsight.pages.Role;
import pluralsight.pages.SkillLevel;
import pluralsight.pages.Tab;

public class SearchActController {
	WebDriver driver = getChromeDriver();
	WebDriverWait wait = getWebDriverWait();
	
	public SearchActController filterBySkillLevel(SkillLevel value) {
		//driver.findElement(By.xpath());
			//.click();
		By skillLevel = By.xpath("abc"+value+"')]");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(skillLevel));
		driver.findElement(skillLevel)
			.click();
		//explicitwait();
		return this;
	}
	
	public SearchActController filterByRole(Role role) {
		
		return this;
	}
	
	public SearchActController selectTabCourse(Tab tab) {
		//driver.findElement(By.xpath()+tab+"')]"))
			//.click();
		return this;
	}
	
	public void selectCourse(String courseName) {
		//driver.findElement(By.xpath())
			//.click();
	
	}
}
