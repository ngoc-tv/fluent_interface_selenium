package pluralsight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;;

public class BasicTestClass {

	static WebDriver driver;
	WebDriverWait wait;
	
	@BeforeSuite
	public void startUpBrowser() {
		
		driver = getChromeDriver();
		driver.manage().timeouts()
		.implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		wait = getWebDriverWait();
	}
	
	@BeforeMethod
	public void goToHome() {
		driver.get("https://www.pluralsight.com/");
	}
	
	@AfterSuite(alwaysRun = true)
	public static void closeBrowser() {
		driver.close();
	}
}
