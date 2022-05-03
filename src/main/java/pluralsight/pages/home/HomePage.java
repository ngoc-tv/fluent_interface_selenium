package pluralsight.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pluralsight.pages.search.SearchActController;
import pluralsight.pages.search.SearchVerifyController;

import static pluralsight.DriverFactory.getChromeDriver;

public class HomePage {
	
	private HomeActController act;
	private HomeVerifyController verify;

	public HomeActController act() {
		return act;
	}
	
	public HomeVerifyController verify() {
		return verify;
	}
	
	public HomePage(HomeActController act, HomeVerifyController verify) {
		this.act = act;
		this.verify = verify;
	}
	
	private HomePage() {
		//hide it
	}
	public static HomePage getHomePage() {
		return new HomePage(new HomeActController(),
							new HomeVerifyController());
	}
	
	
	
}
