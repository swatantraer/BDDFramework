package pages;

import repository.ObjectHomePage;
import utils.BasePage;

public class HomePage extends BasePage {

	public void addNewUser(String userName, String fName, String comName, String role, String email, String phone) {
		clickOn(ObjectHomePage.addUser);
		inputText(ObjectHomePage.firstName, fName);
		inputText(ObjectHomePage.lastName, "lastName");
		inputText(ObjectHomePage.userName, userName);
		inputText(ObjectHomePage.password, "uxuserpassword");
		clickOn(ObjectHomePage.companyNameByLabel(comName));
		selectByText(ObjectHomePage.roleId, role);
		inputText(ObjectHomePage.email, email);
		inputText(ObjectHomePage.phone, phone);
		clickOn(ObjectHomePage.saveButton);
	}

	public void deleteUser(String userName) {
		clickOn(ObjectHomePage.deleteUserByText(userName));
		clickOn(ObjectHomePage.okButton);
	}
}
