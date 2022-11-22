package POM_with_testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1Page {
	
	//step1-declaration
	
	@FindBy(xpath="//input[@name=\"username\"]") private WebElement user;
	@FindBy(xpath="//input[@name=\"pwd\"]") private WebElement pwd;
	@FindBy(xpath="//div[text()=\"Login \"]") private WebElement submit;
	
	//step2-initialization
	
	public Login1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//step3-Implementation
	
	public void enteruser(String username) {
		user.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		pwd.sendKeys(password);
	}
	
	public void clickbtn() {
		submit.click();
	}

}
