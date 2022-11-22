package parallel_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class C {
	@Test
	public void tc1() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
	}

}
