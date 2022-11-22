package actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//step1-declaration
		@FindBy(xpath="//input[@name=\"username\"]")private WebElement UI;
		@FindBy(xpath="")private WebElement pwd;
		@FindBy(xpath="")private WebElement btn;
		
		//step2-initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//step3-Implementation
		public void enterUI(String user) {
			UI.sendKeys(user);
		}
		public void enterpwd(String password) {
			pwd.sendKeys(password);
		}
		public void clickbtn() {
			btn.click();
		}


}
