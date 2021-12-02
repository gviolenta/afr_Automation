package tests;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Constants;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void beforeAll() {
		//WebDriver Setup
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + Constants.CHROMEDRIVER_PATH);
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
	}

	@After
	public void afterAll(Scenario scenario) {
		// Take a screenshot...
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		// embed it in the report.
		scenario.attach(screenshot, "image/png", "Screenshot"); 
		//close WebDriver
		driver.quit();
	}

}
