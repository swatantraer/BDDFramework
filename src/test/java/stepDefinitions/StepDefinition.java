package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import repository.ObjectHomePage;
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
		verifyElementPresent(ObjectHomePage.addUser);
	}

	@When("I add new user with name {string} fName {string} companyName {string} role {string} email {string} phone {string}")
	public void i_add_new_user_with_name_f_name_company_name_role_email_phone(String userName, String fName,
			String comName, String role, String email, String phone) {
		homePage.addNewUser(userName, fName, comName, role, email, phone);
	}

	@Then("I verify the new user {string} is added")
	public void iVerifyTheNewUserAdded(String userName) {
		verifyElementPresent(ObjectHomePage.rowWithUserNameAndRole(userName, "Customer"));
	}

	@When("I delete user by name {string}")
	public void iDeleteUserByName(String userName) {
		homePage.deleteUser(userName);
	}

	@Then("I verify the user {string} is deleted")
	public void iVerifyUserIsDeleted(String userName) {
		verifyElementNotPresent(ObjectHomePage.rowWithUserNameAndRole(userName, "Customer"));
	}

}
