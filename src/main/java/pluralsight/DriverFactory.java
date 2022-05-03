package pluralsight;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {
	static WebDriver driver;
	static WebDriverWait wait;
	
	private DriverFactory() {
		//prevent instantiation
	}
	
	public static WebDriver getChromeDriver() {
		
		if(driver == null) {
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public static WebDriverWait getWebDriverWait() {
		
		if(wait == null) {
			wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		}
		return wait;
	}
}
