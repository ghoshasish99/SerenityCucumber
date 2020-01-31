package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class CommonObjects extends PageObject {

	@FindBy(xpath = "/html/body/div/div/div/form/fieldset/label[1]/input")
	WebElement FirstName;
	
	@FindBy(xpath = "/html/body/div/div/div/form/fieldset/label[2]/input")
	WebElement LastName;
	
	@FindBy(xpath = "/html/body/div/div/div/form/fieldset/label[3]/input")
	WebElement StartDate;
	
	@FindBy(xpath = "/html/body/div/div/div/form/fieldset/label[4]/input")
	WebElement Email;
	
	@FindBy(id = "employee-list")
	WebElement UserList;
	
    public WebElement userToBeOperatedOn(String fname)
    {
    	return find(By.xpath("//*[@id=\"employee-list\"]/li[contains(text(),'"+fname+"')]"));
    }
}
