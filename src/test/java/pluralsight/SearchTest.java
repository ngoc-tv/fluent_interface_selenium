package pluralsight;

import pluralsight.pages.course.CoursePage;
import pluralsight.pages.home.HomePage;
import pluralsight.pages.CommonVerification;

import static pluralsight.pages.home.HomePage.*;
import static pluralsight.pages.course.CoursePage.*;
import static pluralsight.pages.CommonVerification.*;
import pluralsight.pages.Role;
import pluralsight.pages.search.SearchPage;

import static pluralsight.pages.search.SearchPage.*;

import org.testng.annotations.Test;

import pluralsight.pages.CommonVerification;
import pluralsight.pages.SkillLevel;
import pluralsight.pages.Tab;

public class SearchTest extends BasicTestClass {
	HomePage home = getHomePage();
	SearchPage search = getSearchPage();
	CoursePage course = getCoursePage();
	CommonVerification common = getCommonVerification();
	
	@Test
	public void basicFilterByTest() {
		home.act()
				.search("java");
		search.act()
				.filterBySkillLevel(SkillLevel.BEGINNER)
				.filterByRole(Role.SOFTWARE_DEVELOPMENT)
				.selectTabCourse(Tab.COURSES)
				.selectCourse("abc");
		
		course.verify()
				.verifyIsDisplayed(freeTrialButton())
				.verifyIsDisplayed(coursePreviewButton());
		//OR
		/*common.verifyIsDisplayed(freeTrialButton())
				.verifyIsDisplayed(coursePreviewButton());*/
	
	}	
}
