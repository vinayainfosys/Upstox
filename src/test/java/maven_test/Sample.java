package maven_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://termlife.policybazaar.com/prequotes?pb_source=google_brand&pb_medium=ppc&pb_term=Policy%20bazaar&pb_campaign=Policy_Bazaar00Brand&gclid=CjwKCAiA9qKbBhAzEiwAS4yeDbXJbwaDC72p3FZvq_WD6auAWLeyfv4FBqVzTdb5LbswgY1TyuzNixoCoVIQAvD_BwE&pb_content=home_v11");
		
	}

}
