package pages;

import objectRepository.Object_HomePage;
import utils.BasePage;

public class HomePage extends BasePage {

	public void addNewUser(String userName) {
		clickOn(Object_HomePage.addUser);
		inputText(Object_HomePage.firstName, "firstName");
		inputText(Object_HomePage.lastName, "lastName");
		inputText(Object_HomePage.userName, userName);
		inputText(Object_HomePage.password, "uxuserpassword");
		clickOn(Object_HomePage.companyNameByLabel("Company AAA"));
		selectByText(Object_HomePage.roleId, "Customer");
		inputText(Object_HomePage.email, "uxuser@gmail.com");
		inputText(Object_HomePage.phone, "1100119911");
		clickOn(Object_HomePage.saveButton);
	}

	public void deleteUser(String userName) {
		clickOn(Object_HomePage.deleteUserByText(userName));
		clickOn(Object_HomePage.okButton);
	}
}
