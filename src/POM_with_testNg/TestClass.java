package POM_with_testNg;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
	Login1Page lp;
	HomePage hp;
	org.apache.poi.ss.usermodel.Sheet sh;
	WebDriver driver;
	@BeforeClass
	public void openBrowser() throws Throwable{
		FileInputStream fis=new FileInputStream("D:\\Velocity\\Automation Testing\\actitime_credentials.xlsx");
		sh= WorkbookFactory.create(fis).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//all objects
		lp=new Login1Page(driver);
		hp=new HomePage(driver);
	}
	
	@BeforeMethod
	public void openApp(){
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		lp.enteruser(username);
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		lp.enterpassword(password);
		lp.clickbtn();
	}
	
	@Test
	public void verifyText() {
		Reporter.log("running verify text", true);
		String expText=sh.getRow(0).getCell(2).getStringCellValue();
		String actText=hp.verifyTitle();
		Assert.assertEquals(expText, actText,"failed both are different");
	}
	

}
