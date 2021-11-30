package tests;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArticlePage;
import utilities.Constants;

public class SubscriptionPromptTests {

	private ArticlePage articlePage;

	@Given("user go to South China Sea article page on AFR site")
	public void user_go_to_south_china_sea_article_page_on_afr_site() {
			
		Hooks.driver.get(Constants.ARTICLE_URL);
		articlePage = new ArticlePage(Hooks.driver);
	}
	
		@When("user scroll at the bottom of the page")
	public void user_scroll_at_the_bottom_of_the_page() throws Exception {
		articlePage.goToBottomOfPage();
		Assert.assertEquals(true, articlePage.verifyFooterIsDisplayed(), "verify subscription prompt appears");
		
	}

	@Then("the subscription prompt appears at the page")
	public void the_subscription_prompt_appears_on_the_page() throws Exception {
		Assert.assertEquals(true, articlePage.checkSubscriptionPromptIsDisplayed(), "verify subscription prompt appears");
	}

	@Then("verify that the subscription prompt disappears on the page after {int} seconds")
	public void verify_that_the_subscription_prompt_disappears_on_the_page_after_seconds(int int1) throws Exception {
		Assert.assertEquals(true, articlePage.verifySubscriptionPromptDisappears(int1),"verify subscription prompt disappears");
	}

}
