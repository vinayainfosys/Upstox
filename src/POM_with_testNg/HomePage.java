package POM_with_testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//step1-declaration
	
	@FindBy(xpath="//title[text()=\"actiTIME -  Enter Time-Track\"]")private WebElement title;
	
	//step2-initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//step3-implementation
	public String verifyTitle() {
		String actText=title.getText();
		return actText;
	} 

}
