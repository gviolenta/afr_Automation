package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
        this.driver = driver;
    }
	
	public void goToBottomOfPage() {
		JavascriptExecutor js = (JavascriptExecutor)this.driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
