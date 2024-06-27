package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.Object_HomePage;
import pages.HomePage;
import utils.BasePage;

public class StepDefinition extends BasePage {
	HomePage homePage = new HomePage();

	@When("I open the URL {string}")
	public void iOpenTheURL(String url) {
		navigateToUrl(url);
	}

	@Then("The page title should be {string}")
	public void thePageTitleShouldBe(String title) {
		verifyTitle(title);
	}

	@Then("I verify the Add User link displayed")
	public void iVerifyTheAddUserLink() {
		verifyElementPresent(Object_HomePage.addUser);
	}

	@When("I add new user with name {string}")
	public void iAddNewUserWithName(String userName) {
		homePage.addNewUser(userName);
	}

	@Then("I verify the new user {string} is added")
	public void iVerifyTheNewUserAdded(String userName) {
		verifyElementPresent(Object_HomePage.rowWithUserNameAndRole(userName, "Customer"));
	}

	@When("I delete user by name {string}")
	public void iDeleteUserByName(String userName) {
		homePage.deleteUser(userName);
	}

	@Then("I verify the user {string} is deleted")
	public void iVerifyUserIsDeleted(String userName) {
		verifyElementNotPresent(Object_HomePage.rowWithUserNameAndRole(userName, "Customer"));
	}

}
