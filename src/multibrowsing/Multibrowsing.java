package multibrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Multibrowsing {
	@Parameters("browser_name")
	@Test
	public void TC1(String browsername) {
		WebDriver driver=null;
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\Automation Testing\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get("https://web.whatsapp.com/");
	}
	

}
