package objectRepository;

import org.openqa.selenium.By;

public class Object_HomePage {
	public static By addUser = By.xpath("//button[@type='add']");
	public static By searchInput = By.xpath("//input[@type='text']");
	public static By search = By.xpath("//input[@type='text']");
	public static By firstName = By.xpath("//input[@name='FirstName']");
	public static By lastName = By.xpath("//input[@name='LastName']");
	public static By userName = By.xpath("//input[@name='UserName']");
	public static By password = By.xpath("//input[@name='Password']");
	public static By companyName = By.xpath("//label[text()='Company AAA']/input");
	public static By roleId = By.xpath("//select[@name='RoleId']");
	public static By email = By.xpath("//input[@name='Email']");
	public static By phone = By.xpath("//input[@name='Mobilephone']");
	public static By saveButton = By.xpath("//button[contains(@class, 'btn-success')]");
	public static By okButton = By.xpath("//button[text()='OK']");

	public static By companyNameByLabel(String text) {
		return By.xpath("//label[text()='" + text + "']/input");
	}

	public static By rowWithUserNameAndRole(String text1, String text2) {
		return By.xpath("//tr[td[contains(text(),'" + text1 + "')] and td[contains(text(), '" + text2 + "')]]");
	}

	public static By deleteUserByText(String text) {
		return By.xpath("//tr[td[text()='" + text + "']]/td/button/*[contains(@class, 'icon-remove')]");
	}

}
