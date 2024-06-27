package utils;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.Hooks;

public class BasePage implements IBasePage {
	protected WebDriver Webdriver;
	protected int timeout = 20;

	public BasePage() {
		this.Webdriver = Hooks.Webdriver;
	}

	/**
	 * To navigate the url
	 * 
	 * @param url
	 */
	public void navigateToUrl(String url) {
		Webdriver.navigate().to(url);
	}

	/**
	 * To wait for the element
	 * 
	 * @param locator
	 */
	public WebElement waitForElement(By by, int timeout) {
		WebDriverWait wait = new WebDriverWait(Webdriver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	/**
	 * To wait and click on the element
	 * 
	 * @param locator
	 */
	public void clickOn(By locator) {
		waitForElement(locator, timeout).click();
	}

	/**
	 * To enter the value into the text input box
	 * 
	 * @param locator, text
	 */
	public void inputText(By locator, String text) {
		Webdriver.findElement(locator).sendKeys(text);
	}

	/**
	 * To select the value by visible text
	 * 
	 * @param locator, visibleText
	 */
	public void selectByText(By locator, String visibleText) {
		Select objSelect = new Select(Webdriver.findElement(locator));
		objSelect.selectByVisibleText(visibleText);
	}

	/**
	 * To select the value by index
	 * 
	 * @param locator, index
	 */
	public void selectByIndex(By locator, int index) {
		Select objSelect = new Select(Webdriver.findElement(locator));
		objSelect.selectByIndex(index);
	}

	/**
	 * To select the value
	 * 
	 * @param locator, value
	 */
	public void selectByValue(By locator, String value) {
		Select objSelect = new Select(Webdriver.findElement(locator));
		objSelect.selectByValue(value);
	}

	/**
	 * To check the element is display on the page
	 * 
	 * @param locator
	 */
	public boolean isElementDisplayed(By locator) {
		try {
			waitForElement(locator, timeout).isDisplayed();
			return true;
		} catch (Exception ex) {
		}
		return false;
	}

	/**
	 * Verify WebElement present on the page
	 * 
	 * @param element
	 */
	public void verifyElementPresent(By locator) {
		Assert.assertTrue(locator.toString() + " is not present", isElementDisplayed(locator));
	}

	/**
	 * Verify WebElement not present on the page
	 * 
	 * @param element
	 */
	public void verifyElementNotPresent(By locator) {
		Assert.assertFalse(locator.toString() + " is present", isElementDisplayed(locator));
	}

	/**
	 * To verify the title of the browser
	 * 
	 * @param title
	 */
	public void verifyTitle(String title) {
		System.out.println(Webdriver.getTitle());
		assertEquals(title, Webdriver.getTitle());
	}

	protected WebElement getElement(WebElement element) {
		return element;

	}

}
