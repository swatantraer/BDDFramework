package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface IBasePage {

	public void navigateToUrl(String url);

	public WebElement waitForElement(By locator, int timeout);

	public void clickOn(By locator);

	public void inputText(By locator, String text);

	public void selectByText(By locator, String text);

	public void selectByIndex(By locator, int index);

	public void selectByValue(By locator, String value);

	public boolean isElementDisplayed(By locator);
}
