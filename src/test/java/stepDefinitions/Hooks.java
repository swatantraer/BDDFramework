package stepDefinitions;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	public static WebDriver Webdriver;

	@SuppressWarnings("deprecation")
	@Before()
	public void testStart() throws Throwable {
		WebDriverManager.chromedriver().setup();
		Webdriver = new ChromeDriver();
		Webdriver.manage().window().maximize();
		Webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After()
	public void endTest(Scenario scenario) throws Throwable {
		takescreen(scenario);
		Webdriver.close();
		Webdriver.quit();
	}

	@AfterStep
	public static void tearDown(Scenario scenario) {

	}

	public WebDriver getWebDriver() {
		return Webdriver;
	}

	public void takescreen(Scenario scenario) throws AWTException, IOException {
		final byte[] screenshot = ((TakesScreenshot) Webdriver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
	}

}
