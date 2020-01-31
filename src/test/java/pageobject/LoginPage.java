package pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.*;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://cafetownsend-angular-rails.herokuapp.com/login")
public class LoginPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/label[1]/input")
	WebElement username;
	
    @FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/label[2]/input")
	WebElement password;
    
    @FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/button")
	WebElement loginbutton;
    
    @FindBy(id = "greetings")
	WebElement greetings;
	
	public void login(String username, String password)
	{
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		this.loginbutton.click();
	}
	public void loginIsSuccessful()
	{
		assertTrue(this.greetings.isDisplayed());
	}
	
}
