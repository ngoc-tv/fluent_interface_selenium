package pluralsight.pages.search;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.auto.common.Visibility;

public class SearchPage {
	
	private SearchActController act;
	private SearchVerifyController verify;
	
	public SearchActController act() {
		return act;
	}
	
	public SearchVerifyController verify() {
		return verify;
	}
	
	public SearchPage(SearchActController act, SearchVerifyController verify) {
		this.act = act;
		this.verify = verify;
	}
	
	private SearchPage() {
		//hide it
	}
	
	public static SearchPage getSearchPage() {
		return new SearchPage(new SearchActController(), 
								new SearchVerifyController());
	}

}
