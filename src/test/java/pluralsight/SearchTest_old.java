package pluralsight;

import pluralsight.pages.CoursePage;
import pluralsight.pages.HomePage;
import pluralsight.pages.CommonVerification;

import static pluralsight.pages.HomePage.*;
import static pluralsight.pages.CoursePage.*;
import static pluralsight.pages.CommonVerification.*;
import pluralsight.pages.Role;
import pluralsight.pages.SearchPage;

import static pluralsight.pages.SearchPage.*;

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
		home.search("java");
		search.filterBySkillLevel(SkillLevel.BEGINNER)
				.filterByRole(Role.SOFTWARE_DEVELOPMENT)
				.selectTabCourse(Tab.COURSES)
				.selectCourse("abc");
		
		course.verifyIsDisplayed(freeTrialButton())
				.verifyIsDisplayed(coursePreviewButton());
		//OR
		common.verifyIsDisplayed(freeTrialButton())
				.verifyIsDisplayed(coursePreviewButton());
	
	}	
}
