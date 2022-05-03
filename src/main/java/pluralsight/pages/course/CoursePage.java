package pluralsight.pages.course;

import static pluralsight.DriverFactory.getChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pluralsight.pages.home.HomeActController;
import pluralsight.pages.home.HomeVerifyController;

import static org.junit.Assert.*;


public class CoursePage {
	
	private CourseActController act;
	private CourseVerifyController verify;

	public CourseActController act() {
		return act;
	}
	
	public CourseVerifyController verify() {
		return verify;
	}
	
	public CoursePage(CourseActController act, CourseVerifyController verify) {
		this.act = act;
		this.verify = verify;
	}
	private CoursePage() {
		//hide it
	}
	public static CoursePage getCoursePage() {
		return new CoursePage(new CourseActController(),
								new CourseVerifyController());
	}
	public static By freeTrialButton() {
		return By.xpath("");
	}
	
	public static By coursePreviewButton() {
		return By.xpath("");
	}
	
	public static By someOtherElement() {
		return By.xpath("");
	}
}
