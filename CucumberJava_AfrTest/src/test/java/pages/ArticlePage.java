package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArticlePage extends BasePage{

	public ArticlePage(WebDriver driver) {
		super(driver);
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[contains(@data-testid,'SubscriptionPrompt')]")
	WebElement subsPrompt; 
	
	@FindBy(id="footer")
	WebElement footer;

	public boolean checkSubscriptionPromptIsDisplayed() throws Exception {
		if (!subsPrompt.isDisplayed()) {
			throw new Exception("Subscription prompt is not displayed");
		}
		return true;
	}

	public boolean verifySubscriptionPromptDisappears(int seconds) throws Exception {
		if(!checkSubscriptionPromptIsDisplayed()) {
			throw new Exception("Subscription prompt is never displayed");
		}		
		return new WebDriverWait(super.driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.attributeContains(subsPrompt, "data-testid","false"));
	}
	
	public boolean verifyFooterIsDisplayed() throws Exception {
		if(!footer.isDisplayed()) {
			throw new Exception("Not able to scroll at the bottom of the page");
		}		
		return true;
	}
}
