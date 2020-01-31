package pageobject;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class Logout extends PageObject {

	@FindBy(xpath = "/html/body/div/header/div/p[1]")
	WebElement LogoutButton;
	
	public void logout() throws InterruptedException {
		LogoutButton.click();
		Thread.sleep(5000);
	}
	
}